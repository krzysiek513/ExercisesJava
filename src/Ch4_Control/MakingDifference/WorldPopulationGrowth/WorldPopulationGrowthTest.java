package Ch4_Control.MakingDifference.WorldPopulationGrowth;

public class WorldPopulationGrowthTest {
    public static void main(String[] args) {
        WorldPopulationGrowth worldPopulationGrowth = new WorldPopulationGrowth(1,
                2 , 4,5 );
        WorldPopulationGrowth.Welcome();
        worldPopulationGrowth.ekran();
        WorldPopulationGrowth toDay = new WorldPopulationGrowth(2020, 77000000000l
                , 000, 4);

        toDay.ekran();
        System.out.print("\n\n----------to string---------");
        /////// DLATEGO \N MA BYĆ Z TYŁU
        //jedno n w funkicji ekran a drugie w System.out.println();
        System.out.println(worldPopulationGrowth);
    }
}
