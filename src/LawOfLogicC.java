public class LawOfLogicC {

    /*
    Law Of Logic [p^(q v r)] <=> [(p ^ q) v (p ^ r)]
     */
    public static void main(String[] args) {
        boolean[] values = {false ,true};
        System.out.println();
        System.out.println("Prawo rozdzielności koniunkcji względem alternatywy");
        System.out.println("\t[p^(q v r)] <=> [(p ^ q) v (p ^ r)]\t");
        System.out.println();
        System.out.println("-----------------------------" +
                "----------------------------------------" +
                "----------------------------------------");

        System.out.println("p\t\tq\t\tr\t\t|\t(q|r)\t[p&(q|r)]\t(p&q)\t(p&r)\t[(p&q)|(p&r)]\t|\t[p&(q|r)]<=>[(p&q)|(p&r)]");
        System.out.println("-----------------------------" +
                "----------------------------------------" +
                "----------------------------------------");
        for(boolean p : values)
            for(boolean q : values)
                for (boolean r : values){
                    System.out.print(p + "\t" + q + "\t" + r + "\t|\t");
                    System.out.print((q|r) + "\t");
                    System.out.print((p&(q|r)) + "\t\t");
                    System.out.print((p&q) + "\t");
                    System.out.print((p&r) + "\t\t");
                    System.out.print(((p&q)|(p&r)) + "\t\t|\t\t\t");
                    System.out.println(((p&(q|r))==((p&q)|(p&r))));
                }
    }
}
