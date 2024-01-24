
package com.example.chit.Service;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.chit.Entity.ChitItems;
import com.example.chit.Entity.ChitMaster;
import com.example.chit.Entity.ItemUsers;
import com.example.chit.Entity.User;
import com.example.chit.Interface.ItemUserImpl;
import com.example.chit.Repository.ChitItemRepository;
import com.example.chit.Repository.ChitMasterRepository;
import com.example.chit.Repository.ItemUserRepository;
import com.example.chit.Repository.UserRepository;
import com.example.chit.payloads.UserPayload;


@Service
public class ItemUserService implements ItemUserImpl {

	
	@Autowired
	public ItemUserRepository itemUserRepository;

	@Autowired
	public UserRepository userRepository;

	@Autowired
	public ChitMasterRepository chitMasterRepository;
	
	@Autowired
	public ChitItemRepository chitItemRepository;

	

	@Autowired
	public ItemUserService(ItemUserRepository iUserRepository , ChitItemRepository cItemRepository) {

		this.itemUserRepository = iUserRepository;
		this.chitItemRepository = cItemRepository;
	}

	@Override
	public ItemUsers save(UserPayload request) {

		User u = userRepository.findById(request.getUserId()).get();

		ChitMaster c = chitMasterRepository.findById(request.getChitId()).get();

		List<ItemUsers> itemuserslist = itemUserRepository.findByUserIdAndChitId(u.getId(), c.getId());

		List<ItemUsers> totalItemUsersForChit = getUsersByChitId(c.getId().toString());

		if (!(ObjectUtils.isEmpty(u) && ObjectUtils.isEmpty(c)) && itemuserslist.size() == 0
				&& Integer.parseInt(c.getDuration()) > totalItemUsersForChit.size()) {

			ItemUsers itemUsers = new ItemUsers();

			itemUsers.setUserId(u.getId());

			itemUsers.setChitId(c.getId());

			return itemUserRepository.save(itemUsers);
		}
		return null;
	} 

	public ItemUsers update(ItemUsers request) {

		ItemUsers iu = itemUserRepository.findById(request.getUserId()).get();

		 ChitItems ci = chitItemRepository.findById(request.getChitId()).get() ; 

		if (!( ObjectUtils.isEmpty(iu) && ObjectUtils.isEmpty(ci))){

			ItemUsers itemUsers = new ItemUsers();

			itemUsers.setId(request.getId());
			itemUsers.setUserId(iu.getUserId());

			itemUsers.setChitId(iu.getChitId());

			itemUsers.setStatus(true);

			itemUsers.setChitClaimDate(new Date());

			itemUsers
					.setClaimAmount(/* iu.getClaimAmount() */
					ci.getChitAmount() );

			return itemUserRepository.save(itemUsers);

		}
		return null;
	}

	@Override
	public List<ItemUsers> getUsersByChitId(String id) {

		return itemUserRepository.findByChitId(Long.valueOf(id));
	}

}
