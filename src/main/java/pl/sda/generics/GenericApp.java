package pl.sda.generics;

public class GenericApp {
    public static void main(String[] args) {
        Trio<String, Boolean, Integer> trio1 = new Trio<>("Mama",true,15);
        Trio<String, Boolean, Integer> trio2 = new Trio<>("FAWGAD",false,15);
        Trio<String, String, Double> trio3 = new Trio<>("Mama","String",15.6);
        trio1.print();
        trio3.print();

        }

}
