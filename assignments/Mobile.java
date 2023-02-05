package week1.day1.assignments;

public class Mobile {
	public void makecall() {
		String mobileModel= "Samsung";
		float mobileWeight=155.2f;
		System.out.println("Mobile Model: "+mobileModel);
		System.out.println("Weight of the mobile: "+mobileWeight);
	}

	public void sendSms() {
		
		boolean isCharged=true;
		int mobileCost=13999;
		System.out.println("Is Mobile Charged: "+isCharged);
		System.out.println("Cost of the mobile: "+mobileCost);
	}
	public static void main (String[] args) {
		
		Mobile call=new Mobile();
		System.out.println("Prasanth's Mobile");
		call.makecall();
		call.sendSms();
	}
	
	
}
