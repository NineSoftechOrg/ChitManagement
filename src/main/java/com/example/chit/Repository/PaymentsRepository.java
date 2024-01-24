package com.example.chit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chit.Entity.Payments;

@Repository
public interface PaymentsRepository  extends JpaRepository<Payments, Long>{

	Payments findByChitMasterIdAndUserIdAndChitItemsId(Long chitMasterId, Long userId, Long chitItemsId);

	List<Payments> findByChitItemsId(Long chitItemsId);


	


}
