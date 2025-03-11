package lab8.task1;
abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double sub1, sub2, sub3;

    A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    double getPercentage() {
        double totalMarks = sub1 + sub2 + sub3;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    double sub1, sub2, sub3, sub4;

    B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    double getPercentage() {
        double totalMarks = sub1 + sub2 + sub3 + sub4;
        return (totalMarks / 400) * 100;
    }
}


public class task4 {
    public static void main(String[] args) {
        A studentA = new A(80, 75, 90);
        B studentB = new B(85, 90, 80, 70);

        System.out.println("Percentage of marks obtained by Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage() + "%");
    }
}
    

