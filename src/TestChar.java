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
        System.out.println();
        TestCharExample(A);
        System.out.println();
        TestChar(B);
        System.out.println();
        TestCharExample(B);
        System.out.println();
        TestChar(C);
        System.out.println();
        TestCharExample(C);
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

    static void TestCharExample(String str){
        System.out.println("Znaki: "+str);
        char[] znaki = str.toCharArray();
        System.out.print("Znak ");
        for(char z : znaki)
            System.out.print("\t"+z);
        System.out.println();
        System.out.print("Kod znaku ");
        for(char z : znaki)
            System.out.print("\t"+(int)z);
        System.out.println();
        System.out.print("isDigit() ");
        for(char z : znaki)
            System.out.print("\t"+Character.isDigit(z));
        System.out.println();
        System.out.print("isLetter() ");
        for(char z : znaki)
            System.out.print("\t"+Character.isLetter(z));
        System.out.println();
        System.out.print("isLetterOrDigit()");
        for(char z : znaki)
            System.out.print("\t"+Character.isLetterOrDigit(z));
        System.out.println();
        System.out.print("isLowerCase() ");
        for(char z : znaki)
            System.out.print("\t"+Character.isLowerCase(z));
        System.out.println();
        System.out.print("isSpaceChar() ");
        for(char z : znaki)
            System.out.print("\t"+Character.isSpaceChar(z));
        System.out.println();
        System.out.print("isUpperCase() ");
        for(char z : znaki)
            System.out.print("\t"+Character.isUpperCase(z));
        System.out.println();
        System.out.print("isWhitespace() ");
        for(char z : znaki)
            System.out.print("\t"+Character.isWhitespace(z));
        System.out.println();
    }
}
