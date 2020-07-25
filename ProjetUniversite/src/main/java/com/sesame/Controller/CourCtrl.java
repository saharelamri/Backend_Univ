package com.sesame.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.DAO.Cour;
import com.sesame.DAO.Universite;
import com.sesame.Interface.CourInterface;

@RestController
@RequestMapping("/cour")
public class CourCtrl {

	@Autowired
	private CourInterface f;
	@PostMapping("/add")
	Cour ajoutCour(@RequestBody Cour cour) {
		
		if(cour !=null) {
			return f.Add(cour);
		}
		return cour;
	}
	
	@GetMapping("/listecour")
	Collection<Cour> listeCour() {
		
			return f.getAll();
		
	}
	
	@DeleteMapping("/delete")
	public void deleteCour(@RequestParam long id) {
		
		if(f.findId(id)==true) {
			 f.Delete(id);
		}
	}
	

}
