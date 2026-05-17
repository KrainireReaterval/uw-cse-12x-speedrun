// ============================================================
// CSE 121 - Week 3 Practice: Mini Election Simulator
// Concepts: Nested Loops, Math.random(), Cumulative Sum,
//           Scope, Class Constants, Methods & Parameters
// ============================================================
//
// BACKGROUND:
// You are simulating a small election between 3 candidates
// over multiple rounds of voting. Your job is to complete
// each method following the TODO instructions.
//
// RULES (Code Quality):
// - Use descriptive variable names (except i, j, k for loops)
// - Declare variables in the most local scope possible
// - Use class constants where appropriate
// - Each method should do ONE clear thing
// - No forbidden features (break, continue, switch, etc.)
// ============================================================

public class ElectionPractice {

    // --------------------------------------------------------
    // TODO 1: Declare two class constants here:
    //   - NUM_CANDIDATES = 3
    //   - NUM_ROUNDS = 5
    // Remember: public static final, SCREAMING_CASE
    // --------------------------------------------------------

    public static final int NUM_CANDIDATES = 3;
    public static final int NUM_ROUNDS = 5;

    public static void main(String[] args) {
        System.out.println("=== Mini Election Simulator ===");
        System.out.println(simulateVotes(NUM_ROUNDS)); //test simulateVotes() method
        System.out.println();

        // TODO 5: Call printBallot() here with NUM_CANDIDATES
        //         and NUM_ROUNDS as arguments
            printBallot(NUM_CANDIDATES, NUM_ROUNDS);
            System.out.println();

        // TODO 6: Call printResults() here with NUM_CANDIDATES
        //         and NUM_ROUNDS as arguments
            printResults(NUM_CANDIDATES, NUM_ROUNDS);
    }


    // --------------------------------------------------------
    // TODO 2: Complete printBallot()
    //
    // This method uses NESTED LOOPS to print a ballot grid
    // showing each candidate's column for each round.
    //
    // Expected output for 3 candidates, 5 rounds:
    //
    //   Round  Cand1  Cand2  Cand3
    //   1      *      *      *
    //   2      *      *      *
    //   3      *      *      *
    //   4      *      *      *
    //   5      *      *      *
    //
    // Parameters:
    //   numCandidates - number of candidates
    //   numRounds     - number of rounds
    // Returns: nothing
    // --------------------------------------------------------
    // Add a nested loop here
    // Outer loop: iterate over each round (1 to numRounds)
    // Inner loop: print "*      " for each candidate
    // Don't forget println() after each round's inner loop!
    // --------------------------------------------------------
    public static void printBallot(int numCandidates, int numRounds) {
        // Print header row
        System.out.print("Round  ");
        for (int i = 1; i <= numRounds; i++) {
            System.out.print("Round" + i + "  ");
            for (int j = 1; j <= numCandidates; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // --------------------------------------------------------
    // TODO 3: Complete simulateVotes()
    //
    // This method simulates random votes for ONE candidate
    // across all rounds using Math.random(), and returns
    // the CUMULATIVE total votes as an int.
    //
    // Each round, the candidate gets a random number of
    // votes between 1 and 10 (inclusive).
    //
    // Parameters:
    //   numRounds - number of rounds to simulate
    // Returns: total votes (cumulative sum) as int
    // --------------------------------------------------------
    public static int simulateVotes(int numRounds) {
        // TODO: Declare your cumulative sum variable here
        int totalVotes = 0;
        // TODO: Loop through each round, generate random votes,
        //       and add to your running total
        for (int i = 1; i <=numRounds; i++) {
            int votesThisRound = (int)(Math.random() * 10) + 1; // random between 1 and 10
            totalVotes += votesThisRound; // add to cumulative total
        }
        // TODO: Return the total
        return totalVotes; // replace this!
    }


    // --------------------------------------------------------
    // TODO 4: Complete printResults()
    //
    // This method simulates and prints the vote totals for
    // ALL candidates by calling simulateVotes() for each one.
    //
    // Expected output (votes will vary due to randomness):
    //
    //   === Election Results ===
    //   Candidate 1: 37 votes
    //   Candidate 2: 42 votes
    //   Candidate 3: 29 votes
    //
    // Parameters:
    //   numCandidates - number of candidates
    //   numRounds     - number of rounds
    // Returns: nothing
    // --------------------------------------------------------
    public static void printResults(int numCandidates, int numRounds) {
        System.out.println("=== Election Results ===");

        // TODO: Loop through each candidate (1 to numCandidates)
        //       Call simulateVotes(numRounds) for each candidate
        //       Print: "Candidate X: Y votes"
        for (int i = 1; i <= numCandidates; i++){
            int votes = simulateVotes(numRounds);
            System.out.println( "Candidate" + i + ": " + votes + " votes");
        }
    }

}

// ============================================================
// CHALLENGE (optional): After completing the TODOs above,
// try adding a method findWinner() that:
//   - Takes numCandidates and numRounds as parameters
//   - Returns the candidate NUMBER (int) with the most votes
//   - Prints "Winner: Candidate X!"
// Think about: how do you track the highest vote count seen
// so far? (Hint: cumulative max — similar to cumulative sum!)
// ============================================================
