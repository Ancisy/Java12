public class BookService {
    public Book[] getAllBook(){
        Book[] arrBook = new Book[3];
        arrBook[0] = new Book(1,"Đại Số","Toan","Lao Động Xã Hội",1992);
        arrBook[1] = new Book(2,"Vật Lý","Ly","Sự Thật",1995);
        arrBook[2] = new Book(3,"Hóa Học","Hóa","Thanh Niên",2022);
        return arrBook;
    }

    public void show(Book[] arrBook){
        for(int i = 0 ; i < arrBook.length ; i ++){
            System.out.println(arrBook[i].getBookIndex() + " - " + arrBook[i].getBookName() + " - " + arrBook[i].getBookCategory()
            + " - " + arrBook[i].getBookCampany() + " - " + arrBook[i].getBookYear());
        }
    }

    public void findBookbyName (Book[] arrBook, String bookName){
        boolean status = false;
        for(int i = 0; i < arrBook.length; i ++ ){
            if(arrBook[i].getBookName().contains(bookName)) {
                System.out.println(arrBook[i].getBookIndex() + " - " + arrBook[i].getBookName() + " - " + arrBook[i].getBookCategory()
                        + " - " + arrBook[i].getBookCampany() + " - " + arrBook[i].getBookYear());
                status = true;
            }
            }
        if(status !=true){
            System.out.println("Không có quyển sách cần tìm");

        }
    }

    public void findBookbyCategory(Book[] arrBook, String bookCategory){
        boolean status = false;
        for(int i = 0; i < arrBook.length; i ++ ){
            if(arrBook[i].getBookCategory().contains(bookCategory)){
                System.out.println(arrBook[i].getBookIndex() + " - " + arrBook[i].getBookName() + " - " + arrBook[i].getBookCategory()
                        + " - " + arrBook[i].getBookCampany() + " - " + arrBook[i].getBookYear());
                status = true;
            }
        }
        if(status != true){
            System.out.println("Không có quyển sách cần tìm");
        }
    }

    public void findBookbyYear(Book[] arrBook, int bookYear){
        boolean status = false;
        for(int i = 0; i < arrBook.length; i ++ ){
            if(arrBook[i].getBookYear() == bookYear){
                System.out.println(arrBook[i].getBookIndex() + " - " + arrBook[i].getBookName() + " - " + arrBook[i].getBookCategory()
                        + " - " + arrBook[i].getBookCampany() + " - " + arrBook[i].getBookYear());
            status = true;
            }
        }

        if(status != true){
            System.out.println("Không có quyển sách cần tìm");
        }
    }
}
