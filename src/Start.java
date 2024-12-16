import classes.*;
import enums.CharacterProximity;
import enums.CharacterState;
import enums.RelationshipStatus;
import enums.Season;
import interfaces.God;

import static classes.Jesus.jesus;
import static interfaces.God.toBeWitness;


public class Start {
     static void start(){
        String water = "";
        God.toMagic(water);
        System.out.println();


        Apprentice friday = new Apprentice("Пятница", 0, 5);
        Mentor rob = new Mentor("Робинзон", 5, 4);
        Relationship fridayRob = new Relationship( friday,rob, RelationshipStatus.SUBORDINATE);    //не меняй порядок
        Relationship jesusRob = new Relationship(jesus, rob, RelationshipStatus.SOULMATE);
        fridayRob.changeTopic();
        rob.toChangeState(CharacterState.STANDING);
        rob.toChangeState(CharacterState.WALKING);
        fridayRob.toOrder(rob);
        rob.toPray();

        for (int i=0;i<5;i++)
            jesusRob.toAsk(rob);
        rob.toReflect();
        World.addYear();
        System.out.println();
        World.printYear();

        System.out.println();
        fridayRob.changePromixity(CharacterProximity.CLOSE);
        rob.setCharacterState(CharacterState.SITTING);

        fridayRob.toStartDiscuss();
        for (int i=0;i<4;i++){
            rob.toPreach(friday);
            friday.toReflect();}
        System.out.println();
        System.out.println();
        World.addYear();
        World.printYear();
        toBeWitness();
        fridayRob.toBeHappytoMeet();
        rob.toEnjoyLife();
        rob.printSoul();
        friday.printSoul();
        fridayRob.changeStatus(RelationshipStatus.SOULMATE);
        World.addYear();
        World.printYear();
        //  тут у пятницы должна быть лучше душа чем у роба
        //  можно в целом вывести все параметры - у кого какая душа, состояние мира и проч и проч
        friday.toPray();
        rob.toPray();
        World.setCurrSeason(Season.SPRING);
        friday.cleanUp();


    }
}
