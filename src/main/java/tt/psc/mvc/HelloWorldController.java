package tt.psc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/dobryController")
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

//    new controller method to read form data
//    add data to model
    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model){

        String parameter = request.getParameter("studentName");

        String shoutString = "Yo! " + parameter.toUpperCase(Locale.ENGLISH);

        model.addAttribute("message", shoutString);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutTwo(@RequestParam("studentName") String name, Model model){

        String shoutString = "Hello there! " + name.toUpperCase(Locale.ENGLISH);

        model.addAttribute("message", shoutString);

        return "helloworld";
    }

}
