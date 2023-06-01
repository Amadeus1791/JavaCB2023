package unit14;

public class Main {
    public static void main(String[] args) {
        // static type <--------> dynamic type
        Object o1 = new Person();
        Object o2 = new CBStudent();
        Person p1 = new Person();
        Person p2 = new CBStudent();
        CBStudent cbStudent = new CBStudent();
        System.out.println(o1);
        System.out.println(o2);



        // CBStudent p3 = new Person();
        // Person p4 = new Object();


    }
}
