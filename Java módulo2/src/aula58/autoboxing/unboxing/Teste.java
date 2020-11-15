package aula58.autoboxing.unboxing;

public class Teste {

	public static void main(String[] args) {
		//autoboxing, somente a partir das versoes 5
		Short num7= 1;
		Byte num8= 10;
		Integer num9= 100;
		Long num10= 10000l;
		Float num11= 3.5f;
		Double num12= 3.555;
		Boolean flag2= true;
		Character b= 'b';
		
		//auto- unboxing
		int num13= num9; //num9.intValue();
		
		num9++;//autoboxing em expressões
		
		System.out.println(num9);
		
		//auto- unboxing do numero 9-> auto- boxing num 13/num9->num14
		Integer num14=num13/num9;
		
		
	}

}
