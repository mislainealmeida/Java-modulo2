package aula65.anotacoes;

public @interface anotacao {//posso criar uma anotacao
	String auto();
	int aulaNumero();
	String blog() default "http://loiane.com";
	String site() default "http://loiane.training";

}
