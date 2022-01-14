package com.kacelab.practice.Controller;


import com.kacelab.practice.Controller.Dto.TheDto;
import com.kacelab.practice.Service.TheService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TheController {
    // /eee로 가서 리턴값인 formprac.jsp 파일을 브라우저에 보여줌


    @RequestMapping(value="/eee")
    public String main(){

        return "formprac";
    }
    //formprac에 submit 버튼으로 /complete 경로로 가게 되어 리턴값인 ends.jsp를 브라우저에 보여준다

    @RequestMapping(value="/complete")
    public String main1(HttpServletRequest httpservletrequest,@ModelAttribute TheDto thed, Model model){

        TheService theService = new TheService();
        theService.TDto(thed);
       // System.out.println(httpservletrequest.getParameter("bb"));
//        TheDto thedto = new TheDto();
//        thedto.setBb(httpservletrequest.getParameter("bb"));
//        System.out.println(thedto.getBb());
        System.out.println(thed.getBb()+"PP");
        model.addAttribute("cc",httpservletrequest.getParameter("cc"));
        return "ends";

    }


}
