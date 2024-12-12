package classes;

import abstractclasses.Person;
import enums.CharacterProximity;
import enums.CharacterState;
import enums.RelationshipStatus;
import static classes.Story.getThemes;
import java.util.Random;


public class Relationship {
    private Person person1;
    private Person person2;
    private RelationshipStatus relationshipStatus = RelationshipStatus.NONE;
    private CharacterProximity characterProximity = CharacterProximity.NEAR;

    public Relationship(Person person1, Person person2, RelationshipStatus relationshipStatus){
        this.person1 = person1;
        this.person2 = person2;
        this.relationshipStatus = relationshipStatus;
    }

    public void changeStatus(RelationshipStatus newStatus) {
         this.relationshipStatus = newStatus;
        System.out.print(person1.getName() + " и " + person2.getName() + " становятся " + this.getRelationshipType()+ ". ");
        }
    public void changePromixity(CharacterProximity newPromixity){
        this.characterProximity = newPromixity;
        System.out.print(person1.getName() + ' ' + this.getCharacterProximity() + ' '+ person2.getName()+ ". ");
    }

    public Person getPerson1() {
        return person1;
    }
    public Person getPerson2() {
        return person2;
    }
    public CharacterProximity getCharacterProximity(){return this.characterProximity;}

    public RelationshipStatus getRelationshipType(){
        return relationshipStatus;
    }
    @Override
    public String toString() {
        return  person1.getName() + " и " + person2.getName() + " являются друг другу " + relationshipStatus + ". ";
    }

    //  тут уже начинается класс

    public void toOrder(Person p1){
        if (this.getRelationshipType()==RelationshipStatus.SUBORDINATE){
            if (p1 == person1) {
                System.out.print(person1.getName() + " приказывает " + person2.getName() + " заняться делом. ");
            } else if (p1 == person2) {
                System.out.print(person2.getName() + " приказывает " + person1.getName() + " заняться делом. ");
            } else{
                System.out.print("Неправильно введен персонаж"+ ". ");
            }
        } else System.out.print(person1.getName() + " и " + person2.getName() + "не в тех отношениях, чтобы отдавать приказы. ");

    }
    public void changeTopic(){
        System.out.print("Герои меняют тему разговора. ");
    }

    public void toAsk(Person p1){
        Random random = new Random();
        int n = random.nextInt(8);
        if (p1 == person1) {
            System.out.print(person1.getName() + " просит " + person2.getName() +" научить "+ getThemes(n)+ ". ");
        } else if (p1 == person2) {

            System.out.print(person2.getName() + " просит " + person1.getName() +" научить "+ getThemes(n)+ ". ");
        } else{
            System.out.print("Неправильно введен персонаж"+ ". ");
        }
    }
    public void toStartDiscuss(){
        if ((person1.getCharacterState()== CharacterState.SITTING)&&(person2.getCharacterState()== CharacterState.SITTING)) {
            System.out.print(person1.getName() + " и " + person2.getName() + " начинают разговор. ");
        } else System.out.print("Какой-то персонаж не сидит - мы не можем начать разговор(. ");
    }
    public void toBeHappytoMeet(){
        if (this.getCharacterProximity()==CharacterProximity.CLOSE)
            System.out.print("Герои очень рады друг друга видеть"+ ". ");
        else System.out.print("Герои слишком далеко, чтобы радоваться встрече("+ ". ");
    }



}
