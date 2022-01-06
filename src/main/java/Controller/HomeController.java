package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //아까 WEB-INF > views 의 index.jsp에서 누른 버튼으로 /ddd를 가게되어 이번엔 리턴값인 fff.jsp를 탐
    //브라우저에 fff.jsp 내용을 보여준다
        @RequestMapping(value = "/ddd")
                                               //   void  mapping에 작성해놓은 주소의 view를 리턴함
        public String main(){                   // String  return 에 작성된 주소의 view를 리턴한다
            return "fff";
        }

}
