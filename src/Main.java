//-----------------------------------------------------
// Title: Main class
// Author: İhsan Melih Şişman
// Assignment: Patika Week [1_1]
// Description: This class is the Main class works the program.
// Note: İhsan Melih Şişman is available to work part-time or long-term internship min 3 days a week during the 2022 - 2023 university term
//-----------------------------------------------------
/**
 * by:
 * @author İhsan Melih Şişman
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Defines default decimal property.
        DecimalFormat df = new DecimalFormat("#.00");

        // It should be defined because it is needed to take input from the user with this object.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double height = scanner.nextDouble();
        // Takes input from the user.

        System.out.print("Lütfen kilonuzu giriniz : ");
        double weight = scanner.nextDouble();
        // Takes input from the user.

        /**
         *
         * In this part of program provide us to test the result and print it with if-else.
         */
        if (BodyMassIndexCalculator.calculate(height, weight) <= 18.5) {
            System.out.print("Vücut Kitle İndeksiniz : " + df.format(BodyMassIndexCalculator.calculate(height, weight)) + ". İdeal kilonun altında");
        } else if (BodyMassIndexCalculator.calculate(height, weight) >= 18.6 && BodyMassIndexCalculator.calculate(height, weight) <= 24.0) {
            System.out.print("Vücut Kitle İndeksiniz : " + df.format(BodyMassIndexCalculator.calculate(height, weight)) + ". İdeal kiloda");
        } else if (BodyMassIndexCalculator.calculate(height, weight) >= 25.0 && BodyMassIndexCalculator.calculate(height, weight) <= 29.9) {
            System.out.print("Vücut Kitle İndeksiniz : " + df.format(BodyMassIndexCalculator.calculate(height, weight)) + ". İdeal kilonun üstünde");
        } else if (BodyMassIndexCalculator.calculate(height, weight) >= 30.0 && BodyMassIndexCalculator.calculate(height, weight) <= 39.9) {
            System.out.print("Vücut Kitle İndeksiniz : " + df.format(BodyMassIndexCalculator.calculate(height, weight)) + ". İdeal kilonun çok üstünde (Obez)");
        } else if (BodyMassIndexCalculator.calculate(height, weight) > 40.0) {
            System.out.print("Vücut Kitle İndeksiniz : " + df.format(BodyMassIndexCalculator.calculate(height, weight)) + ". İdeal kilonun çok üstünde (Morbid Obez)");
        } else {
            System.out.print("Yanlış veri girdiniz.");
        }


    }
}
