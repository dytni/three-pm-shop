package by.dytni.shop;

import by.dytni.shop.controller.Dashboard;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MainServlet" , urlPatterns = "/pm/*")
public class MainServlet extends HttpServlet {
    Dashboard dashboard = new Dashboard();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dashboard.service(req,resp);
    }
}
