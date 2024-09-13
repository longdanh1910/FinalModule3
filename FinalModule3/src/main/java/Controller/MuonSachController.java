package Controller;

import DAO.MuonSachDAO;
import model.MuonSach;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/MuonSachController")
public class MuonSachController extends HttpServlet {

    private MuonSachDAO muonSachDAO = new MuonSachDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MuonSach> listMuonSach = muonSachDAO.getAllMuonSach();
        request.setAttribute("listMuonSach", listMuonSach);
        request.getRequestDispatcher("views/MuonSach.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maMuonSach = request.getParameter("maMuonSach");
        String maHocSinh = request.getParameter("maHocSinh");
        String maSach = request.getParameter("maSach");
        Date ngayMuon = Date.valueOf(request.getParameter("ngayMuon"));
        Date ngayTra = Date.valueOf(request.getParameter("ngayTra"));

        MuonSach muonSach = new MuonSach(maMuonSach, maHocSinh, maSach, ngayMuon, ngayTra, false);
        muonSachDAO.addMuonSach(muonSach);

        response.sendRedirect("MuonSachController");
    }
}
