class Problem3 {
    public Problem3() {
    }

    /**
     *  Project Euler Problem 3.
     *  Find the largest prime factor of the number 600851475143.
     *  @param  num          Max limit for finding largest prime factor.
     *  @return largestPrime Largest prime factor of the number.
     */
    public long findLargestPrimeFactor(final long num){
        long largestPrime = num;
        int factor = 2;
        int endCondition = (int) Math.pow(num, 0.5);
        // make sure no other factors besides itself.
        while (factor <= endCondition ) {
            if (largestPrime % factor == 0) {
                largestPrime /= factor;
                factor = 2;
            } else {
                factor += 1;
            }
            if (largestPrime <= factor) {
                break; 
            }
        }
        return largestPrime; 
    }

    public static void main(String[] args) {
        Problem3 problem = new Problem3();
        System.out.format("Largest prime factor is %d.\n", 
                            problem.findLargestPrimeFactor
                            (600_851_475_143L));
    }
}