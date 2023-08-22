package Aula04;

public class exemploDeClasse {
	
	String nome;       //atributo
	float preco;       //atributo
	String descricao;  //atributo
	
	String mostraNomeProduto() {
		System.out.println("Nome do produto: " + nome);
		return nome;
	}
	float mostraPreco() {
		System.out.println("Preço do produto: " + preco);  
		return preco;
	}
	void mostraDescricao(){
		System.out.println("Descrição do produto: " + descricao);
	}
	
	
	public static void main(String[] args) {
		
		exemploDeClasse p1 = new exemploDeClasse();
		p1.nome = "Maca";
		p1.preco = 4.00f;
		p1.descricao = "Maça Fuji";
		
		p1.mostraNomeProduto();
		p1.mostraPreco();
		p1.mostraDescricao();
		
	}
}
