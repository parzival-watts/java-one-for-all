package academy.devdojo.javaoneforall.introduction;

/*
        Data Type   Size 	Description
        byte 	    1 byte 	    Stores whole numbers from -128 to 127
        short 	    2 bytes 	Stores whole numbers from -32,768 to 32,767
        int 	    4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long 	    8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float 	    4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double 	    8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean     1 bit 	    Stores true or false values
        char 	    2 bytes 	Stores a single character/letter or ASCII values
*/



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
        String name = "Parzival";
        System.out.println("The age is " + age + " years old");
        System.out.println(name);
    }
}
