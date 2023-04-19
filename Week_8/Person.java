public class Person {

    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {

    public static final int freshman = 1;
    public static final int sophomore = 2;
    public static final int junior = 3;
    public static final int senior = 4;

    protected int status;

    Student(String name) {
        super(name);
    }

    public String toString() {
        /* We can use getName method from Person class becauseit is our parent class */
        return "Student: " + getName();
    }

}

class Employee extends Person {

    protected String office;
    protected int salary;
    protected java.util.Calendar dateHired;

    Employee(String name) {
        super(name);
    }

    public String toString() {
        /* We can use getName method from Person class becauseit is our parent class */
        return "Employee: " + getName();
    }

}


class Faculty extends Employee {

    public static final int lecturer = 1;
    public static final int proffessor = 2;
    public static final int assistant = 3;

    protected String officeHours;
    protected int rank;

    Faculty(String name) {
        super(name);
    }

    public String toString() {
        return "Employee: " + name;
    }

}


class Staff extends Employee {
    
    protected String title;

    Staff(String name) {
        super(name);
    }

    public String toString() {
        return "Staff: " + name;
    }
}
