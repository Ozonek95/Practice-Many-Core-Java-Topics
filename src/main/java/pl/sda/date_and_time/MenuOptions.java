package pl.sda.date_and_time;

public enum MenuOptions {
    YEAR,DAY_OF_YEAR,MONTH,DAY_OF_MONTH,DAY,IF_LEAP;

    public static MenuOptions choseEnum(int i){
        MenuOptions[] options = MenuOptions.values();
        return options[i-1];
    }

}
