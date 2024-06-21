package Ex_0422;

abstract class Calc{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int []a);
}
public class GoodCalc extends Calc { // 추상클래스 구현
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        GoodCalc c= new GoodCalc();

        System.out.println(c.add(2,3));
        System.out.println(c.subtract(5,4));
        System.out.println(c.average(new int[]{1,2,3}));
    }
}
