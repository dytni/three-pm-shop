package by.dytni.shop.service;

import by.dytni.shop.repository.ShopRepository;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class PantsService {
    public void setAttribute(HttpServletRequest request){
        ShopRepository shopRepository = new  ShopRepository();
        request.setAttribute("pantslist", shopRepository.getAll());
//        HttpSession session = ((HttpServletRequest) request).getSession(true);
//        session.setAttribute("pantslist", shopRepository.getAll());
    }
}
