import java.util.Comparator;

class Book implements Comparator<Book>{
    private int y;
    private String nA, nB;
    Book (String nameB,String nameA, int year){
        this.y = year;
        this.nA = nameA;
        this.nB = nameB;
    }
    String getName(){return nB;}
    String getNameA(){return nA;}
    int getYear(){return y;}

    void setName(String nameB){this.nB = nameB;}

    public static Comparator<Book> NameC = new Comparator<Book>(){
        public int compare(Book b1, Book b2){
            return b1.getName().compareTo(b2.getName());
        }
    };

    public static Comparator<Book> YearC = new Comparator<Book>(){
        public int compare(Book b1, Book b2){
            return b1.getYear() - b2.getYear();
        }
    };
}
