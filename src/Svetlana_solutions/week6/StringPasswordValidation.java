package week6;

public class StringPasswordValidation {

    public static boolean isValidPassword(String password) {
        // Check if password is at least 6 characters and does not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check if password contains at least one upper-case letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check if password contains at least one lower-case letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check if password contains at least one special character
        if (!password.matches(".*[!@#$%^&*()-_=+\\\\|\\[{\\]};:'\",<.>/?].*")) {
            return false;
        }

        // Check if password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test the method
        String password = "Password@123";
        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}

//Password is valid

/*
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */