public class LawOfLogicE {
    /*
    (p => q)<=>(!p v q)
     */
    public static void main(String[] args) {
        boolean[] values = {false, true};
        System.out.println();
        System.out.println("Prawo eliminacji implikacji");
        System.out.println();
        System.out.println("--------------------------------" +
                "--------------------------------------");
        System.out.println("p\t\tq\t\t|\t(p=>q)\t\t!p\t\t(!p|q)\t\t(p=>q)<=>(!p|q)");
        for(boolean p : values)
            for(boolean q : values){
                System.out.print(p + "\t" + q + "\t|\t");
                System.out.println(impl(p,q));
                System.out.println();
            }
    }

    static boolean impl(boolean p, boolean q){
        return Boolean.valueOf(p).compareTo(q) < 1;
    }
}
