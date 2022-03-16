public class Implikation {
    public static void main(String[] args) {
        boolean[] value = {false, true};
        System.out.println();
        System.out.println("Implikacja p => q");
        System.out.println();
        System.out.println("p\t\tq\t\tp=>q");
        System.out.println("--------------------");
        for (boolean p : value)
            for(boolean q : value)
                System.out.println(p+"\t"+q+"\t"+(Boolean.valueOf(p).compareTo(q) < 1));
    }
}
