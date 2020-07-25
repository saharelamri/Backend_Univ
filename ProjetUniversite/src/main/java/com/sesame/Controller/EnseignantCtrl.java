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

import com.sesame.DAO.Enseignant;
import com.sesame.Interface.EnseignantInterface;

@RestController
@RequestMapping("/enseignant")
public class EnseignantCtrl {

	@Autowired
	private EnseignantInterface f;
	@PostMapping("/add")
	Enseignant ajoutEnseignant(@RequestBody Enseignant Enseignant) {
		
		if(Enseignant !=null) {
			return f.Add(Enseignant);
		}
		return Enseignant;
	}
	
	@GetMapping("/get")
	Collection<Enseignant> listeEnseignant() {
		
			return f.getAll();
		
	}
	
	@DeleteMapping("/delete")
	public void deleteEnseignant(@RequestParam long id) {
		
		if(f.findId(id)==true) {
			 f.Delete(id);
		}
	}
}
