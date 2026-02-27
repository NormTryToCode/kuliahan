public class combinatoricsRecursive {
    public static void main(String[] args) {
        int combinatoricsResult = combinatorics(10, 3);
        System.out.println(combinatoricsResult);
    }
    public static int combinatorics(int n, int k){
        if (n >= k){
            if (n == k || k == 0){
                    return 1;
                }
            return combinatorics(n - 1, k) + combinatorics(n-1, k-1);
        }
        return -1;
    }
}


    
