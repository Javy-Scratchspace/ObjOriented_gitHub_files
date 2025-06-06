package String_Processing; 

public class StringProcessor {

    // Arguements
    private String str; 

    // Default string contructor
    public StringProcessor() {
        this.str = new String("");
    }

    // Constructor to set the string
    public StringProcessor(String str) {
        setString(str);
    }

    // Method to set the string
    public void setString(String str) {
        this.str = str; 
    }

    // Method to get the current string
    public String getString() {
        return this.str; 
    }

    // Method to print the string
    public void printString() {
        System.out.println(this.str);
    }

    // Method to print string in a column format
    public void printStringInColumn() {
        for (int i = 0; i < this.str.length(); i++) {
            System.out.println(this.str.charAt(i));
        }
    }

    // Method to print the string in reverse
    public void printStringInReverseColumn() {
        for (int i = this.str.length() - 1; i >= 0; i--) {
            System.out.println(this.str.charAt(i));
        }
    }

    // Method to get vowel count
    public int getVowelCount() {
        int count = 0; 
        String vowels = "aeiouAEIOU"; // Include both lowercase and uppercase vowels
        for (int i = 0; i < this.str.length(); i++) {
            if (vowels.indexOf(this.str.charAt(i)) != -1){ // Check if character is a vowel
                count++; // If vowel, increment count
            } 
        }
        return count; 
    }

    // Method to get lowercase string
    public String getLowerCaseString() {
        return this.str.toLowerCase();
    }

    // Method to get uppercase string
    public String getUpperCaseString() {
        return this.str.toUpperCase();
    }

    // Method to get the length of the string
    public int getLength() {
        return this.str.length();
    }

    // Method to change the string to a lowercase version of it
    public void changeToLowerCase() {
        this.str = this.str.toLowerCase();
    }

    // Method to change the string to its uppercase version
    public void changeToUpperCase() {
        this.str = this.str.toUpperCase();
    }

    // Append string to current string
    public void appendString(String newStr) {
        this.str += newStr; 
    }

    // Method to append a char to the current string
    public void appendChar(char c) {
        this.str += c; 
    }

    // Method to remove any vowels from the string
    public void removeVowels() {
        String vowels = "aeiouAEIOU"; // Include both lowercase and uppercase vowels
        String result = new String();
        for (int i = 0; i < this.str.length(); i++) {
            if (vowels.indexOf(this.str.charAt(i)) == -1) { // Check if character is not a vowel
                result += this.str.charAt(i);
            }
        }
        this.str = result; // Update the string without vowels
    }

    // Does the same thing as the before method but returns the string without modifying the original string
    public String getStringWithoutVowels() {
        String vowels = "aeiouAEIOU"; // Include both lowercase and uppercase vowels
        String result = new String();
        for (int i = 0; i < this.str.length(); i++) {
            if (vowels.indexOf(this.str.charAt(i)) == -1) { // Check if character is not a vowel
                result += this.str.charAt(i);
            }
        }
        return result; // Update the string without vowels
    }

    // Method to remove white space from the string
    public String removeWhiteSpace() {
        return this.str.replaceAll("\\s", "");
    }

    // Method to remove any non-characters from the string
    public void removeNonCharacters() {
        this.str = this.str.replaceAll("[^a-zA-Z]", "");
    }

    // Method to duplicate the string
    public StringProcessor duplicate() {
        return new StringProcessor(this.str);
    }
}
