package atUniProMaven.classesAndObjects;

public class Employee {
    String name;
    String yesrOfJoining;
    String address;

    public Employee(String name, String yesrOfJoining, String address) {
        this.name = name;
        this.yesrOfJoining = yesrOfJoining;
        this.address = address;
    }
}

class PrintEmployeeInfo{

    public static void main(String[] args) {
        Employee e1 = new Employee("Alexander", "1994", "Lenina str., 12, 3");
        Employee e2 = new Employee("Maria", "2000", " Kirova str., 23, 77");
        Employee e3 = new Employee("Ilona", "1999", "Nevskogo str., 1, 1");

        System.out.println("Name          Year of joining          Address");
        System.out.println(e1.name+ "      "+ e1.yesrOfJoining+"               "+e1.address);
        System.out.println(e2.name+ "          "+ e2.yesrOfJoining+"              "+e2.address);
        System.out.println(e3.name+ "          "+ e3.yesrOfJoining+"               "+e3.address);
    }
}