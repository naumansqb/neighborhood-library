package com.pluralsight;

import java.util.Scanner;

public class Main {
    private static Book [] bookArray= new Book[100];
    private static int numOfBooks=20;
    public static void main(String[] args) {
        //creation of the Book instances
        bookArray[0]  = new Book(1,  "The Great Gatsby",          "9780743273565");
        bookArray[1]  = new Book(2,  "To Kill a Mockingbird",     "9780061120084");
        bookArray[2]  = new Book(3,  "1984",                      "9780451524935");
        bookArray[3]  = new Book(4,  "Pride and Prejudice",       "9781503290563");
        bookArray[4]  = new Book(5,  "Moby-Dick",                 "9781503280786");
        bookArray[5]  = new Book(6,  "The Catcher in the Rye",    "9780316769488");
        bookArray[6]  = new Book(7,  "Brave New World",           "9780060850524");
        bookArray[7]  = new Book(8,  "The Hobbit",                "9780547928227");
        bookArray[8]  = new Book(9,  "Fahrenheit 451",            "9781451673319");
        bookArray[9]  = new Book(10, "Crime and Punishment",      "9780486415871");
        bookArray[10] = new Book(11, "Jane Eyre",                 "9780141441146");
        bookArray[11] = new Book(12, "Wuthering Heights",         "9780141439556");
        bookArray[12] = new Book(13, "The Odyssey",               "9780140268867");
        bookArray[13] = new Book(14, "Hamlet",                    "9780743477123");
        bookArray[14] = new Book(15, "The Iliad",                 "9780140275360");
        bookArray[15] = new Book(16, "Don Quixote",               "9780060934347");
        bookArray[16] = new Book(17, "War and Peace",             "9780199232765");
        bookArray[17] = new Book(18, "Anna Karenina",             "9780143035008");
        bookArray[18] = new Book(19, "The Brothers Karamazov",    "9780374528379");
        bookArray[19] = new Book(20, "Great Expectations",        "9780141439563");

        Scanner scan = new Scanner(System.in);

        boolean isRunning=true;
        int choice;
        while(isRunning){
            System.out.println("***Store Home Screen***");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit the program");
            choice= scan.nextInt();
            switch(choice){
                case 1:
                    showAvailableBooks(scan);
                    break;
                case 2:
                    break;
                case 3:
                    isRunning=false;
                default:
                    System.out.println("Invalid Input. Please try again!");
            }
        }

    }
    public static void showAvailableBooks(Scanner scan){
        for(int i=0;i<numOfBooks;i++){
            if(!bookArray[i].isCheckedOut()){
                System.out.println(bookArray[i]);
            }
        }
        System.out.println("Chose what you would like to do next: ");
        System.out.println("1. To checkout a book \t 2. Return back to home");
        int choice=scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("Please enter the id of the book to checkout: ");
                int bookIdToCheckOut=scan.nextInt();
                scan.nextLine();
                boolean found=false;
                String userName;
                for(int i=0;i<numOfBooks;i++){
                    if(bookArray[i].getId() == bookIdToCheckOut){
                        found=true;
                        System.out.println("Please enter your name: ");
                        userName= scan.nextLine();
                        bookArray[i].checkOut(userName);
                        System.out.println(userName +" you have checked out "+ bookArray[i].getTitle());
                    }
                }
                if(!found) {
                    System.out.println("No book with that ID. Sorry, try again");
                }
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid input");
        }

    }


}
