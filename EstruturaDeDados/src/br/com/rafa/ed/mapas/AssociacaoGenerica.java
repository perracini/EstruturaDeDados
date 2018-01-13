package br.com.rafa.ed.mapas;

public class AssociacaoGenerica<C, V> {
	  private C chave;
	  private V valor;

	  public AssociacaoGenerica(C chave, V valor) {
	    this.chave = chave;
	    this.valor = valor;
	  }

	  public C getChave() {
	    return chave;
	  }

	  public V getValor() {
	    return valor;
	  }

	  @Override
	  public String toString() {
	    return "{" + this.chave + " -> " + this.valor + "}";
	  }
	}

