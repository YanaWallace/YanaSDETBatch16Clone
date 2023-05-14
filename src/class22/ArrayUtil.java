package class22;

public interface ArrayUtil {
    //search the array for the number if found return true
    public boolean searchArr(int [] array,int number);
}
// Break till 2PM
class Main implements ArrayUtil{

    @Override
    public boolean searchArr(int[] arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;

    }
}
