package by.dytni.shop.controller;

import by.dytni.shop.command.Command;
import by.dytni.shop.command.provider.CommandProvider;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Dashboard extends HttpServlet {
    private CommandProvider commandProvider = new CommandProvider();

    @Override
    public void init(ServletConfig config) {
        //logger.debug("Сервлет был инициализирован");
        commandProvider = (CommandProvider) config.getServletContext().getAttribute("commandProvider");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //logger.info("Получен запрос к DashboardController");

        String role = (String) req.getAttribute("role"); // ADMIN
        String page = req.getParameter("page"); // adminOrders
        String method = req.getMethod();


        // логика выбора нужной страницы dashboard-а
        Command command = commandProvider.getCommand(role, page, method);
        command.execute(req, resp);
    }
}
