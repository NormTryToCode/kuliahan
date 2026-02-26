package test_kuliah;
public class recursiveSum {
    public static void main(String[] args) {
        int[] myIntegerList = {1,2,3,4,5,67,7,8};
        double[] myDoubleList = {1.3, 1.32, 1.325, 13.34};
        int integerResult = recursiveSumm(myIntegerList, 3);
        double myDoubleResult = recursiveSumm(myDoubleList, 3);

        System.out.println("my integer result " + integerResult);
        System.out.println("My double result " + myDoubleResult);
    }
    public static int recursiveSumm(int[] myList, int endIndex) {
        if (endIndex < 0 || endIndex >= myList.length) {
            System.out.println("Invalid index!");
            return 0;
        }
        else if (endIndex >= myList.length) {
            System.out.println("Invalid index!");
            return  0;
        }
        else {
            return myList[endIndex] + recursiveSumm(myList, endIndex - 1);
        }
    }
    public static double recursiveSumm(double[] myList, int endIndex) {
        if (endIndex < 0 || endIndex >= myList.length) {
            return 0;
        }
        else {
            return myList[endIndex] + recursiveSumm(myList, endIndex - 1);
        }
    }
}