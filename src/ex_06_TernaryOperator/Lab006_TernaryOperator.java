package ex_06_TernaryOperator;

public class Lab006_TernaryOperator {
    public static void main(String[] args) {
        int a=10;
        System.out.printf("Given number is ");
        System.out.println((a%2==0)?"Even":"false");

        //Problem 2
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        System.out.printf("Max number is ");
        System.out.println(n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3));

        //Problem 3
        int age=59;
        System.out.printf("Person is ");
        System.out.println(age>18?(age<=59?"Adult":"Senior Adult"):"Minor");
    }
}
