package lesson1_20211011.ExerciseFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExerciseFour {
    public static void main(String[] args) {
        String fileName = "src/lesson1_20211011/ExerciseFour/test.csv";
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            String space = "   ";
            int total = 0;
            int discount = 5000;

            while (line != null) {
                String[] attributes = line.split(",");
                String name = attributes[0];
                String quantityStr = attributes[1];
                int quantity = Integer.parseInt(quantityStr);
                int priceTag, price;

                switch (name) {
                    case "coca":
                        priceTag = 5000;
                        break;
                    case "noodle":
                        priceTag = 3000;
                        break;
                    case "orange":
                        priceTag = 7000;
                        break;
                    default:
                        priceTag = 0;
                }

                price = priceTag * quantity;
                if (name.equals("orange") && quantity > 2) {
                    price -= 5000;
                }
                total += price;

                System.out.println(name + space + quantity + space + price);

                line = br.readLine();
            }
            System.out.println("-------------");
            System.out.println("Total" + space + total);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
