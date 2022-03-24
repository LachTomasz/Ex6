public class LawOfLogicA {
    public static void main(String[] args) {
        boolean[] values =  {false, true};

        System.out.println("Prawo przechodności implikacji");
        System.out.println("p\t\tq\t\tr\t\t|\t(p => q)\t(q => r)\t|" +
                "\t(p => q)^(q => r)\t|\t(p => r)\t|\t[(p => q)^(q => r)]=>(p => r)");
        System.out.println("------------------------------------------" +
                "-----------------------------------------------------" +
                "-------------------------------");
        for (boolean p : values)
            for(boolean q : values)
                for (boolean r : values){
                    System.out.print(p+"\t"+q+"\t"+r+"\t|\t");
                    System.out.print(impl(p,q)+"\t\t"+impl(q,r)+"\t\t|\t\t");
                    System.out.print((impl(p,q)&impl(q,r))+"\t\t\t|\t");
                    System.out.print(impl(p,r)+"\t\t|\t\t\t\t");
                    System.out.println(impl((impl(p,q)&impl(q,r)),impl(p,r)));
                }
    }

    static boolean impl(boolean p, boolean q){
        return (Boolean.valueOf(p).compareTo(q) < 1);
    }
}
