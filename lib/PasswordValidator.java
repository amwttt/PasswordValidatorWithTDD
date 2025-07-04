package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param
     * @return
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        if(password == null || password.length() < 8)
            return PasswordStrength.INVALID;

        boolean Lowerletter = false;
        boolean Upperletter = false;
        boolean Digit = false;
        boolean Special = false;

        for(char c : password.toCharArray()){
            if (Character.isLowerCase(c)) {
                Lowerletter = true;
            } else if (Character.isUpperCase(c)) {
                Upperletter = true;
            } else if (Character.isDigit(c)) {
                Digit = true;
            } else
            Special = true;
        }

        
        int count = 0; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        if (Lowerletter) {count++;}
        if (Upperletter) {count++;}
        if (Digit) {count++;}
        if (Special) {count++;}

        if(count == 4) {
            return PasswordStrength.STRONG;
        }
        else if (count == 3) {
            return PasswordStrength.MEDIUM;
        } else {
            return PasswordStrength.WEAK;
        }
        
    }
}