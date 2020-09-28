package Ch3_Account.MakingDifference;

public class TargetHeartRateCalculator {
    public static void main(String[] args) {
        int maximumHeart = 190;
        // maximum heart it's 220 - your age in years
        // target heart rate 50%-85% of max
        double targetHeartRate = maximumHeart * 0.75;

        System.out.println( " " + targetHeartRate);


    }
}


