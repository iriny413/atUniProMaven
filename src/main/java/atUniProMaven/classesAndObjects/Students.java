package atUniProMaven.classesAndObjects;

public class Students {
    String nameA;
    int roll_noA;
    int phone_numberA;
    String addressA;
}

class Answer {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.nameA = "John";
        s1.roll_noA = 1;
        s1.phone_numberA = 34567;
        s1.addressA = "Parkstreet, 16, Vienna, AT, 67890";

        System.out.println("Name is " + s1.nameA + " and roll number is " + s1.roll_noA + " ; number: " + s1.phone_numberA + " ;address: " + s1.addressA);

        Students s2 = new Students();
        s2.nameA = "Sam";
        s2.roll_noA = 2;
        s2.phone_numberA = 34567;
        s2.addressA = "Parkstreet, 16, Vienna, AT, 67890";

        System.out.println("Name is " + s2.nameA + " and roll number is " + s2.roll_noA + " ; number: " + s2.phone_numberA + " ;address: " + s1.addressA);


    }
}
