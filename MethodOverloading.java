public class MethodOverloading {

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static float max(float a, float b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        return a > b && a > c ? a : b > c && b > a ? b : c;
    }

    public static void main(String[] args) {
        // two or more methods have the same name but thet diffrent in parameter
        System.out.println(max(23, 45));
        System.out.println(max(2.3f, 4.6f));
        System.out.println(max(2, 4, 5));

    }
}
