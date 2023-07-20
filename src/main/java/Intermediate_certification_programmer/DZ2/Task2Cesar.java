package Intermediate_certification_programmer.DZ2;

public class Task2Cesar {
    public static String encryptDecrypt(String message, boolean isEncrypt, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                if (isEncrypt) {
                    ch = (char) ((ch + key - 'a') % 26 + 'a');
                } else {
                    ch = (char) ((ch - key - 'a') % 26 + 'a');
                    if (ch < 'a') {
                        ch = (char) (ch + 26);
                    }
                }
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String message = "excellent";
        boolean isEncrypt = true;
        int key = 3;

        String encryptedMessage = encryptDecrypt(message, isEncrypt, key);
        System.out.println("Encrypted message: " + encryptedMessage);

        String decryptedMessage = encryptDecrypt(encryptedMessage, false, key);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
    }