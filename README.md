## Program

I'm not good at writing math, but the idea is to:  
Maximize y in c <= ax -by, where c is the score you need, a is the points earned per correct answer, b is the points lost per wrong answer, x is the number of correct answers and y is the number of incorrect answers, y E N, x A N [|c/a|, number of questions of the test - y].  
x range is not exactly right. Either way, the lowest x is the lowest one such that if you answer exactly x questions and have them all right you pass. The highest one could be just the number of questions, although I've tried to be a little more specific. The program would be useful even if x wasn't well defined.  
The program doesn't define y or x as E N, so it only works for sure if correct answers add and mistakes subtract. This defines its purpose.

I've added a program to get the score you need in an exam, assuming you hit the max or the min score in your weighted assignments (unfortunately I can't generate more tuples because there are infinite), prompted the weight of the exam as well as a possible (rather common in my college) hard-required score in the exam. I won't edit this file furthermore, because this explanation suffices, so the next sections refer only to the test score calculator.

# Usage

As far as I know, you'll need JVM 17 or higher. Just double-click the batch file. Enter the number of questions of the test, c, a and b in that order.  
**It needs the decimal value inputs to use commas instead of dots.** 
It doesn't accept infinitely long numbers as input, and you should probably round down inputs like 1/3. It shouldn't be too hard to edit it so it does.

# Example

For a 20 questions exam, where you need a score of 5, every right question adds 0,5 and every wrong question subtracts 0,5 / 3 this is 0,166666:

        How many questions?
        20
        What score do you aim for?
        5
        How much for each correct answer?
        0,5
        How much less for each wrong answer?
        0,166666
        10 correct and 0 wrong out of 10 giving a score of 5.0
        11 correct and 3 wrong out of 14 giving a score of 5.000002
        12 correct and 6 wrong out of 18 giving a score of 5.000004
        13 correct and 7 wrong out of 20 giving a score of 5.3333379999999995

Notice that this is heavily aimed to just pass. As you can see rounding b down guarantees scenarios 2 and 3 appear.  
To reach your goal you should never be answering any amount of questions other than 10, 14, 18 or 20, as long as you choose which ones correctly.
