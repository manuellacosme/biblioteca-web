package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Livro;
import util.Conexao;

public class LivroRepository {

    public void salvar(Livro livro) {

        String sql = "INSERT INTO livros (titulo, ano, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setInt(2, livro.getAno());
            stmt.setInt(3, livro.getQuantidade());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}