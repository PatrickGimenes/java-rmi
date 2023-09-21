/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//import javarmi.PessoaDAO;
//import javarmi.Pessoa;

/**
 *
 * @author Patrick Gimenes
 */
public class ServicoPessoaImpl extends UnicastRemoteObject implements ServicoPessoa {

    public ServicoPessoaImpl() throws RemoteException {
        super();
    }

    @Override
    public void salvar(String name, int age, String phone, String date) throws RemoteException {
        Pessoa pessoa = new Pessoa(name, age, phone, date);
        System.out.println("Pessoa criada: " + name);
        PessoaDAO.salvar(pessoa);
    }
}
