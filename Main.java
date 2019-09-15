package mirea.ru;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Size: ");
         size = in.nextInt();
        byte[] mas = new byte[size];
        Treatment test = new Treatment();
        test.randomMas(mas);
        //test.inMas(mas);
        test.printMas(mas);
        System.out.print("Right - Left: \n");
        test.printRMas(mas);
        System.out.println("count smaller: ");
        System.out.println(test.cntSmaller(mas,45));
        System.out.println(test.symmetryMas(mas));
    }

}
