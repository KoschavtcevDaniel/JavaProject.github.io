import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Library {
    ArrayList <Book> a;
    Library (){
        a = new ArrayList<Book>();
    }
    void add(Book b){
        a.add(b);
    }

    void del(String nameB){
        int p = -1;
        for (int i = 0; i < a.size(); i++){
            if (nameB.equalsIgnoreCase(a.get(i).getName())) p = i;
        }
        if (p > -1){
            a.remove(p);
            System.out.println("Deleate: " + nameB);
        }
        else System.out.println("Not found ");
    }

    void delDp(int d, int b) {
        int t;
        if (d > b) {
            t = d;
            d = b;
            b = t;
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getYear() > d && a.get(i).getYear() < b) {
                a.remove(i);
            }
        }
        System.out.println("Its done");
    }

    void sortN(){
        a.sort(Book.NameC);
    }
    void sortY(){
        a.sort(Book.YearC, ArrayList.reverseOrder());
    }
    String printA(String n){
        System.out.println("Print: ");
        for (int i = 0; i < a.size(); i++){
            if (a.get(i).getNameA() == n){
                System.out.println(a.get(i).getName());
            }
        }
    }
}
