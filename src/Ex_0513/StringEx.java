package Ex_0513;

public class StringEx {
    public static void main(String[] args) {

        String a = new String("C#");
        String b = new String(",C++,Js ");

        System.out.println(a+"의 길이는 "+a.length());
        System.out.println(a.contains("#")); // contains 문자열 포함 관계
        a=a+b; // 문자열 연결
        a=a.trim(); //  trim 문자열 앞 뒤 공백제거
        System.out.println(a);
        a = a.replace("C#", "Java");
        System.out.println(a);

        String []s=a.split(","); // split 문자열 분리
        for(int i=0;i<s.length;i++){
            System.out.println("분리된 문자열"+i+" : "+s[i]);
        }

        int i=b.indexOf("J");
        a=b.substring(i); // i 인덱스 이후 문자열 주출
        System.out.println(a);
        char c = a.charAt(0);
        System.out.println(c);
    }
}
