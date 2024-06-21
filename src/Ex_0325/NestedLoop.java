package Ex_0325;

public class NestedLoop {
    public static void main(String[] args) {

        /*for(int i=1;i<=9;i++) {
            for (int j = 2; j <= 9; j++) {//단
                System.out.printf("%2d%2s%2d%2s%2d ",j,"X",i,"=",j*i);
            }
            System.out.println();
        }*/


        for(int i=1;i<=9;i++){ //단
            for(int j=1;j<=9;j++){ //각 단의 곱셈
                System.out.print(i+"*"+j+"= "+i*j+"\t");
            }
            System.out.println();
        }


    }
}
