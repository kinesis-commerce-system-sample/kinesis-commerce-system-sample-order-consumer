package com.example.kinesiscommercesystemsample.order.consumer;

import com.example.kinesiscommercesystemsample.order.consumer.mom.order.OrderStreamReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ConsumerRunner implements CommandLineRunner {

	@Autowired
	private OrderStreamReader orderStreamReader;

	@Override
	public void run(String... args) throws Exception {

		try {

			orderStreamReader.run();

			log.info("batch end."); // 通常はここに来ない。

		} catch (Exception e) {

			log.error("error occured. exitCode=1.", e);

			System.exit(1);
		}

	}
}
