package matematica.calc;

import java.lang.reflect.Field;

public class Hack {
	public static void main(String args[]){
		X x = new X();
		try {
			Field f = x.getClass().getDeclaredField("meaningOfLife");
			f.setAccessible(true);
			System.out.println(f.get(x));
			System.out.println(x.getMeaningOfLife());
			f.set(x, 42);
			System.out.println(f.get(x));
			System.out.println(x.getMeaningOfLife());
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}	
}

class X{
	private int meaningOfLife = 41;

	public int getMeaningOfLife() {
		return meaningOfLife;
	}

	public void setMeaningOfLife(int meaningOfLife) {
		this.meaningOfLife = meaningOfLife;
	}
	
}