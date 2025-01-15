import java.security.SecureRandom;

public class OTPGenerator {

    // Method to generate an OTP
    public static String generateOTP(int length) {
        // Ensure OTP length is greater than 0
        if (length <= 0) {
            throw new IllegalArgumentException("OTP length must be greater than 0");
        }

        // Characters allowed in the OTP
        String digits = "0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder();

        // Generate OTP by randomly selecting characters
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(digits.length());
            otp.append(digits.charAt(index));
        }

        return otp.toString();
    }

    public static void main(String[] args) {
        // Specify the length of the OTP
        int otpLength = 6;

        // Generate and print the OTP
        String otp = generateOTP(otpLength);
        System.out.println("Generated OTP: " + otp);
    }
}
