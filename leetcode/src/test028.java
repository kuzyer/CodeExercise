//实现 strStr()
public class test028 {

    //KMP
    public int strStr(String s, String t) {
        if (t == null || t.length() == 0) return 0;
        int[] next = new int[t.length()];
        getNext(t, next);
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (j == -1 || s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == t.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    public void getNext(String t, int[] next) {
        next[0] = -1;
        int i = 0, j = -1;
        while (i < t.length() - 1) {
            if (j == -1 || t.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
    }


//    public int strStr(String haystack, String needle) {
//        for (int i = 0; ; i++) {
//            for (int j = 0; ; j++) {
//                if (j == needle.length()) return i;
//                if (i + j == haystack.length()) return -1;
//                if (needle.charAt(j) != haystack.charAt(i + j))
//                    break;
//            }
//        }
//    }

}
