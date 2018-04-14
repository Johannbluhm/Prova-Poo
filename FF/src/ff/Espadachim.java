package ff;

public class Espadachim extends Pessoa {
	
	
	
	public Espadachim(String sexo, Arma arma, String nome, int hp, int mp, int pot) {
		super(sexo, arma, nome, hp, mp, pot);
		// TODO Auto-generated constructor stub
	}

	int maxMagia;
	
	
	

	public int getMaxMagia() {
		return maxMagia;
	}

	public void setMaxMagia(int maxMagia) {
		this.maxMagia = maxMagia;
	}

	//metodos
	public void Atakf(Pessoa alvo){
		int hpAtualDoAlvo = alvo.getHp();
		alvo.setHp(alvo.getHp()-150-this.getArma().getPot());
		System.out.println("Ataque realizado com sucesso");
		
	}
	
	public void Atakm(Pessoa alvo, int pot){
		int hpAtualDoAlvo = alvo.getHp();
		if (this.getMp()<=0) {
			this.setMp(getMp()-33);
			alvo.setHp(getHp()-500);
		} else {
			System.out.println("Magia Insuficiente");

		}		
	
   }
	public void imprimir() {
		System.out.println("A vida atual é: "+ this.getHp());
		
	}
}

