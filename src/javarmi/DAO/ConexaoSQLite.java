/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Patrick Gimenes
 */
class ConexaoSQLite {
     private static Connection conexao;

    public static Connection conectar() {
        try {
            String url = "jdbc:sqlite:pessoas.db";
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conexao;
    }

    public static void desconectar() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Conexão fechada com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
