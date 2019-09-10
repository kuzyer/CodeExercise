import java.util.HashMap;
import java.util.Map;

//罗马数字转整数
public class test013 {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char sc[] = s.toCharArray();
        int total = map.get(sc[0]);
        int pre = map.get(sc[0]);

        for (int i = 1; i < sc.length; i++) {
            int cur = map.get(sc[i]);
            if (cur <= pre) {
                total += cur;
            } else {
                total += cur - 2 * pre;
            }
            pre = cur;
        }

        return total;
    }


    public static void main(String[] args) {
        String a = "XLIV";
        System.out.println(romanToInt(a));
    }
}
