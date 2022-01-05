package Controller;


import Controller.Dto.TheDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TheController {
    @RequestMapping(value="/eee")
    public String main(){

        return "formprac";
    }
    @RequestMapping(value="/complete")
    public String main1(HttpServletRequest httpservletrequest,@ModelAttribute TheDto thed, Model model){
        System.out.println(httpservletrequest.getParameter("bb"));
//        TheDto thedto = new TheDto();
//        thedto.setBb(httpservletrequest.getParameter("bb"));
//        System.out.println(thedto.getBb());
        System.out.println(thed.getBb());
        model.addAttribute("bb",httpservletrequest.getParameter("bb"));
        return "ends";
    }


}
