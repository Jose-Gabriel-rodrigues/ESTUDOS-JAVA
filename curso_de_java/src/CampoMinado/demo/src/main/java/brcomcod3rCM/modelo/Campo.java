package brcomcod3rCM.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListDataEvent;

public class Campo {

private final int linha;
private final int coluna;

private boolean aberto = false;
private boolean minado = false;
private boolean marcado = false;

private List<Campo> vizinhos = new ArrayList<>();

public Campo (int linha,int coluna) {
    this.linha = linha;
    this.coluna = coluna;
}

public boolean adicionarVizinho(Campo vizinho){
    boolean linhaDiferente = linha != vizinho.linha;
    boolean colunaDiferente = coluna != vizinho.coluna;
    boolean diagonal = linhaDiferente && colunaDiferente ;

    int deltaLinha = Math.abs(linha-vizinho.linha);
    int deltacoluna = Math.abs(coluna-vizinho.coluna);
    int deltalGeral = deltacoluna + deltaLinha;
    if(deltalGeral == 1 && !diagonal) {
        vizinhos.add(vizinho);
        return true;
    }else if(deltalGeral == 2 && diagonal){
        vizinhos.add(vizinho);
        return true;
    }else{
        return false;
    }




}
}