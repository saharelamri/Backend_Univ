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

import com.sesame.DAO.Departement;
import com.sesame.Interface.DepartementInterface;

@RestController
@RequestMapping("/departement")
public class DepartementCtrl {

	@Autowired
	private DepartementInterface f;
	@PostMapping("/add")
	Departement ajoutDepartement(@RequestBody Departement dep) {
		
		if(dep !=null) {
			return f.Add(dep);
		}
		return dep;
	}
	
	@GetMapping("/listedep")
	Collection<Departement> listeDepartement() {
		
			return f.getAll();
		
	}
	
	@DeleteMapping("/delete")
	public void deleteDep(@RequestParam long id) {
		
		if(f.findId(id)==true) {
			 f.Delete(id);
		}
	}
}
