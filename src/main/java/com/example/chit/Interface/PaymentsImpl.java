package com.example.chit.Interface;

import java.util.List;

import com.example.chit.Entity.Payments;

public interface PaymentsImpl {

	Payments save(Payments request);

	Payments update(Payments payments);

	List<Payments> getUsersByChitItemsId(String id);

}
