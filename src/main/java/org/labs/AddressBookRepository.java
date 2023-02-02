package org.labs;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AddressBookRepository extends CrudRepository<AddressBook,Integer>{
    AddressBook findAddressBookById(int id);
}
