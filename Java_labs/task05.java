package lab8.task1;
abstract class ABook {
   String title;
    int daysTakenOut;
     int daysDue;
      int daysReturned;
    
   
    public ABook(String title, int daysTakenOut, int daysDue) {
        this.title = title;
        this.daysTakenOut = daysTakenOut;
        this.daysDue = daysDue;
    }
    
    
    public int daysOverdue(int today) {
        int daysOverdue = today - daysDue;
        return (daysOverdue > 0) ? daysOverdue : 0;
    }
    
    
    public boolean isOverdue(int today) {
        return daysOverdue(today) > 0;
    }
    
    
    public abstract double computeFine(int today);
}
class RegularBook extends ABook {
    protected String author;
    
    // constructor
    public RegularBook(String title, String author, int daysTakenOut, int daysDue) {
        super(title, daysTakenOut, daysDue);
        this.author = author;
    }
    
    // implementation of computeFine() for regular books
    public double computeFine(int today) {
        int daysOverdue = daysOverdue(today);
        return (daysOverdue > 0) ? 0.10 * daysOverdue : 0;
    }
}

class ReferenceBook extends ABook {
 
    public ReferenceBook(String title, int daysTakenOut, int daysDue) {
        super(title, daysTakenOut, daysDue);
    }
    
   
    public double computeFine(int today) {
        return 0; // reference books cannot be overdue
    }
}

class AudioBook extends ABook {
    protected String author;
    
   
    public AudioBook(String title, String author, int daysTakenOut, int daysDue) {
        super(title, daysTakenOut, daysDue);
        this.author = author;
    }
    

    public double computeFine(int today) {
        int daysOverdue = daysOverdue(today);
        return (daysOverdue > 0) ? 0.20 * daysOverdue : 0;
    }
}

public class task05 {
    public static void main(String[] args) {
    RegularBook book1 = new RegularBook("Pride and Prejudice", "Jane Austen", 6371, 6385);
    ReferenceBook book2 = new ReferenceBook("The Dictionary", 6372, 6374);
    AudioBook book3 = new AudioBook("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 6371, 6385);
    
    double fine1 = book1.computeFine(6388);
    double fine2 = book2.computeFine(6375);
    double fine3 = book3.computeFine(6388);
    
    book1.title="pride prejudice";
     book1.author="Jane austen";
     book1.daysDue=3;
     book1.daysReturned=3;
     book1.daysTakenOut=2;
    
    
    
  
    
    }

}
