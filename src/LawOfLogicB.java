public class LawOfLogicB {
    public static void main(String[] args) {
        boolean[] values = {false,true};

        System.out.println("Prawo rozdzielności alternatywy względem koniunkcji");
        System.out.println("\t\t[p v (q ^ r)] <=> [(p v q)^(p v r)]");
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("p\t\tq\t\tr\t\t|\t(q ^ r)\t\tp v (q ^ r)\t");
        System.out.println("---------------------------------------------------");
        for(boolean p : values)
            for (boolean q : values)
                for (boolean r : values){
                    System.out.print(p+"\t"+q+"\t"+r+"\t|\t");
                    System.out.print((q&r)+"\t\t"+(p|(q&r))+"\t\t");
                    System.out.println();
                }
    }
    static boolean impl(boolean p, boolean q){
        return (Boolean.valueOf(p).compareTo(q) < 1);
    }
}
