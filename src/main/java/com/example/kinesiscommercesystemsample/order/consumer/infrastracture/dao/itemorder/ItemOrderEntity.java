package com.example.kinesiscommercesystemsample.order.consumer.infrastracture.dao.itemorder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Table(name = "item_order")
@Entity
@Getter
@Setter
@ToString
public class ItemOrderEntity {

	@Id
	private String id;

	private String itemId;

	private Integer quantity;

	private String status;
}
