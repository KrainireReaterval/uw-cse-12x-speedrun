//This code explores types, casting, and basic output in Java.

public class types{
    public static void main(String[] args) {
        String name = "Alice";
        char initial = 'A';
        int age = (int) 20.2;
        double gpa = 3.8;
        boolean isStudent = true;

        System.out.println( "Name: " + name);
        System.out.println("Initial: " + initial);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Is a Student: " + isStudent);
        System.out.println("I am " + age + " years old with a GPA of " + gpa + ". ");
        System.out.println("My age in decades (rounded down): " + (age / 10));
        System.out.println("In ten years I will be " + (age + 10) + " years old.");
        System.out.println("My GPA as a whole number: " + (int) gpa);
    }
}