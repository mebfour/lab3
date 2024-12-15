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
    private static boolean studystatus = false;
    public int toStudy(){           //бафаем душу
        Random random = new Random();
        int randomNumber = random.nextInt(8);
        //Story theme = new Story();
        System.out.print("Наставник " + getThemes(randomNumber));
        studystatus = true;
        return (int) randomNumber/2;
    }

    @Override
    public void toReflect() {
        System.out.print(this.getName() + " размышляет о Боге. ");
        if (studystatus) {
            if (this.getSoul() < 9) this.setSoul(this.getSoul() + toStudy());
            studystatus = false;
        }
    }

    @Override
    public void cleanUp(Season s) {
        System.out.print(this.getName() );
        switch (s){
            case WINTER -> System.out.print(" чистит снег.");
            case SPRING, AUTUMN -> System.out.print(" убирает листья. ");
            case SUMMER -> System.out.print(" подметает пыль. ");
        }
    }

    ;

}

