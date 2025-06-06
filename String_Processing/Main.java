package String_Processing;

public class Main {

    public static void main(String[] args){
        // Create a new StringProcessor Object
        StringProcessor sp = new StringProcessor("Hello World!");
        StringProcessor sp2 = sp.duplicate();

        // Print the original String
        sp.printString();

        // Print the string in column format
        System.out.println("String in Column Format:");
        sp.printStringInColumn();

        // Print the string in reverse column format
        System.out.println("String in Reverse Column Format:");
        sp.printStringInReverseColumn();

        // Get and print the vowel count
        int vowelCount = sp.getVowelCount();
        System.out.println("Vowel Count: " + vowelCount);

        // Get and print lowercase string
        String lowerCaseString = sp.getLowerCaseString();
        System.out.println("Lowercase String: " + lowerCaseString);

        // Get and print uppercase String
        String upperCaseString = sp.getUpperCaseString();
        System.out.println("Uppercase String: " + upperCaseString);

        // Change the string to its lowercase versino
        sp.changeToLowerCase();
        System.out.println("String after changing to lowercase: ");
        sp.printString();

        // Change the string to its uppercase version
        sp.changeToUpperCase();
        System.out.println("String after changing to uppercase: ");
        sp.printString();

        // Print the length of the string
        int length = sp.getLength();
        System.out.println("Length of the string: " + length);

        // Get the original string
        sp.setString(sp2.getString());
        System.out.println("Original duplicated String: " + sp.getString());

        // Change the string to a new value
        sp.setString("Hello, Java");
        System.out.println("String after changing to a new value: " + sp.getString());
    
        // Print the string in reverse column format
        System.out.println("String in Reverse Column Format:");
        sp.printStringInReverseColumn();

        // Append to the string
        sp.appendString(", and welcome to String Processing!");
        System.out.println("String after appending: " + sp.getString());

        System.out.println("DONE!");
    }
}
