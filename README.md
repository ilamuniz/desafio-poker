## Desafio Poker

Atividade do módulo Lógica de Programação I do curso de Automação de Testes do Santander Coders

O projeto terá obrigatoriamente duas classes:

    - Classe Carta, que possui um nome e um naipe.

    - Classe Baralho, que possui 52 cartas.

### Métodos da classe Baralho:

a) embaralha( ) – usando o método Math.random dá para trocar as cartas dentro do baralho, misturando-as (sorteie duas posições e troque-as. Repita este processo diversas vezes).

b) darCartas( ) – devolve duas cartas, retirada do topo do baralho, se não estiver vazio, ou null.

c) temCarta( ) – verifica se tem carta no baralho, devolvendo true ou false. A classe Baralho, assim construída, será útil para programar diversos jogos de cartas, através de novas classes que os implementem.

d) imprimeBaralho( ) – imprime as cartas para verificar como estão dispostas (se estão embaralhadas por exemplo).

### Funcionamento:

No inicio do programa, pergunte quantas jogadores possui na mesa, retorne duas cartas aleatórias para cada jogador.

Após isso, pergunte para cada jogador se ele quer abandonar a mão ou apostar, se apostar quanto ele aposta, repita esse processo até todos apostarem a mesma quantia.

Toda vez q alguém abandonar, reimprimir as mãos dos jogadores restante sem a mão do jogador que abandonou, (o dinheiro q ele já tiver apostado, deve continuar no montante).

Assim, que todos os jogadores tiverem apostado a mesma quantia, imprima mais 5 cartas e pergunte quem ganhou.

Imprimir o número do jogador e quanto reais ele levou (soma de todas as apostas).

Adicione um bloco try/catch para validar se o número de participantes é maior do que um, se for igual ou menor, deve lançar uma exception e ser pega pelo try/catch.
