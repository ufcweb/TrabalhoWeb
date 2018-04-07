/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author mathe
 */
public class Usuario {
    private String nome;
    private String email;
    private Long codIdentificador;
    private Double creditos;
    private Login login;
    private TipoUsuario tipoUsuario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome!=null) {
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Nome inválido");
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email!=null) {
            this.email = email;
        }else{
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public Long getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(Long codIdentificador) {
        if (codIdentificador!=null) {
            this.codIdentificador = codIdentificador;
        }else{
            throw new IllegalArgumentException("Identificador inválido");
        }
    }

    public Double getCreditos() {
        return creditos;
    }

    public void setCreditos(Double creditos) {
        if(creditos<0){
            throw new IllegalArgumentException("Créditos abaixo de zero");
        }else{
            this.creditos = creditos;
        } 
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        if (login!=null) {
            this.login = login;
        }else{
            throw new IllegalArgumentException("Login inválido");
        }
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        if (tipoUsuario!=null) {
           this.tipoUsuario = tipoUsuario; 
        }else{
            throw new IllegalArgumentException("Tipo de usuário inválido");
        }
        
    }
    
    public void cadastrarUsuario(Usuario usuario){
        //Salvar com classe DAO
    }
    
    public void cadastrarUsuario(List<Usuario> usuarios){
        for(Usuario usuario:usuarios){
            //salvar com classe DAO
        }
    }
    
    public Usuario deletarUsuario(Usuario usuario){
        return null;
    }
    
    public void editarUsuario(Usuario usuario){
        
    }
    
    
    
    
    
    
}
