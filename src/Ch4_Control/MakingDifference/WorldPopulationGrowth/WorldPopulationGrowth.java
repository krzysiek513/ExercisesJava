package Ch4_Control.MakingDifference.WorldPopulationGrowth;

public class WorldPopulationGrowth {
    static float GROWTHRATE = 1.05f;
    int year;
    float anticipatedPopulation;
    float increaseWorldPopulation;

    public WorldPopulationGrowth() {
        year = 2019;
        anticipatedPopulation = 77000000000f;
        increaseWorldPopulation = (anticipatedPopulation * GROWTHRATE) - anticipatedPopulation;

    }

    public WorldPopulationGrowth(int year, float population) {
        this.year = year;
        anticipatedPopulation = population * GROWTHRATE;
        increaseWorldPopulation = (anticipatedPopulation * GROWTHRATE) - anticipatedPopulation;

    }


    public static void Welcome() {
        System.out.printf("\n%6S %24s %30s",
                "year",
                "anticipatedPopulation",
                "increaseWorldPopulation");

    }

    public void ekran() {
        System.out.printf("\n%6d %,24.0f %,30.0f",
                this.year,
                this.anticipatedPopulation,
                this.increaseWorldPopulation);
    }

    @Override
    public String toString() {
        return  "\nyear=" + year +
                ", forYears=" + anticipatedPopulation +
                ", growthRate=" + GROWTHRATE +
                ", increaseWorldPopulation=" + increaseWorldPopulation;
    }
}
