package tt.psc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {

//        create new student
//        add student as model attribute
        Student theStudent = new Student();

        model.addAttribute("student", theStudent);

//        model.addAttribute("theCountryOptions",theStudent.getCountryOptions());
        return "student-form";
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("student") Student student) {

        System.out.println(student.getFirstName() + " <- First name of student");
        System.out.println(student.getLastName() + " <- Last name of student");
        return "student-confirmation";
    }
}
