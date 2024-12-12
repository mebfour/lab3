package enums;

public enum CharacterState {
    STANDING("встал"),
    SITTING("сел"),
    LYING("лег"),
    WALKING("отправился на прогулку"),
    RUNNING("побежал"),
    RESTING("отдыхает");

    private final String description;

    // Конструктор для описания состояния
    CharacterState(String description) {
        this.description = description;
    }

    // Метод для получения описания состояния
    public String getDescription() {
        return description;
    }
    @Override
    public String toString(){
        return description;
    }
}
