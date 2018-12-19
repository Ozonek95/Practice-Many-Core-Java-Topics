package pl.sda.generics;

public class Trio<T,V,K>{
    private  T typeT;
    private V typeV;
    private  K typeK;

    public Trio(T typeT, V typeV, K typeK) {
        this.typeT = typeT;
        this.typeV = typeV;
        this.typeK = typeK;
    }

    public void print(){
        System.out.println(typeT);
        System.out.println(typeV);
        System.out.println(typeK);

    }

    public T getTypeT() {
        return typeT;
    }

    public V getTypeV() {
        return typeV;
    }

    public K getTypeK() {
        return typeK;
    }

    @Override
    public String toString() {
        return "Trio{" +
                  typeT +" "+
                  typeV +" "+
                 typeK +" "+
                '}';
    }
}
