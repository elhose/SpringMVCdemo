package tt.psc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/mvc")
    public String showPage(){
        return "main-menu";
    }

}
