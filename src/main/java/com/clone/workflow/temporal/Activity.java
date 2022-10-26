package com.clone.workflow.temporal;

import com.clone.workflow.domain.Od3cpRequestInfo;
import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface Activity {

	@ActivityMethod
	void placeOrder(String source, String destination) ;

	@ActivityMethod
	void setOrderAccepted();

	@ActivityMethod
	void setOrderPickedUp();

	@ActivityMethod
	void setOrderDelivered();
}
