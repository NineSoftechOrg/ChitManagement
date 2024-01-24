package com.example.chit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.chit.Entity.ChitItems;
import com.example.chit.Entity.ChitMaster;
import com.example.chit.Entity.ItemUsers;
import com.example.chit.Entity.Payments;
import com.example.chit.Entity.User;
import com.example.chit.Interface.ChitItemsImpl;
import com.example.chit.Repository.ChitItemRepository;
import com.example.chit.Repository.ChitMasterRepository;
import com.example.chit.Repository.ItemUserRepository;
import com.example.chit.Repository.PaymentsRepository;
import com.example.chit.Repository.UserRepository;

@Service
public class ChitItemsService implements ChitItemsImpl {

	@Autowired
	public ChitItemRepository chitItemRepository;

	@Autowired
	public ItemUserRepository itemUserRepository;

	@Autowired
	public ChitMasterRepository chitMasterRepository;
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public PaymentsRepository paymentsRepository;

	@Override
	public ChitItems save(ChitItems chitItems) {

		ItemUserService ius = new ItemUserService(itemUserRepository , chitItemRepository);

		ItemUsers iuc = new ItemUsers();
		
		User userAdd= userRepository.findById(chitItems.getUserId()).get();

		ChitMaster cm = chitMasterRepository.findById(chitItems.getChitId()).get();

		iuc.setUserId(chitItems.getUserId());
		
	
		
		iuc.setChitId(chitItems.getChitId());

		iuc.setClaimAmount(chitItems.getChitAmount());

		ius.update(iuc);

		List<ItemUsers> xys = ius.getUsersByChitId((chitItems.getChitId()).toString());
		
	

		chitItems.setChitAmount(
				Double.toString(Double.parseDouble(cm.getAmount()) - Double.parseDouble(chitItems.getAuctionAmount())));

		chitItems.setShareAmount((Double.parseDouble(chitItems.getAuctionAmount()) / xys.size()));
		
		chitItems=  chitItemRepository.save(chitItems);
		if(! ObjectUtils.isEmpty(chitItems) && (cm.getDuration() == String.valueOf( chitItems.getUserId())) && Integer.parseInt(cm.getDuration())  == cm.getCurrentCycle()) {
			
		  cm.setCurrentCycle(cm.getCurrentCycle()+1);
			
			
			chitMasterRepository.save(cm);
		}
		
	for (int i = 0; i < xys.size(); i++) {
			
		    ItemUsers user = xys.get(i);
		    
		    Payments pay = new Payments();
		   
		   
		   pay.setChitItemsId(chitItems.getId());
		   pay.setChitMasterId(chitItems.getChitId());
		   pay.setDueAmount(chitItems.getShareAmount());
		   pay.setDate(chitItems.getAuctionDate());
		   pay.setPaymentStatus(false);
		   pay.setUserId(user.getId());
		   
		  paymentsRepository.save(pay)  ;
		    
		}
		
		
		return chitItems ;
	}

	/*
	 * @Override public ChitItems getAllUsersInChit(ChitItems chitItems) {
	 * 
	 * return chitItemRepository.getAllUsersInchit(chitItems); }
	 */


}
