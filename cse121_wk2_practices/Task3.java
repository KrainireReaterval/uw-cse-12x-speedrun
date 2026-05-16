/*
 * Task 3 — Print a solid rectangle
 * ---------------------------------
 * Use nested for loops to print a rectangle of stars that is
 * 5 columns wide and 3 rows tall.
 *
 * Expected Output:
 *   *****
 *   *****
 *   *****
 *
 * Concepts practiced:
 *   - Nested for loops
 *   - Outer loop controls rows, inner loop controls columns
 *   - Scope: inner variable j is not accessible outside its loop
 *   - i-j naming convention for nested loops
 */
public class Task3 {
    public static void main(String[] args) {
        // TODO: Write an outer for loop that runs 3 times (one per row).
        //       Inside it, write an inner for loop that runs 5 times (one per column),
        //       printing a "*" each iteration (no newline).
        //       After the inner loop finishes, print a newline to end the row.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
