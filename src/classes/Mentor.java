package classes;

import abstractclasses.Person;
import interfaces.Teacher;
import static classes.Story.*;
import java.util.Random;

public final class Mentor extends Person implements Teacher {


    public Mentor(String name, int soul, int satiety) {
        super(name, soul, satiety);
    }



    @Override
    public void toBrewing() {
        Random random = new Random();
        this.setSoul(this.getSoul() + random.nextInt(-1,2));
        System.out.print("Робинзон сварил пиво.");
    }

    public void toEnjoyLife(){
        System.out.print("Горе Робинзона смягчалось, жилище стало казаться ему необыкновенно уютным. ");
    };


    //Хочу массив тем, часть из которых разблокирована только на опр уровне рефлексии. то есть турефлект - ув лвл, роасширили темы для проповеди


    /**
    * тут в общем индексы массива базовых тем соотносятся с прод темами.
    * 1 -1, а 2=3 в базовом,
    * так что там один элемент в прод массиве.
    * хы.
     */
    @Override
    public void toPreach(Apprentice p) {
        Random random = new Random();
        int n = random.nextInt(3);
        System.out.println("Это n"+n);
        int result = 0;
        System.out.print(this.getName() + " рассказывает" + getSermons(n)+ ". ");
        result += (int) n/2;
        switch (n){
            case 1 -> {
                System.out.print("В продолжение беседы разговор заходит" + getproSermons(n)+ ". "); //лямбда-оператор делает автобрейк
                result+=n;
            }
            case 2, 3 -> {
                System.out.print("В продолжение беседы разговор заходит" + getproSermons(n)+ ". ");
                result+=n;
            }
        }
        this.setSoul(this.getSoul()+result);
        p.setSoul(p.getSoul()+ result + (int)(0.3*this.getSoul()));       //чем круче ментор, тем лучше учится ученик ха-ха
    }


}
