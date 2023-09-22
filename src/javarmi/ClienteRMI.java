/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Naming;

/**
 *
 * @author Patrick Gimenes
 */
public class ClienteRMI {

    public static void main(String[] args) {
        try {
            ServicoPessoa servicoPessoa = (ServicoPessoa) Naming.lookup("rmi://localhost:9013/Pessoa");

            servicoPessoa.salvar("Lucas", 40, "558215478", "15/08/2023");
            System.out.println("Pessoa salva no banco!");
        } catch (Exception e) {
            
            System.err.println("Erro no cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
