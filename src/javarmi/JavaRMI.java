/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




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
        Pessoa pessoa = new Pessoa("caio", 30, "dsa", "25/08/1990");
        PessoaDAO.salvar(pessoa);
        PessoaDAO.buscarUsuarioPorId(1);

        PessoaDAO.buscarUsuarioPorId(4);
    }

}
