package week4.day1HomeAssignments1B;

public class JavaConnection extends MySqlConnection{
	//created concrete class javaconnection and extends the mysqlconnection abstract class.
	//also this will implements the databaseconnection interface

	public static void main(String[] args) {
		
		JavaConnection jc= new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();

	}

	@Override
	public void connect() {
		// printing connect method
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		// printing Disconnect method
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		// printing executeupdate method
		System.out.println("ExecuteUpdate");
		
	}

}
