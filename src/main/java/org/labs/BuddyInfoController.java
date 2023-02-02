package org.labs;

import org.springframework.web.bind.annotation.*;

@RestController
public class BuddyInfoController {
    private BuddyInfoRepository buddyInfoRepository;
    private AddressBookRepository addressBookRepository;

    public BuddyInfoController(BuddyInfoRepository buddyInfoRepository,AddressBookRepository addressBookRepository){
        this.buddyInfoRepository = buddyInfoRepository;
        this.addressBookRepository = addressBookRepository;
    }

    @RequestMapping(value = "/getBuddy",method = RequestMethod.GET)
    public BuddyInfo getBuddyInfo(@RequestParam("addressBookId")int bookId,@RequestParam("buddyInfoId") int buddyId){
        AddressBook addressBook = addressBookRepository.findAddressBookById(bookId);
        return addressBook.getBuddy(buddyId);
    }

    @RequestMapping(value = "/addBuddy",method = RequestMethod.POST)
    public BuddyInfo addBuddy(@RequestParam("addressBookId")int bookId,@RequestBody BuddyInfo buddyInfo){
        AddressBook addressBook = addressBookRepository.findAddressBookById(bookId);
        addressBook.addBuddy(buddyInfo);
        addressBookRepository.save(addressBook);
        return buddyInfo;
    }

    @RequestMapping(value = "/removeBuddy", method = RequestMethod.DELETE)
    public BuddyInfo removeBuddy(@RequestParam("addressBookId") int bookId, @RequestParam("buddyInfoId") int buddyId){
        AddressBook addressBook = addressBookRepository.findAddressBookById(bookId);
        BuddyInfo buddyInfo = addressBook.getBuddy(buddyId);
        addressBook.removeBuddy(buddyId);
        addressBookRepository.save(addressBook);
        buddyInfoRepository.delete(buddyInfo);
        return buddyInfo;
    }

}
