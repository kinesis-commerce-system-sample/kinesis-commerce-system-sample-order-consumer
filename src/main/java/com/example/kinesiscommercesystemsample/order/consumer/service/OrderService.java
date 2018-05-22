package com.example.kinesiscommercesystemsample.order.consumer.service;

import com.example.kinesiscommercesystemsample.order.consumer.infrastracture.dao.itemorder.ItemOrderDao;
import com.example.kinesiscommercesystemsample.order.consumer.infrastracture.dao.itemorder.ItemOrderEntity;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Throwable.class)
public class OrderService {

	@Autowired
	private ItemOrderDao itemOrderDao;

	public void regist(String orderId, String itemId, Integer quantity) {

		val orderEntity = new ItemOrderEntity();
		orderEntity.setId(orderId);
		orderEntity.setItemId(itemId);
		orderEntity.setQuantity(quantity);
		orderEntity.setStatus("regist");
		itemOrderDao.insert(orderEntity);
	}

	public void changeStatus(String orderId, String status) {

		val orderEntity = new ItemOrderEntity();
		orderEntity.setId(orderId);
		orderEntity.setStatus(status);
		itemOrderDao.update(orderEntity);
	}
}
