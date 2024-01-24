package com.example.chit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chit.Entity.ChitMaster;

@Repository
public interface ChitMasterRepository extends JpaRepository<ChitMaster, Long> {

}
