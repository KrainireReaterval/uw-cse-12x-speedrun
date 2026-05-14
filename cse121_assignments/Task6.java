/*
 * Task 6 — Print characters separated by arrows (fencepost pattern)
 * ------------------------------------------------------------------
 * Given the String "CODE", print each character separated by " -> "
 * with NO trailing arrow at the end. This is the fencepost pattern:
 * n characters need only n-1 separators between them.
 *
 * Expected Output:
 *   C -> O -> D -> E
 *
 * Concepts practiced:
 *   - String traversal with charAt() and length()
 *   - Fencepost pattern: loop handles all-but-last, then last is separate
 *   - s.charAt(s.length() - 1) to access the final character
 */
public class Task6 {
    public static void main(String[] args) {
        String word = "CODE";

        // TODO: Write a for loop from i = 0 to i < word.length() - 1.
        //       Each iteration, print the character at i followed by " -> " (no newline).
        //       After the loop, print the LAST character using word.charAt(word.length() - 1)
        //       followed by a newline.
        //
        //       Do NOT use an if statement inside the loop to handle the last character —
        //       that's what the fencepost pattern avoids.
        for (int i = 0; i < word.length() - 1; i++) {
            System.out.print(word.charAt(i) + " -> ");
        }
        System.out.println(word.charAt(word.length() - 1));
    }
}
