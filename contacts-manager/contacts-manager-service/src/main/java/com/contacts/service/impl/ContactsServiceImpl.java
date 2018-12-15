package com.contacts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.mapper.ContactPersonMapper;
import com.contacts.pojo.ContactPerson;
import com.contacts.service.ContactsService;

@Service
public class ContactsServiceImpl implements  ContactsService{
	@Autowired
	private ContactPersonMapper contactPersonMapper;
	@Override
	public ContactPerson getPersonById(long id) {
		ContactPerson contactPerson = contactPersonMapper.selectByPrimaryKey(id);
		return contactPerson;
	}	
}
