import java.text.DateFormat;
import java.util.logging.Logger;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HomeController {

	public static final Logger logger=Loggerfactory.getFactory(HomeController.class);
	
	
	@RequestMapping(value ="/", method=RequestMethod.GET)
	
	public String home(Local local, Model model)
	{
		logger.info("welcome home! the client local is {}.",local);
		
		Date date= new Date();
		DateFormat dateformate=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formatedate=dateformate.format(date);
		
		model.addAllAttributes("serverTime",formatedate);
	
		return "home";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
