package classes;

import enums.Season;

public class World {
    public static Relationship fridayRob;
    private static Season currSeason;
    private static int currYear = 0;


    public static Season getCurrSeason(){
        return currSeason;
    }

    public static void setCurrSeason(Season currSeason) {
        World.currSeason = currSeason;
    }

    public static int getCurrYear() {
        return currYear;
    }

    public static void addYear() {
        World.currYear++;
    }
    public static void printYear(){
        System.out.print((World.getCurrYear()>1 ? "Прошло ":"Прошел ") + World.getCurrYear() + " год" + (World.getCurrYear()>1 ? 'а':"") + ". ");
    }



   
}
