import java.util.Scanner;

class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void setDetails(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class Student extends Person {
    int rollNumber;

    public Student(String name, int age, String address, int rollNumber) {
        super(name, age, address);
        this.rollNumber = rollNumber;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Staff extends Person {
    String employeeId;

    public Staff(String name, int age, String address, String employeeId) {
        super(name, age, address);
        this.employeeId = employeeId;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book Issued");
        } else {
            System.out.println("Book Not Available");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book Returned");
    }
}

class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Python Programming", "Jane Smith");

        Student student = new Student("Alice", 20, "123 Main St", 101);
        Staff staff = new Staff("Bob", 30, "456 Park Ave", "E101");

        System.out.println("Book 1 Details:");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);

        System.out.println("\nBook 2 Details:");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);

        System.out.println("\nStudent Details:");
        student.getDetails();

        System.out.println("\nStaff Details:");
        staff.getDetails();

        book1.issueBook();
        book2.issueBook();
        book1.returnBook();
        book2.issueBook();
    }
}

