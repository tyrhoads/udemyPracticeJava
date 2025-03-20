public class ReverseString
{
    public static void main(String[] args)
    {
        reverseStringApp();
    }
    public static void reverseStringApp() {
        // Example usage of the recursive method
        String input = "Recursion is powerful!";
        System.out.println("Original String: " + input);

        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }

    // Recursive method to reverse a string
    public static String reverseString(String str) {
        // Base case: if the string is empty or has one character, return it
        if(str.isEmpty() || str.length() == 1){
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);

        // Recursive case: reverse the rest of the string and add the first character to the end
        //TODO
    }
}
