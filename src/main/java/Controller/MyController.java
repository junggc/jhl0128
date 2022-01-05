package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
        @RequestMapping (value = "/fff")

        public String main(){
                 return "index";
        }

}
