package org.example;

public class SumCalculator {
    public int sum(int n) {
        if(n<=0){
            throw new IllegalArgumentException();
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        SumCalculator s1 = new SumCalculator();
        System.out.println(s1.sum(3));
    }

}
