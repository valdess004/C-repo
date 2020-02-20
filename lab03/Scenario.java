/**
 * The main method of this class plays out a scenario...
 * Jack has two cans of soda,
 * RootBeer and GingerAle, Jill also has two cans, Cherry and Grape.
 * Jack opens his RootBeer first, and gives it to Jill.
 * Jill completely drinks the RootBeer. Jack asks her if she is still
 * thirsty, Jill responds. Now Jill opens her Cherry soda and drinks it until
 * she is satisfied, then gives it to Jack. He takes a sip, but doesn't
 * like it. Jill checks how much is left in her Cherry soda, but decides
 * not to drink any more. Jack asks Jill if he can try her Grape soda.
 * Jack drinks about half of it, then stops and tells Jill how he now feels.
 * Finally, they check the amount available in all of the cans.
 */
public class Scenario {

	public static void main(String [] args){

		Person p1 = new Person("Jack");
		Person p2 = new Person("Jill");
		
		SodaCan s1 = new SodaCan("RootBeer");
		SodaCan s2 = new SodaCan("Gingerale");
		
		SodaCan s3 = new SodaCan("Cherry");
		SodaCan s4 = new SodaCan("Grape");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(s4);


		System.out.println(p1);
		System.out.println("I have a RootBeer and Gingerale");
		System.out.println(p2);
		System.out.println("I have a Cherry and Grape pop");
								
		System.out.println("Jack opens RootBeer");
		s1.open();
		System.out.println("Jack gives the RootBeer to Jill");
		
		for(int i = 5;i>=0;i--){
			p2.gulpFrom(s1);
		}
		
		System.out.println("Would you like another soda Jill");
		System.out.print("I am ");
		System.out.println(p2.getThirstStatus());
		System.out.println("I'll drink some of my Cherry Soda");
		s3.open();

		for(int j = 13;j >= 1;j--){
                        p2.sipFrom(s3);	
		}
		
		System.out.println("I am now satisfied. Here Jack have a sip.");
		p1.sipFrom(s3);
		System.out.println("I dont like this Jill");		
		System.out.println("Ok Jack, let me check how much is left");
		System.out.println(s3);
		
		System.out.println("Can I try the Grape soda Jill?");
		System.out.println("Sure Jack");
		s4.open();

		for(int k = 13;k>=1;k--){
                        p1.sipFrom(s4);
		}
		
		System.out.println(" How do you feel Jack?");
		System.out.print("I am ");
		System.out.println(p1.getThirstStatus());
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
