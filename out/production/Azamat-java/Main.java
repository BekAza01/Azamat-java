public class Main {
    public static void main(String[] args) {

        // Есеп 1
        Student1 s1 = new Student1("Ali", 18);
        Student1 s2 = new Student1("Aruzhan", 19);
        System.out.println("Students count: " + Student1.count);

        // Есеп 2
        Student2 s3 = new Student2("Dias");
        s3.showInfo();

        // Есеп 3
        System.out.println("Square: " + MathUtils.square(3));
        System.out.println("Cube: " + MathUtils.cube(3));

        // Есеп 4
        Counter.increment();
        Counter.increment();
        System.out.println("Counter: " + Counter.count);

        // Есеп 5-6
        System.out.println(Config.appName + " v" + Config.version);

        // Есеп 7
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();

        // Есеп 8
        University1 uni = new University1();
        University1.Student st = uni.new Student("Amina", "IT");
        st.show();

        // Есеп 9
        Computer comp = new Computer();
        Computer.Processor proc = comp.new Processor(3.5);
        proc.show();

        // Есеп 10
        Library lib = new Library();
        Library.Book book = lib.new Book("Java Basics");
        book.show();

        // Есеп 11
        Car car = new Car();
        Car.Engine engine = car.new Engine(200);
        engine.show();

        // Есеп 12
        System.out.println("Interest: " + Bank.calculateInterest(1000));

        // Есеп 13
        Company compa = new Company();
        Company.Employee emp = compa.new Employee("Nurlan", "Manager");
        emp.show();

        // Есеп 14
        Course course = new Course("Java");
        Course.Student student = course.new Student("Dana");
        student.show();

        // Есеп 15
        University2 u2 = new University2();
        University2.Student sA = u2.new Student("A");
        University2.Student sB = u2.new Student("B");
        System.out.println("University students: " + University2.studentCount);
    }
}

// -------- Есеп 1 --------
class Student1 {
    String name;
    int age;
    static int count = 0;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
}

// -------- Есеп 2 --------
class Student2 {
    String name;
    static String university = "SDU";

    Student2(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println(name + " - " + university);
    }
}

// -------- Есеп 3 --------
class MathUtils {
    static int square(int x) {
        return x * x;
    }

    static int cube(int x) {
        return x * x * x;
    }
}

// -------- Есеп 4 --------
class Counter {
    static int count = 0;

    static void increment() {
        count++;
    }
}

// -------- Есеп 5-6 --------
class Config {
    static String appName;
    static int version;

    static {
        appName = "MyApp";
        version = 1;
        System.out.println("Config initialized");
    }
}

// -------- Есеп 7 --------
class Outer {
    class Inner {
        void show() {
            System.out.println("Hello from Inner class");
        }
    }
}

// -------- Есеп 8 --------
class University1 {
    class Student {
        String name;
        String major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void show() {
            System.out.println(name + " - " + major);
        }
    }
}

// -------- Есеп 9 --------
class Computer {
    class Processor {
        double frequency;

        Processor(double frequency) {
            this.frequency = frequency;
        }

        void show() {
            System.out.println("Frequency: " + frequency + " GHz");
        }
    }
}

// -------- Есеп 10 --------
class Library {
    class Book {
        String title;

        Book(String title) {
            this.title = title;
        }

        void show() {
            System.out.println("Book: " + title);
        }
    }
}

// -------- Есеп 11 --------
class Car {
    class Engine {
        int power;

        Engine(int power) {
            this.power = power;
        }

        void show() {
            System.out.println("Power: " + power + " HP");
        }
    }
}

// -------- Есеп 12 --------
class Bank {
    static double interestRate = 0.1;

    static double calculateInterest(double amount) {
        return amount * interestRate;
    }
}

// -------- Есеп 13 --------
class Company {
    class Employee {
        String name;
        String position;

        Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        void show() {
            System.out.println(name + " - " + position);
        }
    }
}

// -------- Есеп 14 --------
class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        void show() {
            System.out.println(name + " studies " + courseName);
        }
    }
}

// -------- Есеп 15 --------
class University2 {
    static int studentCount = 0;

    class Student {
        String name;

        Student(String name) {
            this.name = name;
            studentCount++;
        }
    }
}