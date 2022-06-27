package br.com.mtp.desafio;

import java.util.HashMap;
import java.util.Map;

public class DesafioIrrigacaoSolo {
    private Map<String, int[]> map;

    public DesafioIrrigacaoSolo() {
        map = new HashMap<>();
        int[] fino = {60,80};
        int[] medio = {70,88};
        int[] grosseiro = {80,90};
        map.put("fino", fino);
        map.put("medio", medio);
        map.put("grosseiro", grosseiro);

    }

    public String irrigacao(String tipoSolo, int umidade){

        String resultado = "Valor inválido";

        int[] valor = map.get(tipoSolo);
        if(umidade < valor[0]){
            return "Umindade do solo perigosamente baixa";
        }else if(umidade < valor[1]){
            return "Irrigação a ser aplicada";
        }else if(umidade > 100){
            return "Valor inválido";
        }
        else{
            return "Irrigação não necessária";
        }
    }



}
