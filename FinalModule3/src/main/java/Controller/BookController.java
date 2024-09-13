package Controller;

import DAO.BookDAO;
import model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/BookController")
public class BookController extends HttpServlet {

    private BookDAO bookDAO = new BookDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> listBooks = bookDAO.getAllBooks();
        request.setAttribute("listBooks", listBooks);
        request.getRequestDispatcher("views/DanhSachSach.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maSach = request.getParameter("maSach");
        int soLuong = Integer.parseInt(request.getParameter("soLuong"));

        bookDAO.updateBookQuantity(maSach, soLuong);

        response.sendRedirect("BookController");
    }
}
