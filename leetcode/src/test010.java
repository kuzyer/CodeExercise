//正则表达式匹配
public class test010 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        //字符串s不为空（s和p的第一个字符相等或p的第一个字符为.）
        boolean first_match = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        //如果第二个字符为星号
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) ||
                    (first_match && isMatch(s.substring(1), p)));
        } else {
            return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
}
