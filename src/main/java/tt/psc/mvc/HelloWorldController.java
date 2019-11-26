package tt.psc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

//    controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

//    need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String pleaseProcessThisForm(){
        return "helloworld";
    }

}
