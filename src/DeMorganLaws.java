public class DeMorganLaws {
    public static void main(String[] args) {
        boolean[] bool = {false, true};
        String s = "\t";
        System.out.println("----------------------------------------------------------");
        System.out.println("Pierwsze prawo De Morgana - prawo zaprzeczenia koniunkcji.");
        System.out.println("p\t\tq\t\tp&q\t\t!(p&q)\t!p\t\t!q\t\t!p|!q\t!(p&q)<=>(!p|!q)");
        System.out.println("----------------------------------------------------------");
        for (boolean p : bool)
            for (boolean q : bool)
                System.out.println(p+s+q+s+(p&q)+s+!(p&q)+s+!p+s+!q+s+(!p|!q)+s+(!(p&q)==(!p|!q)));
        System.out.println("==========================================================");
        System.out.println("Drugie prawo De Morgana - prawo zaprzeczenia alternatywy.");
        System.out.println("p\t\tq\t\tp|q\t\t!(p|q)\t!p\t\t!q\t\t!p&!q\t!(p|q)<=>(!p&!q)");
        System.out.println("----------------------------------------------------------");
        for(boolean p : bool)
            for(boolean q : bool)
                System.out.println(p+s+q+s+(p|q)+s+!(p|q)+s+!p+s+!q+s+(!p&!q)+s+(!(p|q)==(!p&!q)));
        System.out.println("----------------------------------------------------------");
        System.out.println();
    }
}
