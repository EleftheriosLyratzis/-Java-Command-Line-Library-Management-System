# -Java-Command-Line-Library-Management-System
A command line application for a library management system. The system handles books in both printed and electronic format. Each book should have a title, author, ISBN, and price. Printed books should have a number of pages, and electronic books should have a file size in MB.

The project has the following functionalities:

1. Add a Book:
The user is prompted to enter the title, author, ISBN, and price of the book.
If the book is in printed format, the user should enter the number of pages.
If the book is in electronic format, the user should enter the file size in MB. A book can be offered in both printed and electronic format, in which case the user should enter
both the number of pages and file size. The system does not permit duplicate books with the same ISBN.

2. Delete a Book:
The user has to enter the ISBN of the book to delete it.
If the book exists, the system should display the book's details and ask for confirmation before
deletion.

3. List All Books:
The system can display a list of all the books in the library.

4. Search for a Book:
The user can be prompted to enter the title of the book to search. The system can display a list of all books with the matching title.

The application has a main menu where the user can choose one of these options, and it
can handle invalid inputs and possible exceptions.
