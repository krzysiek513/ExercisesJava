package Ch5_Control2.MakingDifference;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean more;
        System.out.println("Podaj swoje imie.");
        String name = input.next();
        System.out.printf("%s podaj dobrą odpowiedź (1-4)%n%n", name);
        do{
            int score = 0;
            String answer;
            System.out.printf("Czy jest taki termin jak globalne ocieplenie?%n1. tak%n2. nie%n3. niewiem" +
                    "%n4. może%n");
            answer = input.next();
            if(answer.equals("1")) score++;
            answer = "0";

            System.out.printf("Co oznacza globalne ocieplenie?%n1. Ocieplanie się klimatu%n2. Ludzie częściej się przytulają%n" +
                    "3. Impreza na plaży%n4. Wakacje na Karaibach%n");
            answer = input.next();
            if(answer.equals("1")) score++;
            answer = "0";

            System.out.printf("Czemu istnieje globalne ocieplenie?%n1. Tak już jest, dinozaury tego nie przeżyły" +
                    "%n2. Tesla to wymyślił%n3. niewiem%n4. Wysokie napięcie przyłożone do elektrod przyspiesza dodatnie jony%n");
            answer = input.next();
            if(answer.equals("1")) score++;
            answer = "0";

            System.out.printf("Jaki mamy wpływ na globalne ocieplenie?%n1. Nie wielki%n2. Ogromny%n3. To zależy czy dobrze śpimy" +
                    "%n4. Tylko na meczach Widzewa%n");
            answer = input.next();
            if(answer.equals("1")) score++;
            answer = "0";

            System.out.printf("Ale jak to globalne ocieplenie?%n1. tak%n2. nie%n3. niewiem" +
                    "%n4. może%n");
            answer = input.next();
            if(answer.equals("1")) score++;
            switch (score) {
                case 5 -> System.out.printf("Jesteś miszczem!!!%n%s Twój wynik to %d", name, score);
                case 4 -> System.out.printf("Coś wiesz%n%s Twój wynik to %d", name, score);
                default -> System.out.println("Poczytaj ma www.google.pl");
            }
            System.out.printf("%nCzy chcesz się sprawdzić jeszcze raz %s?%n", name);
            answer = input.next();
            more = answer.equals("tak");

        }while(more);
    }
}
