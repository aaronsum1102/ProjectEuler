class Problem1 {
    public Problem1() {
    }

    /** 
     *  Project Euler Problem 1.
     *  Find the sum of all the multiples of 3 or 5 below 1000.
     *
     *  Example:
     *  If we list all the natural numbers below 10 that are multiples 
     *  of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 
     *  23. 
     *
     *  @param  number Natural number of 1000.
     *  @return sum    Sum of multiples of 3 or 5 below number.
     */
    public int sumOfAllMultiples(final int number) {
        int maxNumberDividedBy3 = (number - 1) / 3;
        int maxNumberDividedBy5 = (number - 1) / 5;
        int maxNumberDividedBy15 = (number - 1) / 15;
        int sumOfMultipler3 = (maxNumberDividedBy3) *
                              (maxNumberDividedBy3 + 1) / 2 * 3;
        int sumOfMultipler5 = maxNumberDividedBy5 *
                              (maxNumberDividedBy5 + 1) / 2 * 5;
        int sumOfMultipler15 = maxNumberDividedBy15 *
                              (maxNumberDividedBy15 + 1) / 2 * 15;
        int sum = sumOfMultipler3 + sumOfMultipler5 - sumOfMultipler15;
        return sum;
    }

    public static void main(String[] args) {
        Problem1 problem = new Problem1();
        System.out.format("Sum of all the multiples of 3 or 5 below " +
                          "1000 is %d.\n", 
                          problem.sumOfAllMultiples(1000));
  }
}
