package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
        @RequestMapping(value = "/ddd")
        public String main(){
            return "index";
        }

}
