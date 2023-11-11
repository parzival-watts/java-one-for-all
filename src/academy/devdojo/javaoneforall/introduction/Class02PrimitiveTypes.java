package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args){
        // int, double, float, boolean, char, byte, short, long
        int age = 10; // -2,147,483,648 to 2,147,483,647  4 bytes
        long bigNumber = 1000; // -9,223,372,036,854,775,808 to 9,223,372,036,854,750,000  8 bytes
        float salaryFloat = 2500; // 3.4e-038 to 3.4e+038  4 bytes
        double salaryDouble = 5000; // 1.7e-038 to 3.4e+038 8 bytes
        boolean trueValue = true; //true or false 1 byte
        boolean falseValue = false; //true or false 1 byte
        short ageShort = 29; // -32768 to 32767 2 bytes
        byte ageByte = 39; // -128 to 127 1 byte
        char character = 'W'; // 2 bytes
        System.out.println("The age is " + age + " years old");
    }
}
