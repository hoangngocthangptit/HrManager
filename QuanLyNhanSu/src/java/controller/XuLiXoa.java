package controller;

import dao.PersonalDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
public class XuLiXoa extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idString = request.getParameter("id");
        int id = Integer.parseInt(idString);
        boolean checkDelete = false;
        try {
            checkDelete = PersonalDAO.xoaPersonal(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (checkDelete) {

            response.sendRedirect("QuanLyNhanVienChinhThuc.jsp");
        } else {
             response.sendRedirect("404.jsp");

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


}
