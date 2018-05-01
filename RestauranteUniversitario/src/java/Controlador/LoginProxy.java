/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ClassesDAO.LoginDAO;
import Modelo.Login;
import Modelo.Usuario;

/**
 *
 * @author mathe
 */
public class LoginProxy{
    
    private Usuario checarPermissoes(Login login){
        Usuario usuarioRecuperado = null;
        try {
            usuarioRecuperado = null;//LoginDAO.Search(0) IMPLEMENTAR PESQUISA COM LOGIN E SENHA
            if(usuarioRecuperado !=null){
                return usuarioRecuperado;
            }else{
                throw new NullPointerException("Usuário inexistente");
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return usuarioRecuperado;
    }
    
}
