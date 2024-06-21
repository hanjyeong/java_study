package Ex_0513;

public class WrapperEx {
    public static void main(String[] args) {

        //Chracter
        System.out.println(Character.toLowerCase('A'));
        char c1 = '4', c2 = 'F';
        if(Character.isDigit(c1)) System.out.println(c1 + "는 숫자");
        if(Character.isAlphabetic(c2)) System.out.println(c2 + "는 영문자");

        //Integer
        System.out.println(Integer.parseInt("28") + 10);
        System.out.println(Integer.toString(28)+10); // 한지형
        Integer i =28; // 자동 박싱
        System.out.println(i.doubleValue());
        System.out.println((double)i); // 자동 언박싱 후 형변환

        //Double
        Double d = 3.14;
        System.out.println(d.toString());
        System.out.println(Double.parseDouble("3.14"));
    }
}
