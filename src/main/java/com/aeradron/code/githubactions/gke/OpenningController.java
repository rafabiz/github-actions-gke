package com.aeradron.code.githubactions.gke;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OpenningController {

    @RequestMapping("/")
    @ResponseBody
    public String openning(){
        return "Agora Vai!!!!!";
    }

}
