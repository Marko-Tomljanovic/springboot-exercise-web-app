package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Firme;

@Repository
public interface FirmeRepository extends JpaRepository<Firme, Long> {

}
