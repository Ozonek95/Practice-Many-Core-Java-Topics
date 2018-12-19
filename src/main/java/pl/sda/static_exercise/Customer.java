package pl.sda.static_exercise;

public class Customer implements Person{

    public Customer(String name) {
        this.name = name;

    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return "Custorem e-mail :"+getName()+"@gmial.com";
    }

    @Override
    public String toString() {
        return "Customer "+name;
    }
}
