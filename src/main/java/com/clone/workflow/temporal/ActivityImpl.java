package com.clone.workflow.temporal;

import com.clone.workflow.client.RouteInfoRestClient;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class ActivityImpl implements Activity {
	@Autowired
	private RouteInfoRestClient routeInfoRestClient;

	@Override
	public void placeOrder(String source, String destination)  {

		var routeInfoMono = routeInfoRestClient.retrieveRouteInfo(source, destination);

		routeInfoMono.subscribe(name->{
			System.out.println("Name is " + name);
		});

		//container availablity




		System.out.println("***** Order has been placed");
	}

	@Override
	public void setOrderAccepted() {
		System.out.println("***** Restaurant has accepted your order");
	}

	@Override
	public void setOrderPickedUp() {
		System.out.println("***** Order has been picked up");
	}

	@Override
	public void setOrderDelivered() {
		System.out.println("***** Order Delivered");
	}

}
