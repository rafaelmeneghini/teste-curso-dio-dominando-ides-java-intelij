package br.com.bio;

import br.com.bio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numpaginas;

    public Livro(String nome, Integer numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpaginas=" + numpaginas +
                '}';
    }
}