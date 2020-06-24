package ca.sheridancollege.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.sheridancollege.beans.PoolEquipment;
import ca.sheridancollege.database.DatabaseAccess;

@Controller
public class StoreController {
	
	@Autowired
	private DatabaseAccess da;
	
	@GetMapping("/")
	public String goHome() {
		da.addStore();
		return "home.html";
	}
	
	@GetMapping("/add")
	public String doAddEquipment(Model model, @ModelAttribute PoolEquipment poolEquipment) {
		da.addEquipment();
		model.addAttribute("poolEquipment", new PoolEquipment());
		return "addEquipment.html";
	}
	@GetMapping("/view")
	public String goView(Model model) {
		da.addEquipment();
		model.addAttribute("poolEquipment", new PoolEquipment());
		return "addEquipment.html";
	}

}
