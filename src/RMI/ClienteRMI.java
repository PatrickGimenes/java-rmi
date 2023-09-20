/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
import java.rmi.Naming;

/**
 *
 * @author Patrick Gimenes
 */
public class ClienteRMI {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/Pessoa";
            ServicoPessoa servicoPessoa = (ServicoPessoa) Naming.lookup(url);

            servicoPessoa.salvar("Lucas", 40, "558215478", "15/08/2023");
            System.out.println("Pessoa salv no banco!");
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
