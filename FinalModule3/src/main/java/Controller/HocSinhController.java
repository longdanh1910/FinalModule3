package Controller;

import DAO.HocSinhDAO;
import model.HocSinh;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/HocSinhController")
public class HocSinhController extends HttpServlet {

    private HocSinhDAO hocSinhDAO = new HocSinhDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<HocSinh> listHocSinh = hocSinhDAO.getAllHocSinh();
        request.setAttribute("listHocSinh", listHocSinh);
        request.getRequestDispatcher("views/DanhSachHocSinh.jsp").forward(request, response);
    }
}
