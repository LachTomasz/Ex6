public class LawOfLogicE {
    /*
    (p => q)<=>(!p v q)
     */
    public static void main(String[] args) {
        boolean[] values = {false, true};
        System.out.println();
        System.out.println("Prawo eliminacji implikacji");
        System.out.println();
        System.out.println("------------------------" +
                "-----------------------------------");
        System.out.println("p\t\tq\t\t|\t(p=>q)\t!p\t\t(!p|q)\t(p=>q)<=>(!p|q)");
        System.out.println("------------------------" +
                "-----------------------------------");
        for(boolean p : values)
            for(boolean q : values){
                System.out.print(p + "\t" + q + "\t|\t");
                System.out.print(impl(p,q) + "\t");
                System.out.print(!p + "\t");
                System.out.print((!p|q) + "\t\t");
                System.out.println(impl(p,q)==(!p|q));
            }
    }

    static boolean impl(boolean p, boolean q){
        return Boolean.valueOf(p).compareTo(q) < 1;
    }
}
