package com.example.chit.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "chitmaster")
@Data
public class ChitMaster {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "current_cycle")
	private int currentCycle = 0;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="cycle")
	private Cycle cycle;
		
		
	@Column(name = "status")
	private boolean  status = true;
	

}
