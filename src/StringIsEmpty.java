import java.util.Scanner;

public class StringIsEmpty {
    public static void main(String[] args) {
        String test1 = "";
        String test2 = "faerie";
        System.out.println("Test metody IsEmpty klasy String");
        System.out.println("Zawartosć łańcucha Test1: " + test1);
        System.out.println("Długość łańcucha Test1: " + test1.length());
        System.out.println("Czy String Test1 jest pusty?\t" + test1.isEmpty());
        System.out.println();
        System.out.println("Zawartosć łańcucha Test2: " + test2);
        System.out.println("Długość łańcucha Test2: " + test2.length());
        System.out.println("Czy String Test2 jest pusty?\t" + test2.isEmpty());
    }
}
