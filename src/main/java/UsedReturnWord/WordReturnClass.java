package UsedReturnWord;

public class WordReturnClass {
    public static void main(String[] args) {
        Sum sum = createObjetSum(4,7);
        System.out.println("Result the add is; " + sum.add());
    }
    private static Sum createObjetSum(int a, int b) {
        return new Sum(a,b);
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
    public int add(int a, int b){
        return (a+b);
    }
}

