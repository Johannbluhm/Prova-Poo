package ff;

public class Pessoa {
	
	//atributos
	private String sexo, nome;
	Arma arma;
	
	
	private int hp,mp,pot;
	
	
	public Pessoa(String sexo, Arma arma, String nome, int hp, int mp, int pot) {
		super();
		this.sexo = sexo;
		this.arma = arma;
		this.nome = nome;
		this.hp = hp;
		this.mp = mp;
		this.pot = pot;
	}
	//get & set
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getPot() {
		return pot;
	}
	public void setPot(int pot) {
		this.pot = pot;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
}
