package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.AdvertiseStatus;

public interface StatusRepository extends JpaRepository<AdvertiseStatus, Long> {

}
