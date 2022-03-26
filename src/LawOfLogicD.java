public class LawOfLogicD {
    /*
        [(p => q) ^ q] => q
     */
    public static void main(String[] args) {
        boolean[] values = {false, true};
        System.out.println("Prawo odrywania");
        System.out.println(" [(p => q) ^ q] => q");
        System.out.println();
        System.out.println("-----------------------------" +
                "---------------------------------------");
        System.out.println("p\t\tq\t\t|\t(p => q)\t[(p => q) ^ q]\t[(p => q) ^ q] => q");
        System.out.println("-----------------------------" +
                "---------------------------------------");
        for(boolean p : values)
            for(boolean q : values){
                System.out.print(p + "\t" + q + "\t|\t");
                System.out.print(impl(p,q) + "\t\t");
                System.out.print((impl(p,q)&q) + "\t\t\t");
                System.out.println(impl((impl(p,q)&q),q));
            }
        System.out.println();
    }

    static boolean impl(boolean p, boolean q){
        return Boolean.valueOf(p).compareTo(q) < 1;
    }
}
