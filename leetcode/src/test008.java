//字符串转换整数 (atoi)
public class test008 {
    public int myAtoi(String str) {
        str = str.trim();

        if (str.isEmpty())
            return 0;
        // 索引位数
        int i = 0;
        // 正负号标记
        int sign = 1;
        // 转换值
        int base = 0;

        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 ||
                    (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            base = 10 * base + (str.charAt(i++) - '0');
        }

        return base * sign;

    }
}
