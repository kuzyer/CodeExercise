//最后一个单词的长度
public class test058 {
    public int lengthOfLastWord(String s) {
        int len = s.length(), lastLength = 0;
        while (len > 0 && s.charAt(len - 1) == ' ') {
            len--;
        }
        while (len > 0 && s.charAt(len - 1) != ' ') {
            lastLength++;
            len--;
        }
        return lastLength;
    }
}
