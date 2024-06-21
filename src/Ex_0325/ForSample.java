package Ex_0325;

public class ForSample {

    public static void main(String[] args) {

        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
            System.out.print(i);
            if(i<=9){
                System.out.print("+");
            }
            else {
                System.out.print("="+sum);
            }
        }
    }
}
// 1+2+3+...9+10=55;
/* i<=9일때는 숫자를 출력하고 뒤에 + 기호 출력
   i==10 일때는 =기호 출력하고 sum값 출력하기
* */