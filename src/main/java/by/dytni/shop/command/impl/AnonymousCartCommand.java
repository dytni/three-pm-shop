package by.dytni.shop.command.impl;

import by.dytni.shop.command.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AnonymousCartCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // извлечь из сессии id товаров текущего пользователя
        // извлечь товары с указанными id из БД
        // установить товары в атрибут запроса

        // сделать forward на страничку '/WEB-INF/jsp/anonymous-cart.jsp'
        req.getRequestDispatcher("/WEB-INF/jsp/anonymous-cart.jsp").forward(req, resp);
    }
}
