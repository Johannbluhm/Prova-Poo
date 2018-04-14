package ff;

public class Mago extends Pessoa{

	
	//metodos
	
	

	public Mago(String sexo, Arma arma, String nome, int hp, int mp, int pot) {
		super(sexo, arma, nome, hp, mp, pot);
		// TODO Auto-generated constructor stub
	}

	public void Atakf(Pessoa alvo){
		int hpAtualDoAlvo = alvo.getHp();
		alvo.setHp(hpAtualDoAlvo-50-this.getPot());
		System.out.println("Ataque realizado com sucesso");
}	
	public void Atakm(Pessoa alvo){
		int hpAtualDoAlvo = alvo.getHp();
		alvo.setHp(hpAtualDoAlvo-300+this.getArma().getPot());
		System.out.println("Ataque realizado com sucesso");
	}
	public void imprimir() {
		System.out.println("A vida atual é: "+ this.getHp());
		
	}
}
