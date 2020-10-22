package Ch4_Control.MakingDifference.WorldPopulationGrowth;

public class WorldPopulationGrowth {
    int year;
    int forYears;
    float  growthRate;
    long anticipatedWorldPopulation;
    long increaseWorldPopulation;

    public WorldPopulationGrowth() {
    }

    public WorldPopulationGrowth(int year, int forYears, float growthRate
            , long anticipatedWorldPopulation, long increaseWorldPopulation) {
        this.year = year;
        this.forYears = forYears;
        this.growthRate = growthRate;
        this.anticipatedWorldPopulation = anticipatedWorldPopulation;
        this.increaseWorldPopulation = increaseWorldPopulation;
    }

    public static void Welcome() {
        System.out.printf("\n%6S %11s %12s %30s %30s",
                "year",
                "population",
                "growthRate",
                "anticipatedWorldPopulation",
                "increaseWorldPopulation");

    }

    public void ekran() {

        System.out.printf("\n%6d %11d %12.3f  %29d %30d",
                this.year,
                this.forYears,
                this.growthRate,
                this.anticipatedWorldPopulation,
                this.increaseWorldPopulation);
    }

    @Override
    public String toString() {
        return  "\nyear=" + year +
                ", forYears=" + forYears +
                ", growthRate=" + growthRate +
                ", anticipatedWorldPopulation=" + anticipatedWorldPopulation +
                ", increaseWorldPopulation=" + increaseWorldPopulation;
    }
}
