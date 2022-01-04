package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
        @RequestMapping(value = "/ddd")
                                               //   void  mapping에 작성해놓은 주소의 view를 리턴함
        public String main(){                   // String  return 에 작성된 주소의 view를 리턴한다
            return "fff";
        }

}
