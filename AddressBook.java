package oops_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	private List<AddContact> addContacts= new ArrayList<>();
	
	public void addContact(AddContact address) {
		addContacts.add(address);
	}
	public void editContact(String newName,String name,Long phoneNumber,String email) {
		for(AddContact contact:addContacts) {
			if(contact.getName().equals(name)) {
				contact.setName(newName);
				contact.setPhoneNumber(phoneNumber);
				contact.setEmail(email);
				System.out.println(name+" got updated");
			}
			else
			{
				System.out.println("Contact is not updated !!!!!!!!!!!!");
			}
			
		}
	}
	public  void deleteContact(String name) {

		for(AddContact contact: addContacts) {
			if(contact.getName().equals(name)) {
				addContacts.remove(contact);
				System.out.println("The "+name+" is deleted..." );
			}
		}
		
		
	}
	public void listAllContacts() {
		if(addContacts.isEmpty()) {
			System.out.println("there are no contacts!!!");
		}
		else {
			for(AddContact contact:addContacts) {
				
				System.out.println(addContacts);
			}
		}
	}
}
 class AddressBookApp{
	 public static void main(String[] args) {
		AddressBook book=new AddressBook();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. List Contacts");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1/2/3/4/5): ");
            int choice = sc.nextInt();
            
            switch(choice) {
            
            case 1: System.out.println("Enter your  name");
            sc.nextLine();
					String name=sc.nextLine();
					
					System.out.println("enter your phone number");
					
					Long phoneNumber=sc.nextLong();
					System.out.println("Enter your email address");
					String email=sc.next();
					
					AddContact contact=new AddContact(name,phoneNumber,email);
					book.addContact(contact);
					
					System.out.println("Contact added Successfully");
					break;
					
            case 2:
            	System.out.println("Enter name to edit the contact");
            	  sc.nextLine();
            	String oldName=sc.nextLine();
            	
            	System.out.println("Enter your new name");
				String newName=sc.nextLine();
				System.out.println("enter your new phone number");
				Long newPhoneNumber=sc.nextLong();
				System.out.println("Enter your new email address");
				String newEmail=sc.next();
				book.editContact(newName, oldName, newPhoneNumber, newEmail);
				
            	break;
            case 3:
            	System.out.println("enter name to delete");
            	String deleteName=sc.nextLine();
            	book.deleteContact(deleteName);
            	break;
            case 4:
                System.out.println("\nList of Contacts:");
                book.listAllContacts();
                break;

            	
            	
            
            }
			
			
			
			
		}
	}
	
}
