public class combinatoricsIterative {
    public static void main(String[] args) {
        int combinatoricResult = combinatorics(4, 2);
        System.out.println(combinatoricResult);
    }
    public static int combinatorics(int total, int selected) {
        int[] row = new int[selected+1];
        row[0] = 1; // base case, C(total, 0) = 1
        for (int i = 1; i <= total; i++){
            for (int j = Math.min(i, selected); j > 0; j--) {
                row[j] = row[j] + row[j-1];
            }
        }
        return row[selected];
    }
	

}

