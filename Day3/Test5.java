interface olaCustomer{
	void bookCab();
	void findRide();
	void rentCab();
	void rateDriver();
	void scheduleCab();
	void cancelCab();
	void addMoneyToWallet();
	void raiseTicket();
	void signUp();
	void signIn();
}

interface olaDriver{
	void acceptBooking();
	void getCustomerLocation();
	void setAvailableStatus();
	void getMyCommision();
	void raiseMoneyTransferRequest();
	void callCustomer();
	void setUpYourVehical();
	void customerFeedback();
}

interface olaOwner{
	void getDriverRecords();
	void getReportByDriverID();
	void getReportByRegion();
	void getTotalRevenue();
	void addDriver();
	void removeDriver();
	void changeDriverStatus();
}

public class Test5 implements olaOwner,olaDriver,olaCustomer{

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Test5 obj = new Test5();
	olaCustomer cust = new Test5();
	
	olaDriver manoj = new Test5();
		
	}
	

}

@Override
public void bookCab() {
	// TODO Auto-generated method stub
	
}

@Override
public void findRide() {
	// TODO Auto-generated method stub
	
}

@Override
public void rentCab() {
	// TODO Auto-generated method stub
	
}

@Override
public void rateDriver() {
	// TODO Auto-generated method stub
	
}

@Override
public void scheduleCab() {
	// TODO Auto-generated method stub
	
}

@Override
public void cancelCab() {
	// TODO Auto-generated method stub
	
}

@Override
public void addMoneyToWallet() {
	// TODO Auto-generated method stub
	
}

@Override
public void raiseTicket() {
	// TODO Auto-generated method stub
	
}

@Override
public void signUp() {
	// TODO Auto-generated method stub
	
}

@Override
public void signIn() {
	// TODO Auto-generated method stub
	
}

@Override
public void acceptBooking() {
	// TODO Auto-generated method stub
	
}

@Override
public void getCustomerLocation() {
	// TODO Auto-generated method stub
	
}

@Override
public void setAvailableStatus() {
	// TODO Auto-generated method stub
	
}

@Override
public void getMyCommision() {
	// TODO Auto-generated method stub
	
}

@Override
public void raiseMoneyTransferRequest() {
	// TODO Auto-generated method stub
	
}

@Override
public void callCustomer() {
	// TODO Auto-generated method stub
	
}

@Override
public void setUpYourVehical() {
	// TODO Auto-generated method stub
	
}

@Override
public void customerFeedback() {
	// TODO Auto-generated method stub
	
}

@Override
public void getDriverRecords() {
	// TODO Auto-generated method stub
	
}

@Override
public void getReportByDriverID() {
	// TODO Auto-generated method stub
	
}

@Override
public void getReportByRegion() {
	// TODO Auto-generated method stub
	
}

@Override
public void getTotalRevenue() {
	// TODO Auto-generated method stub
	
}

@Override
public void addDriver() {
	// TODO Auto-generated method stub
	
}

@Override
public void removeDriver() {
	// TODO Auto-generated method stub
	
}

@Override
public void changeDriverStatus() {
	// TODO Auto-generated method stub
	
}
}
