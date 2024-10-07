package com.example.atividadeambiente;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    // Definição de campos de entrada e botões da interface
    public TextField entrada2;
    public TextField entrada1;

    @FXML
    private Button quickSortBtn;           // Botão para executar o QuickSort
    @FXML
    private Label resultadoQuickSort;      // Label para exibir o resultado do QuickSort
    @FXML
    private Button mdc;                    // Botão para o cálculo do MDC
    @FXML
    private Button fibonacci;              // Botão para calcular a sequência de Fibonacci
    @FXML
    private Button trocaVariaveis;         // Botão para trocar variáveis
    @FXML
    private Button contagem;               // Botão para contagem
    @FXML
    private Button somaDeNumeros;          // Botão para somar números
    @FXML
    private Button serieInfinita;          // Botão para série infinita
    @FXML
    private Button fatorial;               // Botão para cálculo de fatorial
    @FXML
    private Button inverterDigitos;        // Botão para inverter dígitos
    @FXML
    private Button numeroPrimo;            // Botão para verificar se o número é primo
    @FXML
    private Button caractereParaNumero;    // Botão para converter caractere para número
    @FXML
    private Button conversaoBase;          // Botão para conversão de base
    @FXML
    private Button voltar;                 // Botão para retornar ao menu principal
    @FXML
    private Button resultadoMdc;           // Botão para mostrar o resultado do MDC
    @FXML
    private Label resultadoMdc2;           // Label para exibir o resultado do MDC
    @FXML
    private Label labelIgual;              // Label que exibe o símbolo de igualdade
    @FXML
    private Button resultadoPrimo;         // Botão para mostrar o resultado de número primo
    @FXML
    private Button resultadoFibonacci;     // Botão para mostrar o resultado de Fibonacci

    // Método para executar o QuickSort
    @FXML
    protected void botaoQuickSort() {
        // Oculta todos os botões e exibe o botão "voltar"
        ocultarTodosBotoes();
        voltar.setVisible(true);
        resultadoMdc2.setVisible(true);

        // Executa o algoritmo QuickSort
        QuickSort quickSortAlgoritmo = new QuickSort();
        String resultado = quickSortAlgoritmo.executarQuickSort();

        // Exibe o resultado no rótulo
        resultadoMdc2.setText(resultado);
    }

    // Método para voltar ao menu principal
    @FXML
    protected void botaoVoltar() {
        // Exibe os botões novamente e limpa os campos e resultados
        exibirTodosBotoes();
        limparCampos();
    }

    // Método para executar o cálculo do MDC
    @FXML
    protected void botaoMdc() {
        ocultarTodosBotoes();
        labelIgual.setVisible(true);
        entrada1.setVisible(true);
        entrada2.setVisible(true);
        resultadoMdc.setVisible(true);
        resultadoMdc2.setVisible(true);
    }

    // Método para exibir o resultado do MDC
    @FXML
    protected void botaoResultadoMdc() {
        // Pega os números de entrada
        int num1 = Integer.parseInt(entrada1.getText());
        int num2 = Integer.parseInt(entrada2.getText());

        // Executa o cálculo do MDC
        Mdc mdcAlgoritmo = new Mdc();
        String resultado = mdcAlgoritmo.calcularMdc(num1, num2);

        // Exibe o resultado
        resultadoMdc2.setText(resultado);
        voltar.setVisible(true);
    }

    // Método para verificar se o número é primo
    @FXML
    protected void botaoPrimo() {
        ocultarTodosBotoes();
        entrada1.setVisible(true);
        resultadoPrimo.setVisible(true);
        resultadoMdc2.setVisible(true);
    }

    // Método para exibir o resultado do número primo
    @FXML
    protected void botaoResultadoPrimo() {
        // Pega o número de entrada
        int numero = Integer.parseInt(entrada1.getText());

        // Verifica se o número é primo
        NumeroPrimo primoAlgoritmo = new NumeroPrimo();
        String resultado = primoAlgoritmo.verificarPrimo(numero);

        // Exibe o resultado
        resultadoMdc2.setText(resultado);
        voltar.setVisible(true);
    }

    // Método para trocar os valores das variáveis
    @FXML
    protected void botaoTrocaDeVariaveis() {
        ocultarTodosBotoes();
        resultadoMdc2.setVisible(true);

        // Realiza a troca de variáveis
        TrocaDeVariaveis troca = new TrocaDeVariaveis();
        String resultado = troca.trocaDeValores();

        // Exibe o resultado
        resultadoMdc2.setText(resultado);
        voltar.setVisible(true);
    }

    // Método para calcular a sequência de Fibonacci
    @FXML
    protected void botaoFibonacci() {
        ocultarTodosBotoes();
        voltar.setVisible(true);
        resultadoFibonacci.setVisible(true);
        entrada1.setVisible(true);
        resultadoMdc2.setVisible(true);
    }

    // Método para exibir o resultado da sequência de Fibonacci
    @FXML
    protected void botaoResultadoFibonacci() {
        // Pega o número de termos
        int termos = Integer.parseInt(entrada1.getText());

        // Calcula a sequência de Fibonacci
        Fibonacci fibonacci = new Fibonacci();
        String resultado = fibonacci.sequenciaFibonacci(termos);

        // Exibe o resultado
        resultadoMdc2.setText(resultado);
    }

    @FXML


    // Função auxiliar para ocultar todos os botões
    private void ocultarTodosBotoes() {
        quickSortBtn.setVisible(false);
        mdc.setVisible(false);
        fibonacci.setVisible(false);
        trocaVariaveis.setVisible(false);
        contagem.setVisible(false);
        somaDeNumeros.setVisible(false);
        serieInfinita.setVisible(false);
        fatorial.setVisible(false);
        inverterDigitos.setVisible(false);
        numeroPrimo.setVisible(false);
        caractereParaNumero.setVisible(false);
        conversaoBase.setVisible(false);
    }

    // Função auxiliar para exibir todos os botões
    private void exibirTodosBotoes() {
        quickSortBtn.setVisible(true);
        mdc.setVisible(true);
        fibonacci.setVisible(true);
        trocaVariaveis.setVisible(true);
        contagem.setVisible(true);
        somaDeNumeros.setVisible(true);
        serieInfinita.setVisible(true);
        fatorial.setVisible(true);
        inverterDigitos.setVisible(true);
        numeroPrimo.setVisible(true);
        caractereParaNumero.setVisible(true);
        conversaoBase.setVisible(true);
        resultadoQuickSort.setText("");
    }

    // Função auxiliar para limpar os campos de entrada e resultados
    private void limparCampos() {
        entrada1.setVisible(false);
        entrada2.setVisible(false);
        labelIgual.setVisible(false);
        resultadoMdc2.setVisible(false);
        entrada1.setText("");
        entrada2.setText("");
        resultadoMdc2.setText("");
        resultadoPrimo.setVisible(false);
        resultadoFibonacci.setVisible(false);
    }
}
