package interfacesBasic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers = {new EmailLogger(), new FileLogger(), new DatabaseLogger(), new SmsLogger()}; 
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer customer1 = new Customer(1,"Evren","Rahimoglu");
		customerManager.add(customer1);
	}

}
