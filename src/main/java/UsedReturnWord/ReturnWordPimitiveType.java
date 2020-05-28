package UsedReturnWord;

public class ReturnWordPimitiveType {
    public static void main(String[] args) {
        sumWithoutValueReurnt(6,5);
        int result = sumReutrnValue(6,5);
    }

    private static int sumReutrnValue(int a, int b) {
        return a+b;
    }
    private static void sumWithoutValueReurnt(int a, int b) {
        System.out.println("Result the of sum: ".concat(String.valueOf(a+b)));
        return;//optional
    }

}
