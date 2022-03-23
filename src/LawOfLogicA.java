public class LawOfLogicA {
    public static void main(String[] args) {
        boolean[] values =  {false, true};
        boolean[] results = {false, false, false, false};
        boolean[] results1 = {false, false, false, false};
        int count = 0;
        System.out.println("Prawo przechodności implikacji");
        System.out.println("[(p => q)^(q => r)] => (p => r)");
        for( boolean p : values)
            for( boolean q : values){
                results[count] = impl(p,q);
                count += 1;
            }
        count = 0;
        for( boolean q : values)
            for( boolean r : values){
                results1[count] = impl(q,r);
                count += 1;
            }
        for(boolean r1 : results)
            for(boolean r2 : results1)
                System.out.println(r1 + "\t" + r2 + "\t" + impl(r1,r2));
    }

    static boolean impl(boolean p, boolean q){
        return (Boolean.valueOf(p).compareTo(q) < 1);
    }
}
