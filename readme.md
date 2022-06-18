# fpp1h - Five Programming Problems in One Hour

While browsing the interwebs I found
this [article](https://linepole.wordpress.com/2015/06/02/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour/)
from 2015 with the following title: _"Five programming problems every Software Engineer should be able to solve in less
than 1 hour"_. <br>
This code is my attempt to do it in one hour.

### Problems:

1. Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and
   recursion.
2. Write a function that combines two lists by alternatingly taking elements. For example: given the two lists [a, b, c]
   and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].
3. Write a function that computes the list of the first 100 Fibonacci numbers. By definition, the first two numbers in
   the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two. As an example, here
   are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
4. Write a function that given a list of non negative integers, arranges them such that they form the largest possible
   number. For example, given [50, 2, 1, 9], the largest formed number is 95021.
5. Write a program that outputs all possibilities to put + or - or nothing between the numbers 1, 2, …, 9 (in this
   order) such that the result is always 100. For example: 1 + 2 + 34 – 5 + 67 – 8 + 9 = 100.

### Result:

Only finished 4 out of 5 problems. :worried:
Tried the last problem but didn't find a solution in time.

- Solution for problem 5 - https://github.com/rexim/five-programming-problems/blob/master/src/main/java/me/rexim/fiveproblems/Problem5.java

### How to run:

```shell
git clone https://github.com/mscode98/fpp1h.git
cd fpp1h
gradlew test
```
