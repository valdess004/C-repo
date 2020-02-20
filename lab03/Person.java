/**
 * Capture a person who can drink soda.
 * A person can sip or gulp from a can of soda. 
 * The person knows how much soda they have consumed,
 * and know how thirsty they are.
 */
public class Person {
	
	private String name;
	private String thirstStatus;	
	private int amountDrunk;
	
	public Person(String givenName){
		this.name = givenName;
		this.thirstStatus= "Very Thirsty";
		this.amountDrunk = 0;

	}
	
	public void sipFrom(SodaCan s){
		this.amountDrunk += s.sip();

	}	
	public void gulpFrom(SodaCan s){
		this.amountDrunk += s.gulp();
	}
	public String getThirstStatus(){
		if(this.amountDrunk < 175){
                        this.thirstStatus = "Very Thirsty";
                }
		else if(this.amountDrunk < 375){
                        this.thirstStatus = "Thirsty";
                }
		else{
			this.thirstStatus = "Satisfied";
		}
		return this.thirstStatus;
	}

	/**
	 * Construct a new Person with the given name.
	 * So far they will have consumed 0 soda
	 * @param name the name given to this person
	 */

	/**
	 * Take a sip from s, modifying the amount this has consumed
	 * @param s the can of soda this will gulp from
	 */

	/**
	 * Take a gulp from s, modifying the amount this has consumed
	 * @param s the can of soda this will gulp from
	 */

	/**
	 * A person is 
 	 * "very thirsty" if they drank less than 175,
 	 * "thirsty" if they drank less than 375, 
 	 * "satisfied" if they drank at least 375
	 * @return the thirst status of this
	 */


	/**
	 * @return a string representation of this
	 */
	public String toString(){
		return "I am "+this.name+", and I am "+this.getThirstStatus();
	}
}

