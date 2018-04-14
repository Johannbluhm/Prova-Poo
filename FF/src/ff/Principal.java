package ff;

public class Principal  {

	public static void main(String[] args) {
		Arma espada = new Arma();
		espada.setPot(50);
		Arma porrete = new Arma();
		porrete.setPot(50);
		Arma biblia = new Arma();
		biblia.setPot(50);
		Arma punho = new Arma();
		punho.setPot(0);
		Espadachim espadachim = new Espadachim("Indefinido",espada, "Heroi Generico 1", 999, 99, 50);
		Mago mago = new Mago("Masculino", porrete, "Pichula", 999, 99, 50);
		Sacerdote sacerdote = new Sacerdote( "Feminino",biblia,"Francy", 999, 99, 50);
		Inimigo inimigo = new Inimigo("",punho,"",9999,0,0);
		
		
		
		
		
		
		
		
	}

}
