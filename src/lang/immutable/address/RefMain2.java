package lang.immutable.address;

import java.lang.management.MemoryUsage;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
