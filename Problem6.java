/** 
 *  My solution for Project Euler Problem 6.
 *
 *  Sum square difference
 *  The sum of the squares of the first ten natural numbers is,
 *  12 + 22 + ... + 102 = 385
 *  The square of the sum of the first ten natural numbers is,
 *  (1 + 2 + ... + 10)2 = 552 = 3025
 *  Hence the difference between the sum of the squares of the first ten
 *  natural numbers and the square of the sum is 3025 − 385 = 2640.
 *  Find the difference between the sum of the squares of the first one 
 *  hundred natural numbers and the square of the sum.
 *
 *  @author     Aaron Sum
 *  @version    1.0, 2 Mar 2018
 */
class Problem6 {
    // Max limit is 304 since int is used.
    private int findSquareOfTheSum(int number) {
        return  (int) Math.pow(number * (number + 1) / 2, 2);
    }

    /**
     *  1^2 + 2^2 + ... + 10^2 = 
     *  (1+10)^2 - 2*1*10 + (2+9)^2 - 2*2*9 + ...
     */
    private int findSumOfSquares(int number) {
        int numberToMinus = 0;
        int firstNumber = 1;
        int lastNumber = number;
        while (firstNumber < lastNumber) {
            numberToMinus -= 2 * firstNumber * lastNumber;
            firstNumber++;
            lastNumber--;
        }
        return number / 2 * (int) Math.pow((number + 1), 2) 
               + numberToMinus;
    }

    public static void main(String[] args) {
        Problem6 problem = new Problem6();
        int number = 100;
        int answer = problem.findSquareOfTheSum(number) 
                     - problem.findSumOfSquares(number);
        System.out.format("The difference between the sum of square " +
                          "of the first one hundred natural numbers " +
                          "and the square of the sum is %d\n", answer);
    }
}