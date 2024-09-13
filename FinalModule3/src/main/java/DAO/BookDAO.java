package DAO;

import model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("MS001", "Tắt Đèn", "Ngô Tất Tố", "Tác phẩm hiện thực", 5));
        books.add(new Book("MS002", "Truyện Kiều", "Nguyễn Du", "Tác phẩm thơ", 3));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookByMaSach(String maSach) {
        for (Book book : books) {
            if (book.getMaSach().equals(maSach)) {
                return book;
            }
        }
        return null;
    }

    public void updateBookQuantity(String maSach, int soLuong) {
        Book book = getBookByMaSach(maSach);
        if (book != null) {
            book.setSoLuong(soLuong);
        }
    }
}
