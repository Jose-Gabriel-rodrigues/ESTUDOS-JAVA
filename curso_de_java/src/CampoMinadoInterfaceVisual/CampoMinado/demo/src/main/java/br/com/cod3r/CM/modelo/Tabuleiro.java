package br.com.cod3r.CM.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.cod3r.CM.excecao.ExplosaoException;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream()
				.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
				.findFirst()
				.ifPresent(c -> c.abrir());
		} catch (ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}
	
	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while(minasArmadas < minas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	
	// Cabeçalho (números das colunas)
	sb.append("   ");
	for (int c = 0; c < colunas; c++) {
		sb.append(String.format(" %2d ", c));
	}
	sb.append("\n");
	
	int i = 0;
	
	for (int l = 0; l < linhas; l++) {
		// Número da linha
		sb.append(String.format("%2d ", l));
		
		for (int c = 0; c < colunas; c++) {
			
			String valor = campos.get(i).toString();

			// 🔥 Substituição por emojis
			if (valor.equals("x")) {
				valor = "🚩";
			} else if (valor.equals("*")) {
				valor = "💣";
			} else if (valor.equals("?")) {
				valor = "❓";
			} else if (valor.equals(" ")) {
				valor = "⬜";
			}

			sb.append(String.format(" %2s ", valor));
			i++;
		}
		sb.append("\n");
	}
	
	return sb.toString();
}
	}

