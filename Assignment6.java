package Assignments;

// Parent Class
 class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Child Class
 class Student extends Person {
    int marks;

    // Constructor
    Student(String name, int age, int marks) {
     super(name, age); // calling parent constructor
        this.marks = marks;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
public class Assignment6 {
    
    public static void main(String[] args) {
        Student s = new Student("Ashitha", 22, 85);
        s.display();
    }
}