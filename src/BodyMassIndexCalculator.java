//-----------------------------------------------------
// Title: BodyMassIndexCalculator class
// Author: İhsan Melih Şişman
// Assignment: Patika Week [1_1]
// Description: This class is the BodyMassIndexCalculator class that used for locating specific features for main class.
// Note: İhsan Melih Şişman is available to work part-time or long-term internship 3 days a week during the 2022 - 2023 university term
//-----------------------------------------------------
/**
 * by:
 * @author İhsan Melih Şişman
 */
public class BodyMassIndexCalculator {

    /**
     *
     * This method provides us to calculate body mass index. It can be found by weight/height^2.
     */
    public static double calculate(double height, double weight) {
        double total;
        height *= height;
        total = weight / height;
        return total;
    }


}
