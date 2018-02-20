class Problem2 {
    public Problem2() {
    }

    /**
     *  Project Euler Problem 2.
     *  Find sum of the even-valued Fibonacci terms whose values do not 
     *  exceed four million.
     *  @param  limitNumber Limit for maximum Fibonacci number allowed.
     *  @return sum         Sum of even-valued Fibonacci terms below 
     *                      limit.
     */
    public long findSumOfEvenFib(final int limitNumber) {
        // Partial of Fibonacci sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34,.
        // consider (1, 1, 2), (3, 5, 8), (13, 21, 34), ...
        int secondTerm = 1; // 2nd term
        int thirdTerm = 2; // 3rd term
        int previousOfSecondTerm = 0;
        long sum = 0;
        while (thirdTerm < limitNumber) {
            sum += thirdTerm;
            previousOfSecondTerm = secondTerm;
            secondTerm += thirdTerm * 2;
            thirdTerm = 2 * previousOfSecondTerm + 3 * thirdTerm;
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        System.out.println(problem.findSumOfEvenFib(4_000_000));
    }
}