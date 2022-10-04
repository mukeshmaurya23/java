class tv {
    public tv() {
        System.out.println("tv constructor");
    }

    public void show() {
        System.out.println("Tv show ");
    }
}

class smartTv extends tv {
    public smartTv() {
        System.out.println("SmartTv const");
    }

    public void show() {
        System.out.println("SmartTv show");
    }

    public void display() {
        System.out.println("display method");
    }
}

public class overriding {
    public static void main(String[] args) {
        // tv t = new tv();
        // t.show();
        // dynamic method dispatch in java
        tv t1 = new smartTv();
        t1.show();
        // t1.display(); you cNNOT Call the methods with super refrence because display
        // method not avaialbe in super
    }
}
