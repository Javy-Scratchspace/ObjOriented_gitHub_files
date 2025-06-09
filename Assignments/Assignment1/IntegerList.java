
/**
 * The {@code IntegerList} class implements a growable array of integers.
 * Like an array, it contains elements that can be accessed 
 * using an integer index. However, the size of a IntegerList 
 * can grow as needed to accommodate adding items
 * after the {@code IntegerList} has been created.
 *
 * @author Javier Cuevas Chabrier
 * @version 1.0
 */

public class IntegerList {

    int arrayCapacity; 
    int elementCount;
    int[] internalArray; 

    // your code goes here

    // Default constructor
    public IntegerList() {
        this.elementCount = 0; 
        createArray(0); // Creates an internal empty array
    }

    // Create the class with an initial capacity
    public IntegerList(int arrayCapacity) {
        this.elementCount = 0; 
        createArray(arrayCapacity); // Creates internal array of size arrayCapacity
    }

    public void createArray(int capacity) {
        this.arrayCapacity = capacity; 
        this.internalArray = new int[this.arrayCapacity];
    }

    // Append to the array
    public void addElement(int element) {
        if ((this.elementCount + 1) > this.arrayCapacity) {
            IntegerList newArray = duplicate();
            this.arrayCapacity = this.arrayCapacity * 2; 
            this.internalArray = new int[this.arrayCapacity];
            for (int i = 0; i < this.elementCount; i++) {
                this.internalArray[i] = newArray.internalArray[i];
            }
        }

        this.internalArray[elementCount++] = element; // Updates element count and appends element
    }

    // This deletes/clears the array and makes a new one. 
    public void clear() {
        // "Reset" the array with a size of 0
        createArray(0);
        this.elementCount = 0; 
    }

    // This dispalys the concents of the array 
    public void display() {
        for (int i = 0; i < this.elementCount; i++) {
            System.out.print(this.internalArray[i] + " ");
        }
        System.out.println("");
    }

    // Returns a copy of the class
    public IntegerList duplicate() {
        IntegerList newList = new IntegerList(this.arrayCapacity);
        newList.elementCount = this.elementCount; 
        for (int i = 0; i < this.elementCount; i++) {
            newList.internalArray[i] = this.internalArray[i];
        }
        
        return newList;
    }

    // Finds an index given a desired search value
    public int find(int element) {
        for (int i = 0; i < this.elementCount; i++) {
            if (this.internalArray[i] == element) {
                return i; 
            }
        }

        return -1; 
    }

    // Calculates the average and returns a double value
    public double getAverage() {
        double sum = 0; 
        for (int i = 0; i < this.elementCount; i++) {
            sum += this.internalArray[i];
        }

        return sum/this.elementCount; 
    }

    // Returns the capacity of the array (arrayCapacity) 
    public int getCapacity() {
        return this.arrayCapacity; 
    }

    // Returns the number at a specific index
    public int getElementAt(int idx) {
        return this.internalArray[idx];    
    }

    // Returns the current size of the array (elementCount)
    public int getSize() {
        return this.elementCount; 
    }

    // Checks to see if the array is empty or not
    public boolean isEmpty() {
        return this.elementCount == 0; 
    }

    // Checks to see if two lists of the same class type are equal
    public boolean isEqual(IntegerList otherList) {
        // Checks to see if arrayCapacity and elementCount are the same 
        if (this.arrayCapacity != otherList.arrayCapacity || this.elementCount != otherList.elementCount) {
            return false; 
        }
        
        // Checks for each element
        for(int i = 0; i < this.arrayCapacity; i++) {
            if (this.internalArray[i] != otherList.internalArray[i]) {
                return false; 
            }
        }

        return true; 
    }

    // takes the array in this class and reverses is elements
    public void reverse() {
        IntegerList newList = duplicate();
        for (int i = 0; i < this.arrayCapacity; i++) {
            this.internalArray[this.arrayCapacity-i-1] = newList.internalArray[i];
        }
    }

    // Sets a new element within a specified index
    public void setElementAt(int index, int newValue) {
        this.internalArray[index] = newValue; 
    }
}
