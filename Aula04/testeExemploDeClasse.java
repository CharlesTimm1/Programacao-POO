package Aula04;

public class testeExemploDeClasse {

	public static void main(String[] args) {
		
		exemploDeClasse p1 = new exemploDeClasse();
		p1.nome = "Maca";
		p1.preco = 4.00f;
		p1.descricao = "Maça Fuji";
		
		p1.mostraNomeProduto();
		System.out.println("Preço do produto: " + p1.mostraPreco());
		System.out.println("Nome do produto: " + p1.mostraNomeProduto());

	}

}
