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
@Data
@Table(name = "payments")
public class Payments {
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "chitmaster_id")
	private Long chitMasterId;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "chititems_id")
	private Long chitItemsId;
	
	@Column(name = "date")
	private LocalDate date ;
	
	@Column(name = "due_amount")
	private Double dueAmount;
	
	@Column(name = "payment_status")
	private Boolean paymentStatus;

}
