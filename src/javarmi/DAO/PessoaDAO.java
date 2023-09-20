/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javarmi.Pessoa;

/**
 *
 * @author Patrick Gimenes
 */
public class PessoaDAO {

    public static void salvar(Pessoa pessoa) {
        String sql = "INSERT INTO users (name, age, phone, date) VALUES (?, ?, ?, ?)";
        try (Connection conexao = ConexaoSQLite.conectar();
                PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, pessoa.getName());
            pstmt.setInt(2, pessoa.getAge());
            pstmt.setString(3, pessoa.getPhone());
            pstmt.setString(4, pessoa.getDate());
            pstmt.executeUpdate();
            System.out.println("Pessoa salva com sucesso!");
        } catch (SQLException e) {
            System.out.println("45");
            System.out.println(e.getMessage());
        }
    }

    public static void buscarUsuarioPorId(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (Connection conexao = ConexaoSQLite.conectar();
                PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet resultado = pstmt.executeQuery();

            while (resultado.next()) {
                int userId = resultado.getInt("id");
                String name = resultado.getString("name");
                int age = resultado.getInt("age");
                String phone = resultado.getString("phone");
                String date = resultado.getString("date");

                System.out.println("ID: " + userId);
                System.out.println("Nome: " + name);
                System.out.println("Idade: " + age);
                System.out.println("Telefone: " + phone);
                System.out.println("Data: " + date);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
