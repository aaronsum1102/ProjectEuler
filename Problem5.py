# constructs helper functions.
"""
Finding the all prime number less than or equal to the given number.

parameter: Natural integer number.
return a list of prime number.
"""
def sieve_of_eratosthenes(number):
    prime_list = list(range(2, number + 1))
    for i in range(2, number + 1):
        j = 2
        while i * j <= number:
            if (i * j) in prime_list:
                prime_list.remove(i * j)
            j += 1
    return prime_list

"""
Finding the greatest common divisor(GCD) of 2 numbers

parameter: two natural integer number.
return the GCD.
"""
def gcd(number1, number2):
    while number2:
        number1, number2 = number2, number1 % number2
    return number1

"""
Finding least common multiple(LCM) of two numbers.

parameter: two natural integer number.
return LCM
"""
def lcm(number1, number2):
    return (number1 * number2) / gcd(number1, number2)

"""
Project Euler Problem 5

2520 is the smallest number that can be divided by each of the numbers 
from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of 
the numbers from 1 to 20?
"""
if __name__ == "__main__":
    number = 20
    prime_factor_list = sieve_of_eratosthenes(number)
    smallest_number = 1
    for factor in prime_factor_list:
        smallest_number *= factor
    # find the lcm for the rest of the factors
    for i in range(4, number + 1):
        if i not in prime_factor_list:
            smallest_number = int(lcm(smallest_number, i))
    print("The smallest positive number that is evenly divisible by " + 
          "all number from 1 to 20 is %d." %smallest_number)