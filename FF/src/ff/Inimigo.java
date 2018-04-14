package ff;

public class Inimigo extends Pessoa   {
	
	
	
	
	
	public Inimigo(String sexo, Arma arma, String nome, int hp, int mp, int pot) {
		super(sexo, arma, nome, hp, mp, pot);
		// TODO Auto-generated constructor stub
	}
	//metodos
	public void atakf(Pessoa alvo){
		int hpAtualDoAlvo = alvo.getHp();
		alvo.setHp(alvo.getHp()-350);
		System.out.println("Ataque realizado com sucesso");
	}
	public void atakm(Pessoa alvo){
		int hpAtualDoAlvo = alvo.getHp();
		alvo.setHp(alvo.getHp()-400);
		System.out.println("Ataque realizado com sucesso");
	}
	public void imprimir() {
		System.out.println("A vida atual é: "+ this.getHp());
		
	}
	
	public void atacarespadachim() {
		
	}
	
}
