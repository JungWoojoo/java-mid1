package lang.String.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        // 코드 작성
        int sum = 0;
        for (String s : arr) {
            int length = s.length();
            System.out.println(s + ":" + length);
            sum += length;
        }
        System.out.println("sum = " + sum);
    }
}
