package lang.String.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; //대문자 없음 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str2: " + str1.equalsIgnoreCase(str2));

        // compareTo 사전상에서 순서 차이
        System.out.println("'a' compareTo 'b' : " + "a".compareTo("b")); // -1 : a는 b보다 하나 앞
        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a")); // 1 : b는 a보다 하나 뒤
        System.out.println("'c' compareTo 'a' : " + "c".compareTo("a")); // 2 : a는 c보다 2 뒤에

        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3)); // -13
        System.out.println("str1 compareTo str2 : " + str1.compareToIgnoreCase(str2)); //0

        System.out.println("str1 start with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 end with 'Java!': " + str1.endsWith("Java!"));
    }
}
