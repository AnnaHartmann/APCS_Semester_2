/**
 * This code is the cash register for the code.
 * It checks the amount of money in the register, on the person 
 * and how much the person is giving. I added cashInPocket to 
 * more easily create the algorithm in candy machine. This code
 * also makes sure that the user has money, isn't adding 0 dollars
 * or removing money from the cash register. 
 * 
 * 
 * @author Annabel Hartmann
 * @version 4/10/2018
 * 
 */
public class CashRegister {
	
    private int cashOnHand;
    
    public CashRegister() {
        cashOnHand = 500;
    }
    
    public CashRegister(int cashAmount) {
    	
        if(cashAmount > 0) {
            cashOnHand = cashAmount;
        } else {
            throw new IllegalArgumentException("This candy isn't free! So money you must have!");
        }
    }
    
    public void acceptAmount(int cashAmount) {
    	
        if(cashAmount > 0) {
            cashOnHand += cashAmount;
        } else {
            throw new IllegalArgumentException("How do you even add 0 dollars? Oh but you can't remove money either!");
        }
    }
    
    public int cashInPocket() {
        return cashOnHand;
    }
}