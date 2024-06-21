package Ex_0325;

public class DoWhileSample {
    public static void main(String[] args) {

        char a='a';

        // do-while
        do{
            System.out.print(a);
            a=(char)(a+1);
        }while (a<='z');

        System.out.println();
        for(a='a';a<='z';a++){
            System.out.print(a);
        }

        //22017100 한지형
    }
}
