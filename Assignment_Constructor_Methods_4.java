import java.util.*;

abstract class Marks {
    abstract double getPercentage();
}

// Class for Student A
class A extends Marks {
    private int subject1, subject2, subject3;

    public A(int s1, int s2, int s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

// Class for Student B
class B extends Marks {
    private int subject1, subject2, subject3, subject4;

    public B(int s1, int s2, int s3, int s4) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        A studentA = new A(80, 90, 85);
        B studentB = new B(75, 85, 80, 90);

        System.out.println("Percentage of Student A: " 
                           + studentA.getPercentage() + "%");

        System.out.println("Percentage of Student B: " 
                           + studentB.getPercentage() + "%");
    }
}