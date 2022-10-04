abstract class Hospital {
    abstract void admit();

    abstract void billing();

    abstract void emergency();

}

// what is the use of abstarct class
/*
 * Abstarct class provide the standard to their sub class to implement it
 * consider ecample of this hospital if you want to open your hospital
 * then you have to take approval of some gov autthority so they provvide you a
 * certain standard
 * and you have to follow that standard to open your hospital
 * so this is the concept of abstarct class
 * so abstarct class provide the standard to their sub class to implement it
 * 
 */
class MyHospital extends Hospital {
    void admit() {
        System.out.println("This is admit ward");
    }

    void billing() {
        System.out.println("Pay billing ward");
    }

    void emergency() {
        System.out.println("Emergency ward");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Hospital s = new MyHospital();
        // you can not create object of abstarct class
        // but you can create refrence of abstarct class
        // and object of sub class
        // and you can call the methods of abstarct class
        // When you open hospital people will not say full name just say hospital
        // so they refer your hospital by the name of hospital

        s.admit();
        s.billing();
        s.emergency();
    }
}
