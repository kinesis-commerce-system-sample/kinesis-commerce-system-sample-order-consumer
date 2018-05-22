package com.example.kinesiscommercesystemsample.order.consumer.infrastracture.dao.itemorder;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface ItemOrderDao {

	@Insert
	int insert(ItemOrderEntity itemOrderEntity);

	@Update(excludeNull = true)
	int update(ItemOrderEntity itemOrderEntity);
}
