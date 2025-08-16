package conditionalStatements;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean coolieticket = true;
		boolean baashaticket = false;
		boolean balconyticket = false;
		boolean firstclass = true;
		if(coolieticket) {
			System.out.println("Book coolie ticket");
			if(balconyticket) {
				System.out.println("Go for Balcony coolie ticket");
			}
			else if(firstclass){
				System.out.println("Go for first class coolie ticket");
			}
		}
		else if (baashaticket) {
			System.out.println("Book Basha ticket");
			if(balconyticket) {
				System.out.println("Go for Balcony basha ticket");
			}
			else if(firstclass){
				System.out.println("Go for first class basha ticket");
			}
				
		}
		
		else {
			System.out.println("Go home and wautch movie in OTT");
		}

	}

}
