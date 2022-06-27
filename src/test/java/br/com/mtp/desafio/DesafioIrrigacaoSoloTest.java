package br.com.mtp.desafio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesafioIrrigacaoSoloTest {

    @Test
    public void validarSoloFinoAbaixoDe60(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("fino", 59);
        assertEquals("Umindade do solo perigosamente baixa", resultado);

    }

    @Test
    public void validarSoloFinoMaiorMenor80(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("fino", 79);
        assertEquals("Irrigação a ser aplicada", resultado);
    }

    @Test
    public void validarSoloFino60(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("fino", 60);
        assertEquals("Irrigação a ser aplicada", resultado);
    }

    @Test
    public void validarSoloFino100(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("fino", 100);
        assertEquals("Irrigação não necessária", resultado);
    }

    @Test
    public void validarSoloFino80(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("fino", 100);
        assertEquals("Irrigação não necessária", resultado);
    }

    @Test
    public void validarSoloFinoMaiorQue100(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("fino", 101);
        assertEquals("Valor inválido", resultado);
    }

    @Test
    public void validarSoloMedioAbaixoDe70(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("medio", 69);
        assertEquals("Umindade do solo perigosamente baixa", resultado);
    }

    @Test
    public void validarSoloMedioMaiorMenor88(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("medio", 87);
        assertEquals("Irrigação a ser aplicada", resultado);
    }

    @Test
    public void validarSoloMedio70(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("medio", 70);
        assertEquals("Irrigação a ser aplicada", resultado);
    }

    @Test
    public void validarSoloMedio100(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("medio", 100);
        assertEquals("Irrigação não necessária", resultado);
    }

    @Test
    public void validarSoloMedio88(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("medio", 88);
        assertEquals("Irrigação não necessária", resultado);
    }

    @Test
    public void validarSoloMedioMaiorQue100(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("medio", 101);
        assertEquals("Valor inválido", resultado);
    }

    @Test
    public void validarSoloGrosseiroAbaixoDe80(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("grosseiro", 79);
        assertEquals("Umindade do solo perigosamente baixa", resultado);
    }

    @Test
    public void validarSoloGrosseiroMenor90(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("grosseiro", 89);
        assertEquals("Irrigação a ser aplicada", resultado);
    }

    @Test
    public void validarSoloGrosseiro80(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("grosseiro", 80);
        assertEquals("Irrigação a ser aplicada", resultado);
    }

    @Test
    @DisplayName("solo grosseiro e valor 100")
    public void validarSoloGrosseiro100(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("grosseiro", 100);
        assertEquals("Irrigação não necessária", resultado);
    }

    @Test
    @DisplayName("solo grosseiro e valor 90")
    public void validarSoloGrosseiro90(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("grosseiro", 90);
        assertEquals("Irrigação não necessária", resultado);
    }

    @Test
    @DisplayName("solo grosseiro e valor maior que 100")
    public void validarSoloGrosseiroMaiorQue100(){
        DesafioIrrigacaoSolo desafioIrrigacaoSolo = new DesafioIrrigacaoSolo();
        String resultado = desafioIrrigacaoSolo.irrigacao("grosseiro", 101);
        assertEquals("Valor inválido", resultado);
    }

}