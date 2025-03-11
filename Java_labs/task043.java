package lab8.task1;
// Abstract class Marks
abstract class Marks {
    abstract float getPercentage();  // abstract method to calculate percentage
}

// Class A, inherits Marks
class A extends Marks {
    float marks1, marks2, marks3;
    
    // Constructor for Class A
    A(float m1, float m2, float m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }
    
    // Method to calculate percentage for Class A
    float getPercentage() {
        float totalMarks = marks1 + marks2 + marks3;
        return (totalMarks/300) * 100;
    }
}

// Class B, inherits Marks
class B extends Marks {
    float marks1, marks2, marks3, marks4;
    
    // Constructor for Class B
    B(float m1, float m2, float m3, float m4) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
        marks4 = m4;
    }
    
    // Method to calculate percentage for Class B
    float getPercentage() {
        float totalMarks = marks1 + marks2 + marks3 + marks4;
        return (totalMarks/400) * 100;
    }
}

// Main class


public class task043 {
    public static void main(String[] args) {
        A studentA = new A(75, 80, 85);  // creating object for Class A
        B studentB = new B(85, 70, 75, 90);  // creating object for Class B
        
        // Printing percentage of marks for both students
        System.out.println("Percentage of marks obtained by Student A: " + studentA.getPercentage());
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage());
    }
}
    

