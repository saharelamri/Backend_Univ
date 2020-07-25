package com.sesame.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.DAO.Salle;
import com.sesame.Interface.SalleInterface;

@RestController
@RequestMapping("/salle")
public class SalleCtrl {

	@Autowired
	private SalleInterface f;
	@PostMapping("/add")
	Salle ajoutSalle(@RequestBody Salle Salle) {
		
		if(Salle !=null) {
			return f.Add(Salle);
		}
		return Salle;
	}
	
	@GetMapping("/get")
	Collection<Salle> listeSalle() {
		
			return f.getAll();
		
	}
	
	@DeleteMapping("/delete")
	public void deleteSalle(@RequestParam long id) {
		
		if(f.findId(id)==true) {
			 f.Delete(id);
		}
	}
	
}
