package br.com.loja.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.loja.Model.productModel;
import br.com.loja.Repository.productrepository;

@Service
@Transactional
public class productDao {
	
	@Autowired
	private productrepository repo;
	
	public List<productModel> listall(){
		return repo.findAll();
	}
	
	public productModel get(int id) {
		return repo.findById(id).get();
	}
	
	public void save(productModel product) {
		repo.save(product);
	}
	
	public void delete(int id) {
		repo.deleteById((int) id);
	}
}
