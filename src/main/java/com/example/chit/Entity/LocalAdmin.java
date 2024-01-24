package com.example.chit.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "local_admin")
public class LocalAdmin {
 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name="address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "chitmaster_id")
	private Long chitMasterId;
	
	@Column(name = "payments_id")
	private Long paymentsId;
	
	@Column(name = "chititems_id")
	private Long chitItemsId;
	
	@Column(name = "itemusers_id")
	private Long itemUsersId ;
	
}
