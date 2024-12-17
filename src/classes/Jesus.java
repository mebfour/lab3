package classes;

import abstractclasses.Person;
import interfaces.God;

public class Jesus extends Person implements God {
    public static final Jesus jesus = new Jesus();
    //приватный конструктор, чтобы шаловливые ручки не насоздавали лишних экземпляров класса
    private Jesus(){
        super("Иисус", 10, 10);
    }

    @Override
    public void toEnjoyLife() {

    }


    //
}
