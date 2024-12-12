package classes;

import java.lang.reflect.Array;
import java.util.Random;

public class Story {
    final public static String[] themes = {"учить опасению Дикаря",
            "вдохновить духом сердце этого жалкого невежественного создания",
            "даровал Дикарю свет познания бога во Христе",
            "обратить Дикаря к себе",
            "изложить Дикарю слово божие",
            "убедить совесть Дикаря",
            "открыть глаза Дикарю",
            "спасти душу Дикаря"};
    public static String getThemes(int n){
        return themes[n];
    }
    final public static String[] sermons = {
            " об Искуплении человека спасителем мира",  //0
            " об Учении Евангелия, возвещенного с неба",//1
            " о том, почему наш искупитель не принял ангельского облика",//2
            " о том, почему наш искупитель произошел от семени Авраамова"//3 (2.1)
    };
    final public static String[][] prosermons = {{""},
            {" о раскаянии перед богом", " о вере в нашего всеблагого господа Иисуса"},  //1
            {" о том, почему падшие ангелы не могут надеяться на спасение", " о том, что Он пришел только для того, чтобы спасти погибших овец дома Израилева"}//2
    };
    public static String getSermons(int n){
        return sermons[n];
    }
    public static String getproSermons(int n){
        Random n1 = new Random();
        return prosermons[n][n1.nextInt(2)];
    }
}
