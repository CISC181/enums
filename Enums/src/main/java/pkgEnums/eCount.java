package pkgEnums;

public enum eCount {

	FirstCard(10), SecondCard(20), ThirdCard(30), FourthCard(40), FifthCard(50);
	
	private eCount(final int CardNo){
		this.CardNo = CardNo;
	}

	private int CardNo;
	
	public int getCardNo(){
		return CardNo;
	}

}
