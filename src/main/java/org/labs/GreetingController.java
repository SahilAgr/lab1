package org.labs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    private AddressBookRepository addressBookRepository;

    @Autowired
    public GreetingController(AddressBookRepository addressBookRepository){
        this.addressBookRepository=addressBookRepository;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam("bookId") int id,Model model){
        AddressBook book = addressBookRepository.findAddressBookById(id);
        model.addAttribute("bookId",book);
        return "greeting";
    }
}
