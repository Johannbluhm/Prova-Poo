package ff;

public class Sacerdote extends Pessoa {
	
	public Sacerdote(String sexo, Arma arma, String nome, int hp, int mp, int pot) {
		super(sexo, arma, nome, hp, mp, pot);
		// TODO Auto-generated constructor stub
	}
	
	
	//metodos
	public void atakm1(Pessoa alvo){
		int hpAtualDoAlvo = alvo.getHp();
		alvo.setHp(this.getHp()+30);
		System.out.println("Ataque realizado com sucesso");
	}
	public void atakm2(Pessoa alvo){
		int hpAtualDoAlvo = alvo.getHp();
		alvo.setHp(this.getHp()+200+this.getArma().getPot());
		this.setMp(getMp()-33);
		System.out.println("Ataque realizado com sucesso");
	}
	public void imprimir() {
		System.out.println("A vida atual é: "+ this.getHp());
		
	}
}
