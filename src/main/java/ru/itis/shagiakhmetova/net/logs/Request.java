package ru.itis.shagiakhmetova.net.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class Request {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Request.class);

    public static void log(HttpServletRequest request) {
        logger.info(request.getServletPath());
    }
}
