package com.example.jesusbom;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataDAO {
    public List<Produto> getProdutosPorLogin(String login) {
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT id, login, nome, valor FROM produtos WHERE login = ?";
        try (Connection connection = Dao.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, login);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String produtoLogin = resultSet.getString("login");
                    String nome = resultSet.getString("nome");
                    double valor = resultSet.getDouble("valor");
                    Produto produto = new Produto(id, produtoLogin, nome, valor);
                    produtos.add(produto);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

}