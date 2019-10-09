//加一
public class test066 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        //int数组的默认值为0
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
