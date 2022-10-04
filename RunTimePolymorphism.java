
class superClass {

    void meth1() {
        System.out.println("Hello meth1()");
    }

    void meth2() {
        System.out.println("hello meth2()");
    }

}

class subClass extends superClass {

    void meth2() {
        System.out.println("hello meth2()");
    }

    void meth3() {
        System.out.println("hello meth3()");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {

        // Dynamic method dispatch

        superClass s = new subClass();
        // here the refernce of super class and object are created of sub class

        // now meth2 is available in both super and sub class so at the run time
        // compiler
        // will se whose method is to be called so it see the object attached to
        // refrence
        // and call those methods becuase methods are called based on their object not
        // on
        // refrence. so at run time compiler will decide and call the meth2 of sub class
        // because
        // objects are created of sub class without the execution of program i.e at
        // compile time
        // compiler will not able to decide which methods is to be called
        // this is the concept of run time polymorphism
        s.meth1();
        s.meth2();
    }
}
