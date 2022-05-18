package ch06;

abstract class 공 {
    abstract String getName();
}

class 농구공 extends 공{
    private String name = "농구공";

    public String getName() {  // 자식이 부모의 메서드와 동일한것을 같고있으면
        return name;           // 부모의 메서드가 오버라이드(무효화) 된다.
    }

    public void setName(String name) {
        this.name = name;
    }
}

class 축구공 extends 공{
    private String name = "축구공";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class 가방<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class GenericEx03 {

    static 가방<? extends 공> 꺼내기(int time) {
        if(time==9) {
            축구공 s1 = new 축구공();
            가방<축구공> g2 = new 가방<>();
            g2.setData(s1);

            return g2;

        }else {
            농구공 b1 = new 농구공();
            가방<농구공> g1 = new 가방<>();
            g1.setData(b1);

            return g1;
        }
    }

    public static void main(String[] args) {
        가방<? extends 공> r1 = 꺼내기(9);
        가방<? extends 공> r2 = 꺼내기(12);

        System.out.println(r1.getData().getName());
        System.out.println(r2.getData().getName());
    }
}
