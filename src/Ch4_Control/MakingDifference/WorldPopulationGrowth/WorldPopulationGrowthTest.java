package Ch4_Control.MakingDifference.WorldPopulationGrowth;

public class WorldPopulationGrowthTest {
    public static void main(String[] args) {
        WorldPopulationGrowth worldPopulationGrowth = new WorldPopulationGrowth(1, 2);
        WorldPopulationGrowth.Welcome();
        worldPopulationGrowth.ekran();

        WorldPopulationGrowth toDay = new WorldPopulationGrowth(2020, 77000000000f);
        toDay.ekran();

        System.out.print("\n\n----------to string---------");
        /////// DLATEGO \N MA BYĆ Z TYŁU
        //jedno n w funkicji ekran a drugie w System.out.println();
        System.out.println(worldPopulationGrowth);
        
        System.out.print("\n\n----------zadanie---------");
        int years = 1;
        boolean once = true;
        WorldPopulationGrowth tableOfYears[] = new WorldPopulationGrowth[75];
        WorldPopulationGrowth.Welcome();
        tableOfYears[0] = new WorldPopulationGrowth();
        tableOfYears[0].ekran();
        while(years<75) {
            tableOfYears[years] = new WorldPopulationGrowth(tableOfYears[--years].year+1
                    , tableOfYears[years].anticipatedPopulation);
            if(tableOfYears[years].anticipatedPopulation >
                    2*tableOfYears[0].anticipatedPopulation & once){
                System.out.println("\npopulacja sie podwoiła");
                once = false;
            }
            tableOfYears[++years].ekran();
            years++;
        }
    }
}
