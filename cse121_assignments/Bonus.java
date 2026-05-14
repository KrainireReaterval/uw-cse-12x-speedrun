import java.util.*;

/*
 * Bonus — Randomized ASCII Name Banner
 * -------------------------------------
 * Write a program that takes any String and prints a banner where:
 *
 *   1. Each character of the String gets its own line, preceded by a
 *      random number of stars between 1 and 5 (inclusive).
 *
 *   2. Below each character line, print a separator of dashes "-"
 *      that is always 8 characters wide (5 max stars + 3 extra).
 *
 *   3. After all characters, print two summary lines:
 *        Total chars: X        (use string length)
 *        Max stars possible: Y (use Math.pow to compute 5 squared — don't hardcode 25)
 *
 * Example Output (stars are random — yours will differ each run):
 *   *** H
 *   --------
 *   * I
 *   --------
 *   Total chars: 2
 *   Max stars possible: 25
 *
 * Concepts practiced:
 *   - String traversal (charAt, length)
 *   - Nested for loops (outer = characters, inner = stars)
 *   - Random: rand.nextInt(5) + 1 for range [1, 5]
 *   - Math.pow(5, 2) cast to int for the summary line
 *   - Scope: declare rand once before the loop, not inside it
 */
public class Bonus {
    public static void main(String[] args) {
        String name = "HI";       // TODO: change to your own name or any word!
        Random rand = new Random();

        // TODO: Write an outer for loop that traverses each character of name.
        //       Inside each iteration:
        //         1. Generate a random number of stars between 1 and 5 using rand.nextInt()
        //         2. Use an inner for loop to print that many stars (no newline between stars)
        //         3. Print a space and the current character using charAt(i), then a newline
        //         4. Print "--------" (8 dashes) on its own line

        // TODO: After the outer loop, print the two summary lines:
        //         "Total chars: " + name.length()
        //         "Max stars possible: " + (int) Math.pow(5, 2)
    }
}
