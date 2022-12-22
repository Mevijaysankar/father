package oops;

public class father extends grandfather{
	public void car() {
		System.out.println("car");
		
	}
		public void bike() {
			System.out.println("bike");
			

		}
	
	
		public static void main(String[] args) {
			
			father obj = new father();
			obj.bike();
			obj.car();
		}
		
		}
