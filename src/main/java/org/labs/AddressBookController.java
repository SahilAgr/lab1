package org.labs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressBookController {
    private AddressBookRepository addressBookRepository;

    @Autowired
    public AddressBookController(AddressBookRepository addressBookRepository){
        this.addressBookRepository = addressBookRepository;
    }

    @RequestMapping(value = "/newBook",method = RequestMethod.POST)
    public AddressBook createAddressBook(){
        AddressBook addressBook = new AddressBook();
        addressBookRepository.save(addressBook);
        return addressBook;
    }

    @RequestMapping(value = "/addressBook",method = RequestMethod.GET)
    public List<BuddyInfo> getAddressBook(@RequestParam("id")int id){
        AddressBook book = addressBookRepository.findAddressBookById(id);
        System.out.println(book);
        return book.getBuddies();
    }
}
