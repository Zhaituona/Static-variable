package StaticVariable;

public class TestDriveWay {

	public static void main(String[] args) {
		
		DriveWay zana = new DriveWay();
		zana.driveWaySize= 10;
		System.out.println(zana.getDriveWaySize());
		
		DriveWay elzat = new DriveWay();
		elzat.driveWaySize = 12;
		System.out.println(elzat.getDriveWaySize());
		
		System.out.println(zana.getDriveWaySize());

	}
	

}