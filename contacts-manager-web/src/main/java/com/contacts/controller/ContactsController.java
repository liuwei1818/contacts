package com.contacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contacts.pojo.ContactPerson;
import com.contacts.service.ContactsService;

@Controller
public class ContactsController {
	@Autowired
	private ContactsService contactsService;
	@RequestMapping("/contacts/{id}")
	@ResponseBody
	public ContactPerson getPersonById(@PathVariable Long id) {
		ContactPerson contactPerson = contactsService.getPersonById(id);
		return contactPerson;
	}
}
