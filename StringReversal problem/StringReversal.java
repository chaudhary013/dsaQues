public class StringReversal {

    public static String reverseString(String input) {
        // Step 1: Convert the string to a char array
        char[] charArray = input.toCharArray();

        // Step 2: Initialize pointers for the beginning and end of the array
        int start = 0;
        int end = charArray.length - 1;

        // Step 3: Swap characters from start to end
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move pointers towards each other
            start++;
            end--;
        }

        // Step 4: Convert the char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Example usage
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
