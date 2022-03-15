public class LawsOfLogic {
    public static void main(String[] args) {
        boolean p = true;
        System.out.println("-------------------------");
        System.out.println("Prawo wyłączonego środka:");
        System.out.println("p or ~p => " + (p|!p));
        System.out.println("-------------------------");
        System.out.println("Prawo niesprzeczności:");
        System.out.println("~(p or ~p) => " + !(p|!p));
        System.out.println("-------------------------");
        System.out.println("Prawo podwójnego przeczenia:");
        System.out.println("~(~p) <=> p => " + (!(!p)==p));
    }
}
