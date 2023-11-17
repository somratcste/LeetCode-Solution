package practise;

public class ValidateSubSequence {

    private static boolean isValidSubsequence(int[] array, int[] sequence) {
        int sequenceIndex = 0;
        int arrayIndex = 0;

        while (arrayIndex < array.length && sequenceIndex <= sequence.length) {
            if (array[arrayIndex] == sequence[sequenceIndex]) {
                sequenceIndex++;
            }
            arrayIndex++;
        }

        return sequenceIndex == sequence.length;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};

        boolean isValid = isValidSubsequence(array, sequence);

        if (isValid) {
            System.out.println("The sequence is a valid subsequence.");
        } else {
            System.out.println("The sequence is not a valid subsequence.");
        }
    }
}
