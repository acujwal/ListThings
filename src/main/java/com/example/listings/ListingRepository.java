package com.example.listings;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListingRepository extends CrudRepository<Listing, Long>{
    List<Listing> findAllByOrderByDateDesc();
}