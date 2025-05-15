package src.bishesh;

public class DecodeMessage {
    public static String decodeMessage(String encryptedMessage, int X, int Y) {
        StringBuilder decodedMessage = new StringBuilder();
        int n = encryptedMessage.length();

        for (int i = 0; i < n; i++) {
            char currentChar = encryptedMessage.charAt(i);

            if ((i + 1) % 2 == 1) { // Odd index (1-based indexing)
                // Shift forward by X positions
                char shiftedChar = (char) ((currentChar - 'a' + X) % 26 + 'a');
                decodedMessage.append(shiftedChar);
            } else { // Even index (1-based indexing)
                // Shift backward by Y positions
                char shiftedChar = (char) ((currentChar - 'a' - Y + 26) % 26 + 'a');
                decodedMessage.append(shiftedChar);
            }
        }

        return decodedMessage.toString();
    }

    public static void main(String[] args) {
        // Example 1
//        String input1 = "abcdef";
//        int X1 = 2;
//        int Y1 = 1;
//        System.out.println(decodeMessage(input1, X1, Y1)); // Output: "caecge"

        // Example 2
        String input2 = "xyz";
        int X2 = 3;
        int Y2 = 2;
        System.out.println(decodeMessage(input2, X2, Y2)); // Output: "zac"
    }
}
