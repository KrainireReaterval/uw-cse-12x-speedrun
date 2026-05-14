/*
 * Task 4 — Print a growing triangle
 * ----------------------------------
 * Use nested loops where the inner loop's number of iterations
 * depends on the outer loop variable i. Print a left-aligned
 * triangle that grows from 1 star on row 1 to 5 stars on row 5.
 *
 * Expected Output:
 *   *
 *   **
 *   ***
 *   ****
 *   *****
 *
 * Concepts practiced:
 *   - Nested for loops with a dependent inner loop
 *   - Inner loop condition uses outer variable: j <= i
 *   - Scope: j only exists inside the outer loop's block
 */
public class Task4 {
    public static void main(String[] args) {
        // TODO: Write an outer for loop where i goes from 1 to 5.
        //       Inside, write an inner for loop where j starts at 1
        //       and runs while j <= i.
        //       Print one "*" per inner iteration, then a newline after
        //       the inner loop completes each row.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
