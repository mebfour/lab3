package abstractclasses;


import enums.CharacterState;

public abstract class Person {
    private String name = "Anonymous";
    private int soul = 0;
    private int satiety = 0;
    private CharacterState characterState = CharacterState.SITTING;

    public Person(String name, int soul, int satiety){
        this.setName(name);
        this.setSoul(soul);
        this.setSatiety(satiety);


    }
    public void setName(String name) { this.name     = name; }
    public String getName() { return name; }
    public void setSoul(int soul) {this.soul = soul;}
    public void setSatiety(int satiety) {this.satiety = satiety;}
    public void setCharacterState(CharacterState characterState){this.characterState = characterState;}
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


    @Override
    public int hashCode(){return 10*super.hashCode();}

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {return false;}
        else{
            if (this.name.equals(((Person) obj).getName())
                    && this.soul == ((Person) obj).soul )
                /*&& this.satiety == ((Person) obj).satiety)*/ {        //мы не смотрим на голод, потому что неэтично
                return true;
            }
            else{return false;}

        }
    }

    @Override
    public String toString() {
        return "Этот человек с именем " + name + " обладает " + (soul > 5 ? "исцеленной" : "испорченной") + " душой. ";

    }



}
