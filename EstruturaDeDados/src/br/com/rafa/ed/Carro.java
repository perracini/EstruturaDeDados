package br.com.rafa.ed;

public class Carro {
	  private String nome;

	  public Carro(String nome) {
	    this.nome = nome;
	  }

	  public String getNome() {
	    return nome;
	  }

	  @Override
	  public String toString() {
	    return "Carro: " + this.nome;
	  }
	}
