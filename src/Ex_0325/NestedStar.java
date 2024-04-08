package Ex_0325;

public class NestedStar {
    public static void main(String[] args) {

        System.out.println("---------------------");
        System.out.println("첫번째 예제");
        System.out.println("---------------------");
        for(int i=1;i<=5;i++){ //줄
            for(int j=1;j<=i;j++){ //별의 개수
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("---------------------");
        System.out.println("두번째 예제");
        System.out.println("---------------------");

        for(int i=1;i<=5;i++){ //줄
            for(int j=5;j>=i;j--){ //별의 개수
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------");
        System.out.println("세번째 예제");
        System.out.println("---------------------");

        for(int i=1;i<=5;i++){ //줄

               for(int k=1;k<=5-i;k++) { //공백
                   System.out.print(" ");
               }
               for(int j=1;j<=i;j++){ //별의 개수
                   System.out.print("*");
               }
            System.out.println();
           }

        }


    }

