package UsedReturnWord;

public class WordReturnClass {
    public static void main(String[] args) {
        Sum sum = createObjetSum();
        System.out.println("Result the add is; " + sum.add());
    }
    private static Sum createObjetSum() {
        Sum sum = new Sum(4, 6);
        return sum;
    }
}

class Sum {
    int a;
    int b;
    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add() {
        return (this.a + this.b);
    }
}

