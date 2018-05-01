/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Helper.Administrador;
import Helper.Cliente;
import Helper.Nutricionista;
import Helper.Vendedor;

/**
 *
 * @author mathe
 */
public class TipoUsuario {
    private int ID;
    private Integer nivelAcesso;
    private Double precoCredito;
    private Administrador permissaoAdministrador;
    private Cliente permissaoCliente;
    private Nutricionista permissaoNutricionista;
    private Vendedor permissaoVendedor;
    
    

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(Integer nivelAcesso) {
        if (nivelAcesso!=null) {
            this.nivelAcesso = nivelAcesso;
        }else{
            throw new IllegalArgumentException("Nível de acesso inválido");
        }
    }

    public Double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(Double precoCredito) {
        if (precoCredito!=null) {
            this.precoCredito = precoCredito;
        }else{
            throw new IllegalArgumentException("Preco de crédito inválido");
        }
        
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Administrador getPermissaoAdministrador() {
        return permissaoAdministrador;
    }

    public void setPermissaoAdministrador(Administrador permissaoAdministrador) {
        this.permissaoAdministrador = permissaoAdministrador;
    }

    public Cliente getPermissaoCliente() {
        return permissaoCliente;
    }

    public void setPermissaoCliente(Cliente permissaoCliente) {
        this.permissaoCliente = permissaoCliente;
    }

    public Nutricionista getPermissaoNutricionista() {
        return permissaoNutricionista;
    }

    public void setPermissaoNutricionista(Nutricionista permissaoNutricionista) {
        this.permissaoNutricionista = permissaoNutricionista;
    }

    public Vendedor getPermissaoVendedor() {
        return permissaoVendedor;
    }

    public void setPermissaoVendedor(Vendedor permissaoVendedor) {
        this.permissaoVendedor = permissaoVendedor;
    }
    

    @Override
    public String toString() {
        return "TipoUsuario{" + "ID=" + ID + ", nivelAcesso=" + nivelAcesso + ", precoCredito=" + precoCredito + '}';
    }
    
    
}
