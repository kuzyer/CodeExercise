//删除排序数组中的重复项
public class test026 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int s = removeDuplicates(a);
        System.out.println(s);
    }
}
