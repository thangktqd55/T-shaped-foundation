package lesson1_20211011;

public class ExerciseTwo {
    public static void main(String[] args) {
        String input = "This is a book";
        String words[] = input.split("\\s");
        String output = "";

        for (String word : words) {
            if (word.length() > 1) {
                String firtLetter = word.substring(0, 1);
                String remain = word.substring(1);

                output += firtLetter.toUpperCase() + remain + " ";
            } else {
                output += word + " ";
            }
        }

        System.out.println(output);
    }
}
