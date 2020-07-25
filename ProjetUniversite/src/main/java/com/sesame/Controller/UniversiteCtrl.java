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

import com.sesame.DAO.Universite;
import com.sesame.Interface.UniversiteInterface;

@RestController
@RequestMapping("/universite")
public class UniversiteCtrl {

	@Autowired
	private UniversiteInterface f;
	@PostMapping("/add")
	Universite ajoutUniversite(@RequestBody Universite universite) {
		
		if(universite !=null) {
			return f.Add(universite);
		}
		return universite;
	}
	
	@GetMapping("/listeuniv")
	Collection<Universite> listeUniversite() {
		
			return f.getAll();
		
	}
	
	@DeleteMapping("/delete")
	public void deleteUniversity(@RequestParam long id) {
		
		if(f.findId(id)==true) {
			 f.Delete(id);
		}
		}
	
	
	@PutMapping("/put")
	Universite modif (@RequestBody Universite c) {
		
		long id=c.getCodeUNV();
		String adr=c.getAdresseUNV();
		String nom=c.getNomUNV();

		
		if(f.findId(id)==true) {
			Universite u=new Universite(id,nom,adr);
			
			return  f.Edit(c);
			}
		else {
			return null;}
		}
	
	
}
