package lang.math.test;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] generate = lottoGenerator.generate();

        System.out.print("로또 번호: ");
        for (int i : generate) {
            System.out.print(i + " ");
        }
    }
}
