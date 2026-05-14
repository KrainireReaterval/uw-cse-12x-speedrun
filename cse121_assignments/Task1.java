/*
 * Task 1 — Print a horizontal line of stars
 * -----------------------------------------
 * Use a single for loop to print exactly 10 stars on one line,
 * followed by a newline. Do NOT hardcode "**********" as a string —
 * the loop must do the printing one star at a time.
 *
 * Expected Output:
 *   **********
 *
 * Concepts practiced:
 *   - for loop structure (start; condition; update)
 *   - System.out.print vs System.out.println
 *   - Loop variable i (CSE 121 convention)
 */
public class Task1 {
    public static void main(String[] args) {
        // TODO: Write a for loop that prints one "*" per iteration (no newline),
        //       then after the loop, print a newline using System.out.println()
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
