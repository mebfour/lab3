package enums;

public enum RelationshipStatus {
    FRIENDS ("друзьями"),
    ACQUAINTANCES("знакомыми"),
    ENEMIES ("врагами"),
    NONE ("черт знает кем"),
    SOULMATE("родственными душами"),
    SUBORDINATE("однополчанами");



    private final String description;

    // Конструктор для описания расположения
    RelationshipStatus(String description) {
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
