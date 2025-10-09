package project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeEstimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) name = "there";

        int age = -1;
        while (age < 0) {
            System.out.print("How old are you? ");
            String line = sc.nextLine().trim();
            try {
                age = Integer.parseInt(line);
                if (age < 0) {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Try again.");
            }
        }

        LocalDate today = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        int birthYear = today.getYear() - age;

        System.out.println("Hello, " + name + "! Today is " + today.format(fmt) + ".");
        System.out.println("If you are " + age + " years old, your birth year is approximately " + birthYear + ".");
        sc.close();

	}

}
