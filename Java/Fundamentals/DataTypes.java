package Fundamentals;

public class DataTypes {

    /**
     * Java has 8 primitive data types:
     * byte, short, int, long, float, double, char, boolean
     */

    public static void main(String[] args) {

        String myName = "Master";     // Not a primitive
        byte myByte = 100;            // 8-bit integer
        short myShort = 30000;        // 16-bit integer
        int myAge = 20;               // 32-bit integer
        long myLong = 123456789L;     // 64-bit integer (note the 'L')
        float myWeight = 51.4F;       // 32-bit float (note the 'F')
        double mySalary = 30250.933;  // 64-bit double
        char myGrade = 'A';           // Single 16-bit Unicode character
        boolean isStudent = false;    // true/false value

        System.out.println("Name: " + myName);
        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Age: " + myAge);
        System.out.println("Long value: " + myLong);
        System.out.println("Weight: " + myWeight);
        System.out.println("Salary: " + mySalary);
        System.out.println("Grade: " + myGrade);
        System.out.println("Student: " + isStudent);
    }
}
