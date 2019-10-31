//两数之和II-输入有序数组
public class test167 {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] > target) {
                high--;
            }
            if (numbers[low] + numbers[high] < target) {
                low++;
            }
            if (numbers[low] + numbers[high] == target) {
                res[0] = low + 1;
                res[1] = high + 1;
                return res;
            }
        }
        return res;
    }
}
