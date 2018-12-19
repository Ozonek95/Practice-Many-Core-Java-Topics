package pl.sda.enum_exercise.CoffeShop;

public enum Coffee {
    LATTE(true,true,true,true),
    AMERICANO(false,true,false,true),
    MACCHIATO(false,true,true,false);


    boolean component1;
    boolean component2;
    boolean component3;
    boolean component4;

    String comp1="bita śmietana";
    String comp2="mleko";
    String comp3="miód";
    String comp4="orzechy";

    Coffee(boolean component1, boolean component2, boolean component3, boolean component4){
        this.component1 = component1;
        this.component2= component2;
        this.component3=component3;
        this.component4=component4;
    }



    @Override
    public String toString() {
        String result ="Coffee "+this.name()+" composed of: ";
        if(component1){
            result+=comp1+", ";
        }
        if(component2){
            result+=comp2+", ";
        }
        if(component3){
            result+=comp3+", ";
        }
        if(component4){
            result+=comp4+". ";
        }
        return result;
    }
}
