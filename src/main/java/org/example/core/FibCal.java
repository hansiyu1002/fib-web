package org.example.core;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibCal {
    public BigInteger[] cal(int n) {
        BigInteger[] fib = new BigInteger[n];
        fib[0] = new BigInteger("0");
        fib[1] = new BigInteger("1");
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        return fib;
    }

    public String[] fib(int n) {
        String[] res = new String[n];
        BigInteger[] fib = cal(n);
        for (int i = 0; i < n; i++) {
            res[i] = fib[i].toString();
        }
        return res;
    }

    public String[] fibSorted(int n) {
        BigInteger[] fib = cal(n);
        ArrayList<BigInteger> even = new ArrayList<BigInteger>();
        ArrayList<BigInteger> odd = new ArrayList<BigInteger>();
        BigInteger two = new BigInteger("2");
        for (int i = 0; i < n; i++) {
            if (fib[i].mod(two).intValue() == 0) {
                even.add(0, fib[i]);
            } else {
                odd.add(fib[i]);
            }
        }
        even.addAll(odd);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = even.get(i).toString();
        }
        return res;
    }
}
