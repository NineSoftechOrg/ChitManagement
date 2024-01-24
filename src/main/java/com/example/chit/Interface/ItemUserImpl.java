package com.example.chit.Interface;

import java.util.List;

import com.example.chit.Entity.ItemUsers;
import com.example.chit.payloads.UserPayload;

public interface ItemUserImpl {

	ItemUsers save(UserPayload request);

	ItemUsers update(ItemUsers itemUsers);

	List<ItemUsers> getUsersByChitId(String id);

}
