package hh.swd20.autoprojekti.webcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.autoprojekti.domain.Auto;



@Controller
public class AutoController {
	
	//palauttaa autolistauksen
	@RequestMapping(value="/cars", method=RequestMethod.GET)
	public String getAutot(Model model) {
		
		//ei haeta vielä tietokannasta mitään
		//luodaan tyhjä lista
		
		List<Auto> autot = new ArrayList<Auto>();
		autot.add(new Auto("Tesla", 2020));
		autot.add(new Auto("Saab", 1986));
		
		//lisätään autolista model-olion mappiin avainarvolla templatea varten
		model.addAttribute("autot", autot); //1. "keyword" for map 2.dataobject
		
		return "autolista"; //palautetaan autolista.html- templaten nimi DispatcherServletille
	}

}
