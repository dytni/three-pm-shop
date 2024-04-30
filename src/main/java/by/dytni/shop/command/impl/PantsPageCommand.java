package by.dytni.shop.command.impl;

import by.dytni.shop.command.Command;
import by.dytni.shop.service.PantsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class PantsPageCommand implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PantsService pantsService = new PantsService();
        pantsService.setAttribute(req);
        req.getRequestDispatcher("/WEB-INF/jsp/pantspage.jsp").forward(req, resp);

    }
}
