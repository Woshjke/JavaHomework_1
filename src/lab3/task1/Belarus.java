package lab3.task1;

import java.util.Arrays;

public class Belarus {
    public static final String FOUNDING_DATE = "25.08.1991";
    public static final String CAPITAL = "Minsk";
    public static final String MONEY = "BYN";

    public enum LANGUAGES {
        RUS, BEL
    }

    public enum FOREGNERS {
        POLAND, LITHUANIA, LATVIA, RUSSIA, UKRAINE
    }

    public enum DISTRICTS {
        MINSK, GRODNO, BREST, VITEBSK, MOGILEV, GOMEL
    }

    public static void shortInfo() {
        System.out.println("Founding date: " + FOUNDING_DATE);
        System.out.println("Capital: " + CAPITAL);
        System.out.println("Foreigners: " + Arrays.asList(FOREGNERS.values()));
    }

    public static void fullInfo() {
        shortInfo();
        System.out.println("Money: " + MONEY);
        System.out.println("Districts: " + Arrays.asList(DISTRICTS.values()));
        System.out.println("Languages: " + Arrays.asList(LANGUAGES.values()));
    }
}
