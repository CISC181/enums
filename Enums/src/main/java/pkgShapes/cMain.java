package pkgShapes;

import pkgEnums.eCount;

public class cMain {

	public static void main(String[] args) {

		SpinThroughEnums();
		
		Circle c = new Circle(eCount.FourthCard);

	}
	
	private static void SpinThroughEnums()
	{
		for (eCount item : eCount.values()) {
			System.out.print(item.name() + "\t");
			System.out.print(item.getCardNo() + "\t");
			System.out.println(item.ordinal()+ "\t");
		}
	}

}
