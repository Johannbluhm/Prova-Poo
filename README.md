1.	Uma das categorias de jogos mais populares é a de RPG e um dos principais exemplos desses jogos é a série Final Fantasy, no qual um grupo de heróis tenta salvar o mundo do mal. Nesse jogo cada herói possui um nome, uma classe (espadachim, mago ou sacerdote), sexo, energia de vida e energia mágica. A energia de vida (HP) de todos os heróis é inicializada com o valor de 999, enquanto a energia mágica (MP) é iniciada com o valor 99. Esse herói possui um ataque físico e uma magia. Para a classe Espadachim, cada ataque físico retorna um dano de 150 (+ a potência de sua arma), enquanto cada magia retorna um dano de 500, mas só pode ser utilizada três vezes. Já a classe Mago possui um ataque físico capaz de retornar um dano de 50 e uma magia capaz de retornar 300 + a potência de sua arma. Por fim, a classe Sacerdote não pode atacar e só possui duas magias: uma para recuperar 33 MP de qualquer herói, incluindo ele mesmo, e outra para recuperar 200 HP (+ a potência de sua arma) de qualquer herói, incluindo ele mesmo, ao custo de 33 MP. Já o adversário, um monstro poderoso, possui energia de vida igual a 9999. Seu ataque físico e magia geram um dano de 350 e 400, respectivamente.
Baseado no cenário acima, implemente:
a.	Uma classe principal que represente um Personagem deste jogo e as subclasses que representam os Heróis e os Adversários, com seus respectivos atributos e métodos.
b.	Crie uma classe Arma que possui o atributo potência.
c.	Instancie 3 heróis e um adversário e teste os métodos de cada um deles. OBS: Os heróis não podem lutar sem armas.
