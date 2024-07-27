package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져온다.
        long c = System.currentTimeMillis();
        System.out.println("c = " + c);

        //현재 시간(나노초)를 가져온다.
        long n = System.nanoTime();
        System.out.println("n = " + n);

        //환경 변수를 읽는다.(운영체제가 사용하는)
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다.(자바가 사용하는)
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.(자바에서 운영체제로 넘기고 운영체제 하드웨어에서 복사 후 자바로 넘김)
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
