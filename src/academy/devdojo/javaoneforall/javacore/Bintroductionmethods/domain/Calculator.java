package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(10 - 10);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num1 == 0 && num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void printTwoNumbersDivided(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't divide by 0");
            return;
        }
        System.out.println(num1 / num2);

    }

    public void changeTwoNumbers(int nbr1, int nbr2){
        nbr1 = 99;
        nbr2 = 33;
        System.out.println("Inside changeTwoNumbers ");
        System.out.println("Num1 : " + nbr1 + " Num2 : " + nbr2);
    }

}
