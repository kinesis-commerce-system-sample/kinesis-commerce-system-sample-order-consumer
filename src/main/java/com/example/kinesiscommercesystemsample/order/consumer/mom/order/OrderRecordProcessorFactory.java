package com.example.kinesiscommercesystemsample.order.consumer.mom.order;

import com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessor;
import com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorFactory;
import com.example.kinesiscommercesystemsample.common.messaging.order.mom.processor.AbstractOrderRecordProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderRecordProcessorFactory implements IRecordProcessorFactory {

	@Autowired
	AbstractOrderRecordProcessor orderRecordProcessor;

	@Override
	public IRecordProcessor createProcessor() {
		return orderRecordProcessor;
	}
}
