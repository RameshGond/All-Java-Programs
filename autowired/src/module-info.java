module autowired {
	exports com.xworkz.spring.hospital.beans;
	exports com.xworz.springfw.autowired.annotation.hospital.association.beans;
	exports com.xworkz.spring.configuaration;
	exports com.xworkz.spring.vehicle.beans;
	exports com.xworkz.spring;

	requires lombok;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
}