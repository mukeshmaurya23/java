import java.lang.*;

public class DataTypesDetails {
    public static void main(String[] args) {
        int x = -3;
        System.out.println(Integer.toBinaryString(x));

        // for (char c = 0x0900; c <= 0x0970; c++) {
        // System.out.println(c + "");
        // }
    }
}

/*
 * int x=3
 * 8421
 * 0000 0011
 * so x=11 in binary format
 * 
 * int x=-3
 * 0000 0011
 * 1's Compliment 1111 1100
 * 2's compliment +1
 * ---------
 * 1111 1101
 * so x=11111101 of -3 in binary format
 * 
 */