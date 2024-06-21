package Ex_0513.app;

import Ex_0513.lib.Calculator; // 패키지 임포트
public class GoodCalc extends Calculator { // 한지형
    public int add(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        GoodCalc c= new GoodCalc();
        System.out.println(c.add(2,3));
    }


}
