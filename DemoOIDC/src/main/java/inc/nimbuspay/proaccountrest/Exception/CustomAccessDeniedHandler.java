package inc.nimbuspay.proaccountrest.Exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e)
            throws IOException, ServletException {
        // response.addHeader("access_denied_reason", "not_authorized");
        // response.sendError(404, "Not Authorised");

        response.setStatus(HttpStatus.FORBIDDEN.value());

        response.setContentType("application/json");

        String errorMessage = "{\"error\": \"You are an unauthorized person. Access denied.\"}";
        response.getWriter().write(errorMessage);

    }

}
