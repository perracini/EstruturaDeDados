package br.com.rafa.ed.filas;

import java.util.LinkedList;
import java.util.List;

public class FilaGenerica {

	private List<Object> objetos = new LinkedList<Object>();

	public void insere(Object objeto) {
		this.objetos.add(objeto);
	}

	public Object remove() {
		return this.objetos.remove(0);
	}

	public boolean vazia() {
		return this.objetos.size() == 0;
	}
}
