import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//只出现一次的数字
public class test136 {
    //暴力查找
//    public static int singleNumber(int[] nums) {
//        List<Integer> numList = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!numList.contains(nums[i])) {
//                numList.add(nums[i]);
//            } else {
//                numList.remove((Integer) nums[i]);
//            }
//        }
//        return numList.get(0);
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {2,2,3,4,4};
//        System.out.println(singleNumber(nums));
//    }


//    //Hash 表
//    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (Integer i : nums) {
//            Integer count = map.get(i);
//            count = count == null ? 1 : ++count;
//            map.put(i, count);
//        }
//        for (Integer i : map.keySet()) {
//            Integer count = map.get(i);
//            if (count == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }

    //位操作(异或操作)
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            //数全部异或，来找到那个唯一值
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }
}
