package by.dytni.shop.command.impl;

import by.dytni.shop.command.Command;
import by.dytni.shop.service.PantsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MainPageCommand implements Command {
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/mainpage.jsp").forward(request, response);
    }
}
