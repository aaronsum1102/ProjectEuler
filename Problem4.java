class Problem4 {
    private int factor1;
    private int factor2;
    private int largestPalindrome;

    public Problem4() {
        factor1 = 0;
        factor2 = 0;
        largestPalindrome = 0;
    }

    /**
     *  Project Euler Problem 4.
     *  Find the largest palindrome made from the product of two 3 
     *  digit numbers.
     *  @param number initial guess for first half of palindrome.
     */
    public void findLargerstFactor(int number) {
        boolean isfound = false;
        int palindrome = 0;
        int firstHalfNumber = number; 
        while (!isfound) {
            palindrome = getPalindrom(firstHalfNumber);
            for (int i = 999; i > 99; i--) {
                if (palindrome / i > 999 || i * i < palindrome){
                    break;
                } else if (palindrome % i == 0) {
                    isfound = true;
                    factor1 = i;
                    factor2 = palindrome / i;
                    largestPalindrome = palindrome;
                    break;
                }
            }
            firstHalfNumber--;
        }
    }

    /**
     *  Construct a palindrome by using the input number as the first 
     *  half of the palindrome.
     *  @param  number  Integer number to create a palindrome.
     *  @return reverse Palindrome based on the number given.
     */
    public int getPalindrom(final int number) {
        String numberString = Integer.toString(number);
        String reverse;
        reverse = new StringBuilder(numberString).reverse().toString();
        return Integer.parseInt(numberString + reverse);
    }

    /**
     *  Get value of first factor.
     *  @return factor1 First factor.
     */
    public int getFactor1() {
        return factor1;
    }

    /**
     *  Get value of second factor.
     *  @return factor2 Second factor.
     */
    public int getFactor2() {
        return factor2;
    }

    /**
     *  Get value of the largest palindrome found.
     *  @return largestPalindrome largest palindrome.
     */
    public int getLargestPalindrome() {
        return largestPalindrome;
    }

    public static void main(String[] args) {
        Problem4 problem = new Problem4();
        problem.findLargerstFactor(997); //999 * 999 is 998_001
        System.out.format("The larget palindrome of %d is made from %d "
                          + "and %d.\n", problem.getLargestPalindrome(),
                          problem.getFactor1(), problem.getFactor2());
    }

}
    
