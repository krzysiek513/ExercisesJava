package Ch3_Account.MakingDifference;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates  ktos = new HeartRates( "name",  "lastName",  1,  2,  1988);
        HeartRates  ktos1 = new HeartRates( "name1",  "lastName1",  11,  12,  1999);
        HeartRates  ktos2 = new HeartRates( "name2",  "lastName2",  111,  22,  2000);

        System.out.printf("%n%s %s urodzony %d-%d-%d, targetRate: %.2f - %d : %d", ktos.getName(), ktos.getLastName()
                , ktos.getDay(), ktos.getMonth(), ktos.getYear(), ktos.targetRate(), ktos.heartRate(), ktos.ageInYears());
 }
}
