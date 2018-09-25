package StaticVariable;

public class TestIphone {

	public static void main(String[] args) {
		
		Iphone zaytuna = new Iphone();
		
		zaytuna.iphoneName = "Iphone 6 plus";
		
		System.out.println(zaytuna.getIphoneName());
		
		Iphone elzat = new Iphone();
		elzat.iphoneName = "Iphone 8";
		
		System.out.println(elzat.getIphoneName());
		System.out.println(zaytuna.getIphoneName());

	}
}
