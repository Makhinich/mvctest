package ua.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * Created by Slava on 07.04.2017.
 */

@Controller
public class MainController {

    @RequestMapping (value = "/")
    public String index () {
        return "index";
    }
}
