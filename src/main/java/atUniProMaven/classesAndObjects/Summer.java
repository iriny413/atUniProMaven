package atUniProMaven.classesAndObjects;

public class Summer {

    int sum = 0;
    int n = 0;

    public void add(int n){
        sum = sum + n;
        System.out.println(sum);
    }
}

class SummerAns {

    public static void main(String[] args) {
        Summer sumA = new Summer();
        int sum = 0;
       sumA.add(5);
       sumA.add(3);
       sumA.add(10);
       sumA.add(1);
    }
}

