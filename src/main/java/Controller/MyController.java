package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    //웰컴페이지인 web > index.jsp 에서 버튼을 클릭하여 /fff경로로 가는데 /fff로 가게되면 브라우저에 리턴 index.jsp의 내용을 보여준다
    //이떄 index.jsp는 WEB-INF > views > index.jsp

        @RequestMapping (value = "/fff")
        public String main(){
                 return "index";
        }

}
