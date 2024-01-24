package com.example.chit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chit.Entity.SuperAdmin;

@Repository
public interface SuperAdminRepository  extends JpaRepository<SuperAdmin, Long>{

	SuperAdmin findByChitMasterIdAndUserIdAndLocalAdminId(Long chitMasterId, Long userId, Long localAdminId);

	

}
