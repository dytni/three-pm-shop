package by.dytni.shop.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebFilter(filterName = "DashboardFilter", urlPatterns = "/*")
public class DashboardFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession(true);
        if (session.getAttribute("role") == null) {
            request.setAttribute("role", "anonymous");
        } else {
            request.setAttribute("role", session.getAttribute("role"));
        }
//        if (session.getAttribute("page") == null) {
//            request.setAttribute("page", "main");
//        } else {
//            request.setAttribute("page", session.getAttribute("page"));
//        }
        chain.doFilter(request, response);

    }
}
