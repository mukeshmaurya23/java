public class Recursion {
    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);// op 1 2 3
            // fun(3) 3>0 fun(2) 2>0 fun(1) 1>0 fun(0) 0>0 false
            // then it goes to the S.o.p(print 1 2 3 ) like a rubber band stretch and when
            // you leave then itreturs its value
            System.out.println(n);
            // fun(n - 1); //op 3 2 1
        }
        // recursion is like a rubber band stratch and stretch once you leave
        // streatching then it return values
    }

    public static void main(String[] args) {
        fun(3);
    }
}
