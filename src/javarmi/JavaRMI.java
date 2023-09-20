/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import javarmi.DAO.PessoaDAO;

/**
 *
 * @author Patrick Gimenes
 */
public class JavaRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa pessoa = new Pessoa("Pedro", 30, "199854613", "25/08/1997");
        //PessoaDAO.salvar(pessoa);
        PessoaDAO.buscarUsuarioPorId(1);
        PessoaDAO.buscarUsuarioPorId(2);
    }

}
