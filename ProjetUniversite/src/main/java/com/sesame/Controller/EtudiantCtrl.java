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

import com.sesame.DAO.Etudiant;
import com.sesame.Interface.EtudiantInterface;

@RestController
@RequestMapping("/etudiant")
public class EtudiantCtrl {

	@Autowired
	private EtudiantInterface f;
	@PostMapping("/add")
	Etudiant ajoutEtudiant(@RequestBody Etudiant Etudiant) {
		
		if(Etudiant !=null) {
			return f.Add(Etudiant);
		}
		return Etudiant;
	}
	
	@GetMapping("/get")
	Collection<Etudiant> listeEtudiant() {
		
			return f.getAll();
		
	}
	
	@DeleteMapping("/delete")
	public void deleteEtudiant(@RequestParam long id) {
		
		if(f.findId(id)==true) {
			 f.Delete(id);
		}
	}
	
}
