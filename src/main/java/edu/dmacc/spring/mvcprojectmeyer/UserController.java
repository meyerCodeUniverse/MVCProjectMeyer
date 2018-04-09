package edu.dmacc.spring.mvcprojectmeyer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.dmacc.spring.mvcprojectmeyer.Product;


@Controller
public class UserController {
	@Autowired UserDao dao;
	
	@RequestMapping(value="/form")
	public ModelAndView product() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userForm");
		modelAndView.addObject("product", new Product());
		
		return modelAndView;
}
	@RequestMapping(value="/result")
	public ModelAndView processProduct(Product product) {
		ModelAndView modelAndView = new ModelAndView();
		dao.insertProduct(product);
		modelAndView.setViewName("productResult");
		modelAndView.addObject("p", product);
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Product> allProducts = dao.getAllProducts();
		modelAndView.setViewName("viewAllProducts");
		modelAndView.addObject("all", allProducts);
		return modelAndView;
}
	
	@Bean
	public UserDao dao() {
		UserDao bean = new UserDao();
		return bean;
	}
	
}
