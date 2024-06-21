package Ex_0513;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String query = "name=kitae&addr=seoul&age=21";
        StringTokenizer st = new StringTokenizer(query, "&"); // &로 문자열 구분
        int n= st.countTokens(); //토큰의 개수
        System.out.println("토큰의 개수= "+n);

        while (st.hasMoreTokens()){ // 토큰이 존재하는 경우
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}
