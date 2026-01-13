package com.day2.trafficManager;

public class VehicleNode {
	String vehicleName;
	String Id;
	VehicleNode next;
	
	VehicleNode(String id,String vehicleName){
		this.Id=id;
		this.vehicleName=vehicleName;
		this.next=null;
	}

}
