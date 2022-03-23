public class XOR {
    public static void main(String[] args) {
        boolean[] value = {false, true};
        System.out.println();
        System.out.println("Alternatywa wykluczająca:");
        System.out.println("-------------------------");
        for(boolean p : value)
            for(boolean q: value)
                System.out.println(p + " XOR " + q + " => " + ((p|q)&(!(p&q))));
        System.out.println();
        for(boolean p : value)
            for(boolean q : value)
                System.out.println(p + "\t" + q + "\t=>\t" + (p^q) );
    }
}
