package objJJ.Sachmatai;

import java.math.BigInteger;

public class Sachmatai {
    public static void main(String[] args) {

    int s = 1;
    BigInteger big = BigInteger.ONE;
    for (int i = 1; i<=64; i++) {
        System.out.println(i + " = " + s + " | " + big);
        s*=2;  // s = s * 2
        big = big.multiply(BigInteger.TWO);
    }
    }
}
