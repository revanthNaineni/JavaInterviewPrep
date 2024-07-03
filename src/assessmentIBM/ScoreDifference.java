package assessmentIBM;

/*Given the initial setup of a match between two players, evaluate the match's outcome.

There are two players, and there is a number sequence of size n. Players alternate turns for n rounds. Each round, a player removes the first number from the sequence and adds its value to their score. After that, if the 'removed' number is even, the remaining sequence is reversed. Determine the difference in scores between the two players after the game.

More precisely, suppose first score and second score are the final scores of the first and second player, respectively. The goal is to calculate the value of first_score- second score.

Example

The number of elements is n=5 and numSeq = [3,

6, 2, 3, 5]

1st round: The first player picks 3, first_score = 3.

The remaining sequence: [6, 2, 3, 5].

2nd round: The second player picks 6, second score = 6. Since 6 is even, the remaining sequence is reversed: [5, 3, 2].

3rd round: The first player picks 5, first score =3+ 5-8. The remaining sequence: [3,2].

⚫ 4th round: Second player picks 3, second score= 6+3 9. The remaining sequence: [2].

5th round (final): First player picks 2, second score= 8+2-10 The remaining sequence: []
The total difference between players scores is first_score-second_score=10-9=1

Write Java function which return score difference 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreDifference {
    public static int calculateScoreDifference(int n, List<Integer> numSeq) {
        int firstScore = 0;
        int secondScore = 0;
        boolean isFirstPlayerTurn = true;

        for (int round = 0; round < n; round++) {
            int pickedNumber = numSeq.remove(0);

            if (isFirstPlayerTurn) {
                firstScore += pickedNumber;
            } else {
                secondScore += pickedNumber;
            }

            if (pickedNumber % 2 == 0) {
                Collections.reverse(numSeq);
            }

            isFirstPlayerTurn = !isFirstPlayerTurn;
        }

        return firstScore - secondScore;
    }

    public static void main(String[] args) {
        int n = 5;
        List<Integer> numSeq = new ArrayList<>(List.of(4, 2, 1, 4, 3));
        int scoreDifference = calculateScoreDifference(n, numSeq);
        System.out.println("Score Difference: " + scoreDifference);
    }
}

