/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javarmi.Pessoa;

/**
 *
 * @author Patrick Gimenes
 */
public interface ServicoPessoa extends Remote {

    void salvar(String name, int age, String phone, String date) throws RemoteException;

}
