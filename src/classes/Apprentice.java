package classes;


import abstractclasses.Person;
import enums.Season;
import interfaces.Student;
import java.util.Random;

import static records.Story.*;



public final class Apprentice extends Person implements Student {

    public Apprentice(String name, int soul, int satiety) {
        super(name, soul, satiety);
    }
    private static boolean studyStatus = false;
    public int toStudy(){           //бафаем душу
        Random random = new Random();
        int randomNumber = random.nextInt(8);
        System.out.print("Наставник " + getThemes(randomNumber));
        studyStatus = true;
        return (int) randomNumber/2;
    }

    @Override
    public void toReflect() {
        System.out.print(this.getName() + " размышляет о Боге. ");
        if (studyStatus) {
            if (this.getSoul() < 9) this.setSoul(this.getSoul() + toStudy());
            studyStatus = false;
        }
    }

    @Override
    public void cleanUp() {
        System.out.print(this.getName() );
        Season s = World.getCurrSeason();
        switch (s){
            case WINTER -> System.out.print(" чистит снег.");
            case SPRING, AUTUMN -> System.out.print(" убирает листья. ");
            case SUMMER -> System.out.print(" подметает пыль. ");
        }
    }
}

