package minrest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import minrest.domain.Person;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@RequestMapping(method = RequestMethod.GET)
	public List<Person> getAll() {
		List<Person> persons = new ArrayList<>();
		Person p = new Person("Walter", "White", "Texas");
		persons.add(p);
		p = new Person("Jessie", "Pinkman", "Texas");
		persons.add(p);
		p = new Person("Saul", "Goodman", "New Mexico");
		persons.add(p);
		return persons;
	}
}
