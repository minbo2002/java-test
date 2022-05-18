package ch06;

class 바구니 {  // 경우에따라 문자열을 담거나 숫자를 담거나

    Object data;
}

public class GenericEx01 {

    public static void main(String[] args) {

        바구니 s1 = new 바구니();
        s1.data=1;
        System.out.println(s1.data);

        바구니 s2 = new 바구니();
        s2.data="문자열";
        System.out.println(s2.data);
    }
}
