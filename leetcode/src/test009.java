//回文数
public class test009 {
    public boolean isPalindrome(int x) {
        //负数或末尾是0时（0本身除外）
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int revertNumber = 0;
        while (x > revertNumber) {
            revertNumber = revertNumber * 10 + x % 10;
            x /= 10;
        }

        //偶数或奇数的情况
        return x == revertNumber || x == revertNumber / 10;
    }
}
