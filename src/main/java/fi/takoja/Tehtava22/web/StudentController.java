package fi.takoja.Tehtava22.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.takoja.Tehtava22.domain.Student;

@Controller
public class StudentController {
	
	private ArrayList<Student> opiskelijat = new ArrayList<>();
	
	Student opiskelija1 = new Student("Peppi", "Pitkätossu");
	Student opiskelija2 = new Student("Lassi", "Lippahattu");
	Student opiskelija3 = new Student("Kalle", "Kolisija");
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greetingPage(Student student, Model model) {
		opiskelijat.add(opiskelija1);
		opiskelijat.add(opiskelija2);
		opiskelijat.add(opiskelija3);
		model.addAttribute("student", student);
		model.addAttribute("opiskelijat", opiskelijat);
		return "oppilaslistaus";
	}
	
}
