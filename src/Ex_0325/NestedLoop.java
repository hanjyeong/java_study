package Ex_0325;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i=1;i<=9;i++){ //단
            for(int j=1;j<=9;j++){ //각 단의 곱셈
                System.out.print(i+"*"+j+"= "+i*j);
                System.out.print("\t");
            }
            System.out.println();

        }

    }
}
