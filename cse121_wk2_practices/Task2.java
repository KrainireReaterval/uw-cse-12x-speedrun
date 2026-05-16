/*
 * Task 2 — Print a numbered staircase
 * ------------------------------------
 * Use a for loop to print each row number (1 through 5) followed
 * by a colon, a space, and a star — all on the same line.
 *
 * Expected Output:
 *   1: *
 *   2: *
 *   3: *
 *   4: *
 *   5: *
 *
 * Concepts practiced:
 *   - for loop
 *   - String concatenation with int loop variable
 *   - Combining values into one println statement
 */
public class Task2 {
    public static void main(String[] args) {
        // TODO: Write a for loop from 1 to 5.
        //       Each iteration, print the row number + ": *" on one line.
        //       Use a single println statement per iteration — don't split
        //       the number, colon, and star into separate print calls.
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ": *");
        }
    }
}
