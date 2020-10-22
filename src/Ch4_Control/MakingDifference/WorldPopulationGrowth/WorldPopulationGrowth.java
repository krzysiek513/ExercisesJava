package Ch4_Control.MakingDifference.WorldPopulationGrowth;

import Ch2_Intro.makingDefference.WorldPopulation;

public class WorldPopulationGrowth {
    int year;
    long population;
    static float growthRate = 1.05f;
    long anticipatedWorldPopulation;
    long increaseWorldPopulation;

    public WorldPopulationGrowth() {
    }

    public WorldPopulationGrowth(int year, long population
            , long anticipatedWorldPopulation, long increaseWorldPopulation) {
        this.year = year;
        this.population = population;
        this.anticipatedWorldPopulation = anticipatedWorldPopulation;
        this.increaseWorldPopulation = increaseWorldPopulation;
    }

    public static void Welcome() {
        System.out.printf("\n%6S %18s %12s %30s %30s",
                "year",
                "population",
                "growthRate",
                "anticipatedWorldPopulation",
                "increaseWorldPopulation");

    }

    public void ekran() {

        System.out.printf("\n%6d %,18d %12.2f  %29d %30d",
                this.year,
                this.population,
                this.growthRate,
                this.anticipatedWorldPopulation,
                this.increaseWorldPopulation);
    }

    @Override
    public String toString() {
        return  "\nyear=" + year +
                ", forYears=" + population +
                ", growthRate=" + growthRate +
                ", anticipatedWorldPopulation=" + anticipatedWorldPopulation +
                ", increaseWorldPopulation=" + increaseWorldPopulation;
    }
}
