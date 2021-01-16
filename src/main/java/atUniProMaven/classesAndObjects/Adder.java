package atUniProMaven.classesAndObjects;

public class Adder {
    int n = 0;
    int n2 = 0;

    public Adder(int n) {
        this.n = n;
    }

    public int add5(int n2) {
        int result = n2 + 5;
        System.out.println(result);
        return result;
    }

    public int add6(int n2) {
        int result = n2 + 6;
        System.out.println(result);
        return result;
    }
}

class AdderResult {
    public static void main(String[] args) {
        Adder a5 = new Adder(5);
        a5.add5(6);
        a5.add5(3);

        Adder a6 = new Adder (6);
        a6.add6(7);
        a6.add6(2);
    }
}
