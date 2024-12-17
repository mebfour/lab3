package interfaces;

import classes.Apprentice;
import records.Beer;

public interface Teacher {
    public void toPreach(Apprentice p);
    public void toBrewing(Beer b);
    public void toEnjoyLife();
}
