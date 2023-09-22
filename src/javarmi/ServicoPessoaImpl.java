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

            String url = "jdbc:sqlite:pessoas.db";
            conexao = DriverManager.getConnection(url);

            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void salvar(String name, int age, String phone, String date) throws RemoteException {

        String sql = "INSERT INTO users (name, age, phone, date) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, phone);
            pstmt.setString(4, date);
            pstmt.executeUpdate();
            System.out.println("Dados salvos com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
