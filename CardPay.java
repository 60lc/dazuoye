package subwaysystem;

public class CardPay extends Pay{
	public CardPay(double d) {
		this.distance = d;
	}
	
	/**
	 * count the fee of card payment
	 */
	protected double count() {
		if(this.distance >= 0 && this.distance <= 4) {
			this.fee = 2;
		}
		else if(this.distance >4&&this.distance <= 12) {
			this.fee = (int)distance/4+1;
		}
		else if(this.distance >12&&this.distance <= 24){
			this.fee = (int)distance/6+1;
		}
		else if(this.distance >24&&this.distance <= 40) {
			this.fee = (int)distance/8+1;
		}
		else if(this.distance >40&&this.distance <= 50) {
			this.fee = (int)distance/10+1;
		}
		else if(this.distance >50) {
			this.fee = (int)distance/20+1;
		}
		this.fee = 0.9*this.fee;
		return this.fee;
	}
}