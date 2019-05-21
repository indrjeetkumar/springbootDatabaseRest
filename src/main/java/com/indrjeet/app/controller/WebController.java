package com.indrjeet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.indrjeet.app.model.Customer;
import com.indrjeet.app.repository.CustomerRepository;

@RestController
@RequestMapping()
public class WebController {

	@Autowired
	CustomerRepository repository;

	@RequestMapping("/save")
	public String process() {
		repository.save(new Customer("Indrjeet","Kumar"));
		repository.save(new Customer("Abijith Kumar","Sinha"));
		repository.save(new Customer("Ranjeet","Kumar"));
		return "done";
	}

	//@RequestMapping("/findall")
	public String findAll() {
		String result = "<html>";

		for (Customer cust : repository.findAll()) {
			result = result + "<div>" + cust.toString() + "</div>" ;
		}
		return result + "</html>";
	}

	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id) {
		String result = "long";
		result = result + repository.findById(id).toString();
		return result;

	}
	
	/*
	 * //@RequestMapping("/findbyid")
	 * 
	 * @RequestMapping public String findById(@RequestParam("id") String id) {
	 * String result = "String"; result = result +
	 * repository.findById(Long.parseLong(id)).toString(); return result; }
	 */
	

	@RequestMapping("/findbylastname")
	public String fetchDataByName(@RequestParam("lastname") String lastname) {
		String result = "<html>";

		for (Customer cust : repository.findByLastName(lastname)) {
			result = result + "<div>" + cust.toString() + "</div>";
		}
		return result + "</html>";

	}
}
