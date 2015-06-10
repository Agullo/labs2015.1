package centralP2CG;

import java.util.ArrayList;

/* 114111352 - Alexandre Gullo - LAB 05 - Turma 02 */

public class Jogo {

	private String nome;
	private double preco;
	private String estilosDoJogo;
	private int qntDeVezesJogadas = 0;
	private int qntDeVezesZerado = 0;
	private int pontuacaoMaxima = 0;
	private String tipoDeJogo;
	private ArrayList<Jogabilidade> Jogabilidade;

	/**
	 * 
	 * @param nome
	 *            , Nome do Jogo.
	 * @param preco
	 *            , Preco do Jogo.
	 * @throws Exception
	 */
	public Jogo(String nome, double preco) throws Exception {
		this.nome = nome;
		this.preco = preco;

		if (nome == "" || nome == null)
			throw new Exception("O nome nao pode ser nulo ou vazio. ");
		if (preco <= 0)
			throw new Exception("O preco do jogo tem que ser maior que zero. ");

	}

	public String getTipoDeJogo() {
		return tipoDeJogo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQntDeVezesJogadas() {
		return qntDeVezesJogadas;
	}

	public void setQntDeVezesJogadas(int qntDeVezesJogadas) {
		this.qntDeVezesJogadas = qntDeVezesJogadas;
	}

	public int getQntDeVezesZerado() {
		return qntDeVezesZerado;
	}

	public void setQntDeVezesZerado(int qntDeVezesZerado) {
		this.qntDeVezesZerado = qntDeVezesZerado;
	}

	public double getPontuacaoMaxima() {
		return pontuacaoMaxima;
	}

	public void setPontuacaoMaxima(int pontuacaoMaxima) {
		this.pontuacaoMaxima = pontuacaoMaxima;
	}

	// //////////////////////////////////////////////////////////////////////

	/**
	 * 
	 * @param pontuacaoAtingida
	 *            , Novo Score.
	 * @param zerado
	 *            , True se o jogo foi zerado, False se nao.
	 */
	public void joga(int pontuacaoAtingida, boolean zerado) {
		if (pontuacaoAtingida > pontuacaoMaxima)
			pontuacaoMaxima = pontuacaoAtingida;
		if (zerado = true)
			qntDeVezesZerado += 1;
	}

}
