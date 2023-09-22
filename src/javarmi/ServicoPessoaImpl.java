/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;

/**
 *
 * @author Patrick Gimenes
 */
public class ServicoPessoaImpl extends UnicastRemoteObject implements ServicoPessoa {

    private static Connection conexao = null;

    public ServicoPessoaImpl() throws RemoteException, ClassNotFoundException {
        super();

        try {
            //Class.forName("sqlite-jdbc-3.43.0.0.jar");
            //Class.forName("jdbc:sqlite:pessoas.db"); // Certifique-se de carregar o driver
            //Class.forName("C:\\Users\\Patrick Gimenes\\Documents\\GitHub\\java-rmi\\sqlite-jdbc-3.43.0.0.jar");
            //String url = "jdbc:sqlite:C:\\Users\\Patrick Gimenes\\Documents\\GitHub\\java-rmi\\pessoas.db";
            //String url = "jdbc:sqlite::memory:";
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:pessoas.db";
            conexao = DriverManager.getConnection(url);

            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void salvar(String name, int age, String phone, String date) throws RemoteException {
        Pessoa pessoa = new Pessoa(name, age, phone, date);
        System.out.println("Pessoa criada: " + name);

        String sql = "INSERT INTO users (name, age, phone, date) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
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
}
