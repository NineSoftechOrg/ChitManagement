package com.example.chit.Entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "item_users")
@Data
public class ItemUsers {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "chit_id")
	private Long chitId;
	
	@Column(name = "status")
	private boolean status = false;
	
	@Column( name = "chit_claimdate")
	private Date chitClaimDate;
	
	
	@Column(name = "claim_amount")
	private String claimAmount;
	
	

}
