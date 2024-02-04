package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
