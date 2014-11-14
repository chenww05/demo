package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * You could also create a home index.html but it will be overrided. 
 * @author weiweich
 *
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String index() {
        return "Welcome to the home page!";
    }
}