package pl.sda.enum_exercise;

public enum Color {
    RED("nice"),
    GREEN("nice"),
    BLUE("not nice"),
    BLACK("nice"),
    WHITE("not nice");

    private String niceOrNot;

     Color(String niceOrNot){
        this.niceOrNot = niceOrNot;

    }

    public String getNiceOrNot() {
        return niceOrNot;
    }
}
