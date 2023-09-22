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
public class ServidorRMI {
    
    public ServidorRMI() {
         try {
            ServicoPessoa servicoPessoa = new ServicoPessoaImpl();
            Naming.rebind("rmi://localhost:9013/Pessoa", servicoPessoa);
            
             System.out.println(ConexaoSQLite.conectar());
            System.out.println("Servidor RMI pronto...");
        } catch (Exception e) {
            System.err.println("Erro no servidor RMI: " + e.toString());
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
      new ServidorRMI();
    }
}
