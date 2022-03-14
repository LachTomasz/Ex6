public class LogicalOperator {
    public static void main(String[] args) {
        var logical = new boolean[]{false, true};
        System.out.println();
        System.out.println("=======================================================");
        System.out.println("Negacje");
        System.out.println("=======================================================");
        System.out.println("p\t\t!p");
        for (boolean p : logical) {
            System.out.println(p + "\t=>\t"+!p);
        }
        System.out.println();
        System.out.println("=======================================================");
        System.out.println("p\t&\tq");
        System.out.println("=======================================================");
        for (boolean p: logical) {
            for (boolean q: logical) {
                System.out.println(p + "\t&\t" + q + "\t=>\t" + (p&q));
            }
        }
        System.out.println();
        System.out.println("=======================================================");
        System.out.println("p\t|\tq");
        System.out.println("=======================================================");
        for (boolean p: logical) {
            for (boolean q : logical) {
                System.out.println(p + "\t|\t" + q + "\t=>\t" + (p | q));
            }
        }
    }
}
