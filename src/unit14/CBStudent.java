package unit14;

public class CBStudent extends Person {


    public void sayOpinionAboutCB() {
        System.out.println("CB is cool");
    }

    public void programInJava() {
        System.out.println("I can program in Java");
    }

    @Override
    public String toString() {
        return "CBStudent{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);

    }
}
