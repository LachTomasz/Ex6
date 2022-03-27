import java.util.SortedMap;

public class TestChar {
    public static void main(String[] args) {
        String A = "A\240b3&4\040";
        String B = "Łoś_0+\t";
        String C = "#\"\304\\\344\b\n";

        System.out.println();
        System.out.println("Method:\nA:\tisDigit()\nB:\tisLetter()\nC:\tisLetterOrDigit()\n" +
                "D:\tisLowerCase()\nE:\tisSpaceChar\nF:\tisUpperCase()\nG:\tisWhitespace()P");
        TestChar(A);
        TestChar(B);
        TestChar(C);
    }

    static void TestChar(String str){

        char[] Tab = str.toCharArray();

        System.out.println();
        System.out.println("String: " + str);
        System.out.println();
        System.out.println("Char\tA\t\tB\t\tC\t\tD\t\tE\t\tF\t\tG");
        System.out.println("---------------------------------------------------------------");

        for(char ch : Tab){
            System.out.print(ch + "\t\t" + Character.isDigit(ch) + "\t");
            System.out.print(Character.isLetter(ch) + "\t" + Character.isLetterOrDigit(ch) + "\t");
            System.out.print(Character.isLowerCase(ch) + "\t" + Character.isSpaceChar(ch) + "\t");
            System.out.println(Character.isUpperCase(ch) + "\t" + Character.isWhitespace(ch));
        }
    }
}
