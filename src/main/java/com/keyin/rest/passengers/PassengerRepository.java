package com.keyin.rest.passengers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {
    public Passenger findByFirstName(String firstName);
    public Passenger findByLastName(String lastName);
    public Passenger findByPhoneNumber(String phoneNumber);
}