package week4.day1HomeAssignments2A_2B;

public class APIClient {
	
	//Creating overloading methods which as same method names and different arguments.
	public void sendRequest(String endpoint) {
		
		//printing the given data in main method
		System.out.println(endpoint);

	}
	
	public void sendRequest(String endpoint, String sendRequest, boolean requestStatus) {
		
		//printing the given data in main method
		System.out.println(endpoint);
		System.out.println(sendRequest);
		System.out.println(requestStatus);

	}

	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest("Endpoint first overloading method"); //Sending data to method which contains single argument
		api.sendRequest("Endpoint second method","SendRequest second method",false );
		//Sending data's to method which contains multiple arguments.
		
	}

}
