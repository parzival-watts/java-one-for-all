package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "testando";
        names[1] = "testando1";
        names[2] = "testando2";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }
}
