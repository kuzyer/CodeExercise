import java.util.HashMap;

//无重复字符的最长子串
public class test003 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
                //之所以加一是因为左侧应从原有的字母后面开始算起
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
