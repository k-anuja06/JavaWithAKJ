public class A24PrintGrade {
    public static void main(String[] args) {
        int marks = 93;
        if (marks >= 91 && marks <= 100) {
            System.out.println("A+");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("A");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("B+");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("B");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("C+");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("C");
        }else if (marks >= 41 && marks <= 50) {
                System.out.println("D+");
            } else {
            System.out.println("D");
        }
    }
    
}
