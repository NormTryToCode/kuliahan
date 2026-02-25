
public class iterativePartialSum {
	public static void main(String[] args) {
        int[] myIntegerList = {1,2,3,4,5,67,7,8};
        int integerResult = integerPartialSum(myIntegerList, 3);
        double[] myDoubleList = {1.3, 1.32, 1.325, 13.34};
        double doubleResult = doublePartialSum(myDoubleList, 3);
        System.out.println("my integer result " + integerResult);
        System.out.println("My double result " + doubleResult);
    }
    public static int integerPartialSum(int[] integerList, int endIndex){
        int total = 0;
        if (endIndex > integerList.length - 1 || endIndex < 0) {
            return 0;
        }
        for (int i=endIndex; i >= 0; i--){
            total += integerList[i];
        }
        return total;
    }
    public static double doublePartialSum(double[] doubleList, int endIndex){
        double total = 0;
        if (endIndex > doubleList.length - 1 || endIndex < 0) {
            return 0;
        }
        for (int i=endIndex; i >= 0; i--){
            total += doubleList[i];
        }
        return total;
    }
}	
