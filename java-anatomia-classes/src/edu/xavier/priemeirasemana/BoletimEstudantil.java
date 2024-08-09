package edu.xavier.priemeirasemana

public class BoletimEstudantil {

    private String nome;
    private double[] notas;
    private int quantidadeNotas;

    // Construtor
    public BoletimEstudantil(String nome, int quantidadeNotas) {
        this.nome = nome;
        this.notas = new double[quantidadeNotas];
        this.quantidadeNotas = 0;
    }

    // Método para adicionar uma nota
    public void adicionarNota(double nota) {
        if (quantidadeNotas < notas.length) {
            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
        } else {
            System.out.println("Não é possível adicionar mais notas.");
        }
    }

    // Método para calcular a média
    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }
        return quantidadeNotas > 0 ? soma / quantidadeNotas : 0;
    }

    // Método para verificar se o aluno foi aprovado
    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    // Método para exibir o boletim
    public void exibirBoletim() {
        System.out.println("Nome: " + nome);
        System.out.print("Notas: ");
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        System.out.println("Média: " + calcularMedia());
        System.out.println(estaAprovado() ? "Status: Aprovado" : "Status: Reprovado");
    }

    public static void main(String[] args) {
        // Simulação de dados
        String nome = "Wellington Xavier";
        int quantidadeNotas = 4; 
        double[] notas = {7, 8.0, 8.0, 7}; 

        BoletimEstudantil boletim = new BoletimEstudantil(nome, quantidadeNotas);

        // Adiciona as notas simuladas
        for (double nota : notas) {
            boletim.adicionarNota(nota);
        }

        
        boletim.exibirBoletim();
    }
}
