
/*
 * COP 3330 Summer 2025
 * Student Name: Javier Cuevas Chabrier
 * 
 * This file contains the three classes you need to complete.
 * Only add your code below the TODO comments.
 * Do not modify any other parts of this file.
 */

class Utility {
    
    // TODO: Complete the Utility class

    // Returns a 2D array of Strings that represents a StudentList object
    // Formatted in the following way: 
    // [0] = Student Name
    // [1] = Student Status (e.g., "Full-time", "Part-time")
    // [2] = Total Credit Hours
    // [3] = Tuition Due
    public static String[][] studentListToArray(StudentList list) {
        String[][] result = new String[list.size][4];
        for (int i = 0; i < list.size; i++) {
            Student tmp = (Student) list.get(i);
            result[i][0] = tmp.getName();
            result[i][1] = tmp.getStatus();
            result[i][2] = String.valueOf(tmp.getTotalCredit());
            result[i][3] = String.valueOf(tmp.getTuitionDue());
        }
        return result; 
    }   

    // Returns a 2D array of Strings that represents a CourseList object
    // Formatted in the following way:
    // [0] = Course Code
    // [1] = Course Title
    // [2] = Credit Hours
    public static String[][] courseListToArray(CourseList list) {
        String[][] result = new String[list.size][3];
        for (int i = 0; i < list.size; i++) {
            Course tmp = (Course) list.get(i);
            result[i][0] = tmp.getCode();
            result[i][1] = tmp.getTitle();
            result[i][2] = String.valueOf(tmp.getCredit());
        }
        return result;
    }
}


class StudentList extends BaseList  {
    
    // TODO: Complete the StudentList class

    // Basic contructor, creates an internal list with default size of ten
    StudentList() {
        super();
    }

    // Constructor that creates internal list of specified size
    StudentList(int size) {
        super(size);
    }

    // Returns true if internal list contains desired Student object
    // Otherwise, false
    public boolean contains(Object obj) {
        for (int i = 0; i < this.size; i++) {
            Student tmp = (Student) this.get(i);
            if (obj instanceof Student && tmp.isEqual(obj)) {
                return true; 
            }
        }
        return false; 
    }

    // Returns a new StudentList containing all students that match the search key (name)
    // If there is no student with that name, returns an empty StuentList object
    public StudentList query(String key) {
        StudentList result = new StudentList();
        for (int i = 0; i < this.size; i++) {
            Student tmp = (Student) this.get(i);
            if (tmp.isMatch(key)) {
                result.add(tmp);
            }
        }
        return result; 
    }

    // Finds the first students that matches the search key (name)
    // Returns null/None/void if no match is found
    public Student findMatch(String key) {
        for (int i = 0; i < this.size; i++) {
            Student tmp = (Student) this.get(i);
            if (tmp.isMatch(key)) {
                return tmp; 
            }
        }
        return null; 
    }

}


class CourseList extends BaseList {
    
    // TODO: Complete the CourseList class
    
    // Basic constructor, creates an internal list with default size of ten
    CourseList() {
        super();
    }

    // Constructor that creates internal list of specified size
    CourseList(int size) {
        super(size);
    }

    // Returns true if internal list containes desired Course object
    // Otherwise, false
    public boolean contains(Object obj) {
        for (int i = 0; i < this.size; i++) {
            Course tmp = (Course) this.get(i);
            if (obj instanceof Course && tmp.isEqual(obj)) {
                return true; 
            }
        }
        return false;
    }

    // Returns a new CourseList containing all Courses that match the Search key (code)
    // If there is no course with specified code, returns an object with empty internal array
    public CourseList query(String key) {
        CourseList result = new CourseList();
        for (int i = 0; i < this.size; i++) {
            Course tmp = (Course) this.get(i);
            if (tmp.isMatch(key)) {
                result.add(tmp);
            }
        }
        return result; 
    }

    // Finds the first Course that matches the search key (code)
    // Returns null/None/void if no match is found
    public Course findMatch(String key) {
        for (int i = 0; i < this.size; i++) {
            Course tmp = (Course) this.get(i);
            if (tmp.isMatch(key)) {
                return tmp; 
            }
        }
        return null; 
    }
}
