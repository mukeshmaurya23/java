
class compileTime {
    // method overlaoding is achieve through compile time polymorphsim
    // two or mre methods having same name but thet differ parameters
    // they can have diff return type or signature of methods
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public float max(float a, float b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return a > b && a > c ? a : b > c && b > a ? b : c;
    }

    public void max(long a, long b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);

        }
    }
}

public class compileVsRuntime {
    public static void main(String[] args) {
        compileTime t = new compileTime();

        System.out.println("Int max " + t.max(10, 20));
        System.out.println("float max " + t.max(10.2f, 20.2f));
        System.out.println("Int max 3params " + t.max(10, 20, 40));
        System.out.println("Long max" + t.max(235589999, 2455667));
        // System.out.println("Int max " + t.max(10, 20));

    }
}
