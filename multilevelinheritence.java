// Base class - Employee
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

// Derived class - Manager inherits Employee
class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing the team.");
    }
}

// Further derived class - Director inherits Manager
class Director extends Manager {
    void strategize() {
        System.out.println("Director is strategizing business plans.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Director director = new Director();
        director.work();        // from Employee
        director.manage();      // from Manager
        director.strategize();  // from Director
    }
}
