/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] issuedBooks;

   private void testInitializeRandomBooks() {
       final int MAXIMUM_BOOKS_ALLOWED_TO_ISSUE = 5;
       issuedBooks = new Book[MAXIMUM_BOOKS_ALLOWED_TO_ISSUE];
       for (int i = 0; i < issuedBooks.length; i++) {
           int randomNumber = (int) (Math.random() * 10);
           issuedBooks[i] = new Book(
                   "Book" + randomNumber,
                   "Author" + randomNumber,
                   "1234567890" + randomNumber
           );
       }
   }
   public Student(String firstName, String middleName, String lastName, long universityRollNumber){
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.universityRollNumber = universityRollNumber;
       generateFullName(firstName, middleName, lastName);
   }

    private void generateFullName(String firstName, String middleName, String lastName) {
       if (middleName.isBlank() || middleName.isEmpty()){
           fullName = firstName + " " + lastName;
       }
       else {
           fullName = firstName + " " + middleName + lastName;
       }
    }
    public long getUniversityRollNumber() {
       return universityRollNumber;
    }
    public void setUniversityRollNumber(long universityRollNumber) {
       this.universityRollNumber = universityRollNumber;
    }
    public void getNumberOfBooksIssued() {
       return numberOfBooksIssued;
    }
}
