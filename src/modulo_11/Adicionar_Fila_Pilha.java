package modulo_11;

import java.util.Collection;
import java.util.Queue;
import java.util.Stack;

public class Adicionar_Fila_Pilha {
	public static void adicionar(Collection<String> colecao, String nome) {		
		if (colecao instanceof Stack) {
			((Stack<String>)colecao).push(nome); //Convertendo a Collection para Stack para poder usar o push
		}if(colecao instanceof Queue) {
			((Queue<String>)colecao).add(nome);
		}
	}
}
