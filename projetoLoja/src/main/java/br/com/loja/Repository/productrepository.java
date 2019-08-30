package br.com.loja.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.loja.Model.productModel;

public interface productrepository extends JpaRepository <productModel,Integer>{

	//void Save(productrepository product);

	//List<productrepository> listAll();

	
}