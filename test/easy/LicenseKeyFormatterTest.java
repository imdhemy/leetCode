package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LicenseKeyFormatterTest {

    @Test
    void licenseKeyFormatting() {
        LicenseKeyFormatter obj = new LicenseKeyFormatter();
        Assertions.assertEquals("5F3", obj.licenseKeyFormatting("5F-3-", 4));
        Assertions.assertEquals("5F3Z-2E9W", obj.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        Assertions.assertEquals("2-5G-3J", obj.licenseKeyFormatting("2-5g-3-J", 2));
    }
}
