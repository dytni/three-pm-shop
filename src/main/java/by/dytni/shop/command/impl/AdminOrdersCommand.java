package by.dytni.shop.command.impl;

import by.dytni.shop.command.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AdminOrdersCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // извлечь все заказы всех клиентов из БД
        // установить их в атрибут запроса
//        List<Order> orders = orderService.findAll();
//
//        req.setAttribute("orders", orders);


        // сделать forward на страничку '/WEB-INF/jsp/admin-orders.jsp'
        req.getRequestDispatcher("/WEB-INF/jsp/admin-orders.jsp").forward(req, resp);
    }
}
