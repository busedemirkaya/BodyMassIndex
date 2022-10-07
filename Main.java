import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double weight, height;
        Scanner bmi = new Scanner(System.in);

        System.out.print("Enter Weight(kg): ");
        weight = bmi.nextDouble();

        System.out.print("Enter Height(m): ");
        height = bmi.nextDouble();
        double BodyMassIndex = weight / (height * height);
        System.out.print("Your Body Mass Index: " + BodyMassIndex);





    }
}