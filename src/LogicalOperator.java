public class LogicalOperator {
    public static void main(String[] args) {
        var logical = new boolean[]{false, true};
        System.out.println();
        for(int i = 0; i < logical.length; i++)
            for(int j = 0; j < logical.length; j++)
                if (logical[i] & logical[j])
                    System.out.println(logical[i] + " AND " + logical[j] + " => true");
                else if(logical[i] | logical[j])
                    System.out.println(logical[i] + " AND " + logical[j] + " => false");
                else if(!logical[i])
                    System.out.println("NOT " + logical[i] + " => true");
    }
}
