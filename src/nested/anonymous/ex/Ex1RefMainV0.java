package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV0 {
    public static void hello(String str){
        System.out.println("프로그램 시작");
        //코드 조각 시작
        if((str).equalsIgnoreCase("dice")){
            Hello.dice();
        } else if (str.equalsIgnoreCase("sum")) {
            Hello.sum();
        }
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }

    static class Hello {
        public static void dice() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
        public static void sum() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
    public static void main(String[] args) throws Exception {
       hello("Dice");
       hello("SUm");
    }
}
