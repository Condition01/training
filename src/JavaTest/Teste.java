package JavaTest;

public class Teste {

    public static void main(String[] args) {

    }

    interface Source<T> {
        T nextT();
    }

    void demo(Source<String> strs) {
        Source<? extends Object> objects = strs; // !!! Not allowed in Java
        // ...
    }

}
