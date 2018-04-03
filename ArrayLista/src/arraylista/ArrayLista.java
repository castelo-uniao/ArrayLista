package arraylista;
import java.util.ArrayList;
/* Estruturas de array (unidimensional ou multidimensional) possuem limitações para inserir e/ou remover
 * elementos.
 * ArrayList permite liberdade com arrays no referente a adicionar, remover, recuperar e pesquisar elementos
 * do array.
 */
public class ArrayLista {
	public static void main(String[] args) {
		ArrayList <String> alunos = new ArrayList <String>();
		// A especificação do tipo de dado se dá entre <>, após ArrayList
		
		// Podemos adicionar elementos ao ArrayList por meio do método "add"
		alunos.add("Douglas"); // alunos.add (0, "Douglas");
		alunos.add("Felipe");
		alunos.add("Glaucio");
		alunos.add("Isabella");
		alunos.add("João");
		
		// Remover determinado elemento
		alunos.remove("Douglas");
		
		// Verificar a existência: .contains
		System.out.println("Existe aluno Douglas? " + alunos.contains("Douglas"));
		System.out.println("Existe aluno Felipe? " + alunos.contains("Felipe"));
		
		// Exibir todo o array
		System.out.println("Array alunos: " + alunos.toString());
		// Exibir o tamanho do array
		System.out.println("Tamanho do array aluno: " + alunos.size());
		// Recuperar elemento pelo índice
		System.out.println("Aluno no índice 0: " + alunos.get(0));
		// Recuperar o índice de determinado elemento
		System.out.println("Índice do aluno Gláucio: " + alunos.indexOf("Glaucio"));
	}
}
