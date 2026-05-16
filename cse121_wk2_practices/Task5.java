/*
 * Task 5 — Print each character with its index
 * ---------------------------------------------
 * Given the String "JAVA", use a for loop with charAt() and length()
 * to print each character on its own line, labeled with its index position.
 *
 * Expected Output:
 *   [0] J
 *   [1] A
 *   [2] V
 *   [3] A
 *
 * Concepts practiced:
 *   - String traversal using charAt(i) and length()
 *   - Loop starts at 0 (String indices are 0-based)
 *   - String concatenation to build each output line
 */
public class Task5 {
    public static void main(String[] args) {
        String word = "JAVA";

        // TODO: Write a for loop from i = 0 to i < word.length().
        //       Each iteration, print: "[" + i + "] " + word.charAt(i)
        //       using a single println statement.
        for (int i = 0; i < word.length(); i++) {
            System.out.println("[" + i + "] " + word.charAt(i));
        }
    }
}
