package co.edu.unbosque.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionController implements ErrorController {
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "We don't know")
    @ExceptionHandler(Exception.class)
    @GetMapping("/error")
    public String ohno() {
        return "errCodes/500";
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Cause you mistyped")
    @GetMapping("/notfound")
    public String notFound() {
        return "errCodes/404";
    }
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "U hacker")
    @GetMapping("/unauthorized")
    public String unauthorized() {
        return "errCodes/403";
    }
}
