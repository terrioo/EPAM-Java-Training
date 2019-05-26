package lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Task3;

public class DinosaurMassConverter {
    public static void main(String[] args) throws IOException {
        int kg;
        double ton;
        long grams, milligrams;
        System.out.println("Введите массу динозавра в килограммах");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        kg = Integer.parseInt(reader.readLine());
        if (kg > 0) {
            ton = (double) kg / 1000;
            grams = kg * 1000;
            milligrams = (long) kg * 1000000;
            System.out.println("В тоннах, граммах и килограммах динозавр весит:");
            System.out.printf("%.4f тонны\n%d граммов\n%d милиграммов", ton, grams, milligrams);
        } else {
            System.out.println("Вес динозавра должен быть больше 0");
        }
    }
}








