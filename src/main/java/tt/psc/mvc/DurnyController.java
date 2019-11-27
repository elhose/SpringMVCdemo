package tt.psc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/durnyController")
public class DurnyController {

    @RequestMapping("/showForm")
    public String durnaFunkcja(){
        return "helloworld";
    }

}
