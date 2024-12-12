package classes;


import abstractclasses.Person;
import interfaces.Student;


import java.util.Random;

import static classes.Story.getThemes;

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
    };

}

