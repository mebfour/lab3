package enums;

public enum CharacterProximity {
    CLOSE("подошел к"),
    NEAR("рядом"),
    FAR("далеко"),
    DISTANT("удаленно"),
    WITHIN_REACH("в пределах досягаемости"),
    OUT_OF_REACH("вне досягаемости");

    private final String description;

    // Конструктор для описания расположения
    CharacterProximity(String description) {
        this.description = description;
    }

    // Метод для получения описания расположения
    public String getDescription() {
        return description;
    }
    @Override
    public String toString(){
        return description;
    }
}
