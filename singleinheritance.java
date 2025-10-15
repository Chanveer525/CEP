// Demonstration of Single Inheritance
class Person {
    String name;
    int age;

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student class inherits from Person
class Student extends Person {
    String course;

    void displayStudentInfo() {
        System.out.println("Course: " + course);
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 21;
        s1.course = "Computer Science";

        System.out.println("**Student Details**");
        s1.displayPersonInfo();  // method of parent class
        s1.displayStudentInfo(); // method of child class
    }
}
