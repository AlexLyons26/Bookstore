package action;


import java.awt.print.Book;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
 
public class ShoppingCart{
 
    //List of items
    List<Book> books;
     
    public ShoppingCart(){
        this.books=new ArrayList<Book>();
    }
     
    public void addItem(Book book){
        this.books.add(book);
    }
     
    public void removeItem(Book book){
        this.books.remove(book);
    }
     
    public int calculateTotal(){
        int sum = 0;
        for(Book book: books){
      //      sum += book.getPrice();
        }
        return sum;
    }
     
    public void pay(PaymentAction paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}