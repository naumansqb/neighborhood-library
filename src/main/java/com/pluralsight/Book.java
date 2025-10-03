package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String title, String isbn) {
        this.id = id;
        this.checkedOutTo = "";
        this.isCheckedOut = false;
        this.title = title;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return "'"+title+"'";
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void checkOut(String checkedOutTo){
        this.checkedOutTo=checkedOutTo;
        isCheckedOut=true;
    }
    public void checkIn(){
        isCheckedOut=false;
        checkedOutTo="";
    }


    @Override
    public String toString() {
        return "Book: " +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title+"'";
    }

}
