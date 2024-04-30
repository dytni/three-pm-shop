package by.dytni.shop.command.impl;

import by.dytni.shop.command.Command;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class NotFoundCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Данная страница не существует");
    }
}
