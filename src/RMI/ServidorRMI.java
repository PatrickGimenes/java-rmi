/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author Patrick Gimenes
 */
public class ServidorRMI {
    public static void main(String[] args) {
        try {
            ServicoPessoa servicoPessoa = new ServicoPessoaImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("ServicoPessoa", servicoPessoa);
            System.out.println("Servidor RMI pronto...");
        } catch (Exception e) {
            System.err.println("Erro no servidor RMI: " + e.toString());
            e.printStackTrace();
        }
    }
}
