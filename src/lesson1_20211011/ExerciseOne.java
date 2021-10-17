package lesson1_20211011;

public class ExerciseOne {
    /**
     * Calculate the maximum between two element of Array A
     *
     * @param A
     * @return int
     */
    int maxDiff(int A[]) {
        int n = A.length;
        int max = 0;
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (A[j] - A[i] > max) {
                    max = A[j] - A[i];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ExerciseOne max = new ExerciseOne();
        int A[] = {2, 5, 3, 9, 15, 20, 1, 17};
        int maxDiff = max.maxDiff(A);

        System.out.println(maxDiff);
    }
}
