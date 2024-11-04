package modulo_11;

import java.util.Collection;
import java.util.Queue;
import java.util.Stack;

public class Remover_Fila_Pilha {
	public static void remover(Collection<String> colecao) {
		if(colecao instanceof Queue) {
			((Queue<String>)colecao).poll();
		}if(colecao instanceof Stack) {
			((Stack<String>)colecao).pop();
		}
	}
}
