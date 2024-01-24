package com.example.chit.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "chit_items")
@Data
public class ChitItems {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "chit_id")
	private Long chitId;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name="auction_amount")
	private String auctionAmount ;
	
	@Column(name = "chit_amount")
	private String chitAmount;
	
	@Column(name = "auction_date")
	private LocalDate auctionDate;
	
	@Column(name="share_amount")
	private double shareAmount;
	
	
	


}
