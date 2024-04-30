package by.dytni.shop.command.impl;

import by.dytni.shop.command.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UserCartCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // сделать forward на страничку '/WEB-INF/jsp/user-cart.jsp'
        req.getRequestDispatcher("/WEB-INF/jsp/user-cart.jsp").forward(req, resp);
    }
}
