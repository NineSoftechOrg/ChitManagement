package com.example.chit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chit.Entity.LocalAdmin;

@Repository
public interface LocallAdminRepository extends JpaRepository<LocalAdmin, Long> {

	LocalAdmin findByUserIdAndChitMasterIdAndPaymentsIdAndChitItemsIdAndItemUsersId(Long userId, Long chitMasterId,
			Long paymentsId, Long chitItemsId, Long itemUsersId);

	

}
