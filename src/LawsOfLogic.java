public class LawsOfLogic {
    public static void main(String[] args) {
        boolean[] bool = {true, false};
        System.out.println("---------------------------------");
        System.out.println("Prawo wyłączonego środka, (p|!p).");
        System.out.println("p\t\t!p\t\tp|!p");
        System.out.println("---------------------------------");
        for (boolean p: bool)
            System.out.println(p + "\t" + !p + "\t" + (p|!p));
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Prawo niesprzeczności, !(p&!p).");
        System.out.println("p\t\t!p\t\tp&!p\t!(p&!p)");
        System.out.println("---------------------------------");
        for (boolean p: bool)
            System.out.println(p+"\t"+!p+"\t"+ (p&!p)+"\t"+!(p&!p));
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Prawo podwójnego przeczenia, !(!p)<=>p.");
        System.out.println("p\t\t!p\t\t!(!p)\t!(!p)<=>p");
        System.out.println("---------------------------------");
        for (boolean p: bool)
            System.out.println(p+"\t"+!p+"\t"+ !(!p)+"\t"+(!(!p)==p));
    }
}
