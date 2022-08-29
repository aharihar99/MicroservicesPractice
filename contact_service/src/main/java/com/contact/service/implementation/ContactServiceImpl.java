package com.contact.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	
	//fake list of contacts
	List<Contact> contactList= List.of(
			new Contact(1L,"aharihar@yahoo.com","Harihar",101L),
			new Contact(2L,"vedantholey021@gmail.com","Vedant",102L),
			new Contact(3L,"pbhalse007@gmail.com","Pratik",103L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return contactList.stream()
				.filter(contact->contact.getUserId().equals(userId))
					.collect(Collectors.toList()); 
	}

}
