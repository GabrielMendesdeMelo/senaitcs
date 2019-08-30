package br.com.loja.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.loja.DAO.productDao;
import br.com.loja.Model.productModel;
import br.com.loja.Repository.productrepository;

@Controller
public class appController {
	@Autowired
	private productDao service;
	@RequestMapping("/")
	public String ViewHomePage(Model model){
		List<productModel> listProducts = service.listall();
		model.addAttribute("listProducts",listProducts);
		return "index";
	}
	@RequestMapping("/new_product")
	public String showNewProductPage(Model model) {
		
		productModel product = new productModel();
		model.addAttribute("product", product);
		
		return "new_product";
		
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name="id")int id) {
		
		ModelAndView mav = new ModelAndView("edit");
		productModel product=service.get(id);
		mav.addObject("product", product);
		
		
		return mav;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	
	public String saveProduct(productModel product) {
		System.out.println(product.getBrand());
		service.save(product);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id")int id) {
		service.delete(id);
		return"redirect:/";
	}
	
}



