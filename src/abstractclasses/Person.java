package abstractclasses;


import enums.CharacterState;
import enums.Season;

import java.util.Objects;

public abstract class Person {
    private String name = "Anonymous";
    private int soul = 0;
    private int satiety = 0;
    private CharacterState characterState = CharacterState.SITTING;

    public Person(String name, int soul, int satiety){

        try{
        if ((!(0<=soul && soul<=100))){
            throw new IllegalArgumentException("Душа должна принимать значения на отрезке [0; 10].");
        }} catch (IllegalArgumentException e){
            System.out.println("Так низя, потому что " + e.getMessage());
            System.exit(33);
        }
        this.setName(name);
        this.setSoul(soul);
        this.setSatiety(satiety);
    }

    public void setName(String name) { this.name = name; }

    public void setSoul(int soul) {this.soul = soul;}
    public void setSatiety(int satiety) {this.satiety = satiety;}
    public void setCharacterState(CharacterState characterState){this.characterState = characterState;}
    public String getName() { return name; }
    public int getSoul() { return soul; }
    public CharacterState getCharacterState(){return characterState;}
    public int getSatiety() { return satiety; }

    public void toReflect(){
        System.out.print(this.name + " размышляет. ");
    }
    public void toPray(){
        System.out.print(this.name + " молится. ");
    }
    public void toChangeState(CharacterState newState){
        this.setCharacterState(newState);
        System.out.print(this.getName()+' '+this.getCharacterState()+ ". ");
    }
    public void cleanUp() {};

    public void printSoul(){
        System.out.println(this.getName() + " имеет параметр души = " + this.getSoul());
    }

    @Override
    public int hashCode(){return 10*super.hashCode();}

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {return false;}
        else{
            /*&& this.satiety == ((Person) obj).satiety)*/
            //мы не смотрим на голод, потому что неэтично
            return (Objects.equals(this.getName(), ((Person) obj).getName()))
                    && (this.getSoul() == ((Person) obj).getSoul());

        }
    }

    @Override
    public String toString() {
        return "Этот человек с именем " + name + " обладает " + (soul > 5 ? "исцеленной" : "испорченной") + " душой. ";

    }



}
