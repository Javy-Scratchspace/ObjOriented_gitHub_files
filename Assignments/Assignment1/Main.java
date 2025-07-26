
/**
 * This is a sample {@code Main} class that will be used to
 * test the {@code IntegerList} class. You are free to modify
 * this source code to extensively test your implementation.
 * No need to submit this file.
 *
 * @author Your Full Name Goes Here
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        // declare a reference variable
        IntegerList myList;
        
        // instantiate a list with capacity of 5
        myList = new IntegerList(5);
        
        // print the capacity
        System.out.println( myList.getCapacity() );
        
        // print the list
        myList.display();
        
        // print the size
        System.out.println( myList.getSize() );
        
        // insert 5 integers
        myList.addElement(10);
        myList.addElement(20);
        myList.addElement(30);
        myList.addElement(40);
        myList.addElement(50);
        
        int index_1 = myList.find(20);
        int index_2 = myList.find(60);

        System.out.println("Index 1 is: " + index_1);
        System.out.println("Index 2 is: " + index_2);

        System.out.println( myList.getAverage() );

        // print the list
        myList.display();
        
        // add another element
        myList.addElement(60);
        
        index_2 = myList.find(60);
        System.out.printf("Index 2 is: %d\n", index_2);

        // print the list
        myList.display();
        
        // print the size
        System.out.println( myList.getSize() );

        System.out.println( myList.getAverage() );

        System.out.println( myList.getElementAt(3) );

        // print the capacity
        System.out.println( myList.getCapacity() );

        myList.setElementAt(5, 65);

        myList.display();

        myList.addElement(75);
        myList.addElement(85);
        myList.addElement(95);

        myList.display();

        myList.addElement(23);

        myList.display();
        System.out.println( myList.getCapacity() );

        myList.addElement(100);

        myList.display();

        System.out.println( myList.getCapacity() );
        System.out.println( myList.getSize() );

        myList.clear();

        myList.display();

        if (myList.isEmpty()) {
            System.out.println("Your list is empty");
        }

        // duplicate the list
        IntegerList myList2 = myList.duplicate();

        int comp = myList2.compareTo(myList);

        System.out.println("Comparison result: " + comp);
    }

}
