package com.example.chit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chit.Entity.ItemUsers;

@Repository
public interface ItemUserRepository extends JpaRepository<ItemUsers, Long> {

	List<ItemUsers> findByChitId(Long chitId);

	List<ItemUsers> findByUserIdAndChitId(Long userId, Long chitId);

}
