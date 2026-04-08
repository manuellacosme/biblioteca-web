package main;

import model.Livro;
import service.LivroService;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setTitulo("Livro Teste");
        livro.setAno(2024);
        livro.setQuantidade(10);

        LivroService service = new LivroService();
        service.cadastrarLivro(livro);

        System.out.println("Funcionou!");
    }
}