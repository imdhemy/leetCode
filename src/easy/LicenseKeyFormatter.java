package easy;

import java.util.Locale;

public class LicenseKeyFormatter {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toUpperCase(Locale.ROOT).toCharArray();
        int dashes = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            char c = chars[i];
            if (c != '-') {
                if (sb.length() != 0 && (sb.length() - dashes) % k == 0) {
                    sb.insert(0, "-");
                    dashes++;
                }
                sb.insert(0, c);
            }
        }

        return sb.toString();
    }
}
