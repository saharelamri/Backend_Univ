package com.sesame.Service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.Cour;
import com.sesame.Interface.CourInterface;
import com.sesame.Repository.CourRepository;

@Service
public class CourService  implements CourInterface{
	@Autowired
	private CourRepository cour;
	@Transactional
	@Override
	public Collection<Cour> getAll() {
		// TODO Auto-generated method stub
		return cour.findAll();
	}

	@Override
	public Cour getId(Long id) {
		// TODO Auto-generated method stub
		return cour.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		cour.deleteById(id);
	}

	@Override
	public Cour Add(Cour c) {
		// TODO Auto-generated method stub
		return cour.save(c);
	}

	@Override
	public Cour Edit(Cour c) {
		// TODO Auto-generated method stub
		return cour.saveAndFlush(c);
	}
	
	
	@Override
	public Boolean findId(Long id) {
		// TODO Auto-generated method stub
		boolean res=false;
		if (cour.findByCodeC(id)==null){
				res=false;	
				}
		else {
		res=true;
		}
		return res;
	}

}
