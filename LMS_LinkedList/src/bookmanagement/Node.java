package bookmanagement;

/**
 *
 * @author duongvnhe191516
 * @version 1.0
 */
public class Node {
    Book bookInfo;
    Reader readerInfo;
    Lending lendingInfo;
    Node next;

    //Book
    Node(Book x, Node p){
        readerInfo = null;
        lendingInfo = null;
        bookInfo = x;
        next = p;
    }
    Node(Book x){
        this(x, null);
    }
    //Reader
    Node(Reader x, Node p){
        bookInfo = null;
        lendingInfo = null;
        readerInfo = x;
        next = p;
    }
    Node(Reader x){
        this(x, null);
    }
    //Lending
    Node(Lending x, Node p){
        bookInfo = null;
        readerInfo = null;
        lendingInfo = x;
        next = p;
    }
    Node(Lending x){
        this(x, null);
    }
    
}
