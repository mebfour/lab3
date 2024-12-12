import classes.*;
import enums.CharacterProximity;
import enums.CharacterState;
import enums.RelationshipStatus;
import interfaces.God;

import static classes.Jesus.jesus;
import static interfaces.God.toBeWitness;


public class Test {
     static void test(){
        String water = "";
        God.toMagic(water);
        System.out.println();

        Apprentice friday = new Apprentice("Пятница", 0, 5);
        Mentor rob = new Mentor("Робинзон", 6, 4);
        Relationship fridayRob = new Relationship( friday,rob, RelationshipStatus.SUBORDINATE);    //не меняй порядок
        Relationship jesusRob = new Relationship(jesus, rob, RelationshipStatus.SOULMATE);


        rob.toChangeState(CharacterState.STANDING);
        rob.toChangeState(CharacterState.WALKING);
        fridayRob.toOrder(rob);
        rob.toPray();

        for (int i=0;i<10;i++)
            jesusRob.toAsk(rob);
        World.addYear();
        System.out.println();
        System.out.println();
        fridayRob.changePromixity(CharacterProximity.CLOSE);
        rob.setCharacterState(CharacterState.SITTING);

        fridayRob.toStartDiscuss();
        for (int i=0;i<4;i++)
            rob.toPreach(friday);
        System.out.println();
        System.out.println();
        World.addYear();
        toBeWitness();
        fridayRob.toBeHappytoMeet();
        rob.toEnjoyLife();
        fridayRob.changeStatus(RelationshipStatus.SOULMATE);
        World.addYear();
        World.printYear();
        //  тут у пятницы должна быть лучше душа чем у роба
        //  можно в целом вывести все параметры - у кого какая душа, состояние мира и проч и проч
        friday.toPray();
        rob.toPray();


    }
}
