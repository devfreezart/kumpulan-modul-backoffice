package id.freezart.kumpulan.modul.backoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = {"/","/index"})
    public ModelAndView IndexAction(){
        ModelAndView view = new ModelAndView("index");

        return view;
    }

}
