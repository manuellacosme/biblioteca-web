package service;

import model.Livro;
import repository.LivroRepository;

public class LivroService {

    private LivroRepository repository = new LivroRepository();

    public void cadastrarLivro(Livro livro) {

        if (livro.getTitulo() == null || livro.getTitulo().isEmpty()) {
            throw new IllegalArgumentException("Título obrigatório");
        }

        if (livro.getQuantidade() < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        repository.salvar(livro);
    }
}