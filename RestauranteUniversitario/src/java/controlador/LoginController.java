/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.LoginDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelBean.LoginBean;
import modelBean.UsuarioBean;

/**
 *
 * @author mathe
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("login");
        switch(acao){
            case "entrar":
                UsuarioBean usuario = this.buscarUsuario(request);
                this.redirecionarUsuario(usuario, request, response);
            break;
        }
        
        
        
    }
    
    private UsuarioBean buscarUsuario(HttpServletRequest request){
        String usuario = request.getParameter("login");
        String senha = request.getParameter("senha");
        LoginBean loginBean= new LoginBean();
        loginBean.setSenha(senha);
        loginBean.setUsuario(usuario);
        return LoginDAO.Search(loginBean);
    }
    
    private void redirecionarUsuario(UsuarioBean usuarioBean,HttpServletRequest request, HttpServletResponse response){
        if(usuarioBean!=null){
            request.setAttribute("usuario", usuarioBean);
            try {
                request.getRequestDispatcher("/paginaPrincipal.jsp").forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            request.setAttribute("usuarioInexistente", "Este usuário não possui um cadastro.");
            try {
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
