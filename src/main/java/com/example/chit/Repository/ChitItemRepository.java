package com.example.chit.Repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chit.Entity.ChitItems;
import com.example.chit.Entity.ItemUsers;

@Repository
public interface ChitItemRepository extends JpaRepository<ChitItems, Long> {

	/* ChitItems getAllUsersInchit(ChitItems chitItems); */

	/*
	 * ChitItems save(ItemUsers itemUsers);
	 */
	/* ChitItems add1(ItemUsers itemUsers); */

}
