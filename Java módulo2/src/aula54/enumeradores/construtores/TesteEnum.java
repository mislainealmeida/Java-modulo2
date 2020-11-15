package aula54.enumeradores.construtores;

public class TesteEnum {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.DOMINGO;
		DiaSemana dia1 = DiaSemana.SEGUNDA;
		
		
		System.out.println(dia.toString() + " - "+dia.getValor());
        System.out.println(dia.toString() + " - "+dia1.getValor());
       
        Data data = new Data(21, 9, 2020, DiaSemana.SEGUNDA);
        
        
	}

}
