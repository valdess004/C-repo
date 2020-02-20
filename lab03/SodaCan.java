/**
 * Capture a Can of Soda.
 * A Can of Soda has a type, amount (initially 250) and is initially closed.
 * Once opened, you can sip (take at most 10) or gulp (take at most 50) from
 * the can. Obviously, at all times, the amount of soda in the can is between 0 and 250.
 * An opened can can not be closed.
 */
public class SodaCan {

	/**
	 * Construct a new SodaCan of the specified type.
	 * The new can has 250 units in it, and is closed.
	 * @param t the type of soda, for example "RootBeer", "Coke", "Cherry"
	 */
	private int amount;
	private boolean isOpen;
	private String type;
	
	
        public SodaCan(String t){
		this.amount = 250;
		this.type = t;
		this.isOpen = false;
	}
	public void open(){
		this.isOpen = true;
	}
	public boolean isOpen(){
		return this.isOpen;
	}
	public int sip(){
		int tempSip;
		if (this.isOpen){
			if (this.amount >= 10){
				this.amount-= 10;
				return(10);
			}
			else{
				tempSip = this.amount;
				this.amount = 0;
				return(tempSip);
			}
		}
		else{
			return(0);
		}
		
	}
	
	public int gulp(){
        	int tempGulp;
                if (this.isOpen){
                       	if (this.amount >= 50){
                               	this.amount-= 50;
                               	return(50);
                       	}
                       	else{
                               	tempGulp = this.amount;
                               	this.amount = 0;
                               	return(tempGulp);
                       	}
                }
                else{
                       	return(0);
                }

        }
	public int getAmount(){
		return this.amount;
	}
	
	public String toString(){
		String openString = (this.isOpen)?"open":"closed";
		return this.type+" "+openString+" "+this.amount;
        }
}


