package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        boolean isAllowedToBuyAlcohol = age >= 18;
        if (isAllowedToBuyAlcohol) {
            System.out.println("Inside IF ");
            System.out.println("Authorized to buy alcohol");
        }else{
            System.out.println("Sorry, you not allowed to buy alcohol");
        }
        System.out.println("Outside IF");

        // !
        if (!isAllowedToBuyAlcohol){
            System.out.println("Sorry, you not allowed to buy alcohol");
        }
    }
}
