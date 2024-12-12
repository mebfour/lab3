package enums;

public enum SermonTopic {
    REDEMPTION("Об искуплении человека спасителем мира"),
    GOSPEL_TEACHING("Об учении евангелия, возвещенном с неба, т. е. о раскаянии перед Богом и о вере в нашего всеблагого Господа Иисуса"),
    ANGELIC_FORM("Почему наш Искупитель не принял ангельского облика, а произошел от семени Авраамова"),
    FALLEN_ANGELS("По этой причине падшие ангелы не могут надеяться на спасение"),
    LOST_SHEEP("Что Он пришел только для того, чтобы спасти погибших овец дома Израилева");


    private final String description;

    SermonTopic(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
