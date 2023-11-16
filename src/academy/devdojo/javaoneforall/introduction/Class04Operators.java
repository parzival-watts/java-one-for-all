package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args){
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number01 - number02;
        System.out.println(result);

        // %
        int modulo =20 % 2;
        System.out.println(modulo);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTeEqualsThanTwenty = 10 == 20;
        System.out.println("isTeEqualsThanTwenty " + isTeEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);
        System.out.println("isTenLowerThanTwenty " + isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwenty " + isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty " + isTenLowerOrEqualsThanTwenty);

        // && (AND)  || (OR) ! (NOT)

        int age = 35;
        float salary = 3550F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age <= 30 && salary >= 3381;
        System.out.println("isLegalOlderThanThirty" + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty" + isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingsAccount = 3000;
        float playstationFivePrice = 500;
        boolean canBeBought = currentAccount > playstationFivePrice || savingsAccount > playstationFivePrice;
        System.out.println("canBeBought " + canBeBought);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 2000;
        bonus += 1000; // bonus = bonus + 1000
        bonus -= 1000; // bonus = bonus - 1000
        bonus *= 2; // bonus = bonus * 2
        bonus /= 10; // bonus = bonus / 10
        System.out.println(bonus);

        // Unary ++ --
        int count = 0;
        count++;
        ++count;
        count--;
        --count;
        System.out.println(count);
    }
}
