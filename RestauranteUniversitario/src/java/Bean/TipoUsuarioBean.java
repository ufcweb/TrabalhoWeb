/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Helper.Administrador;
import Helper.Cliente;
import Helper.Nutricionista;
import Helper.Vendedor;

/**
 *
 * @author mathe
 */
public class TipoUsuarioBean {
    private int id;
    private Integer nivelAcesso;
    private Double precoCredito;
    private Cliente permissoesCliente;
    private Nutricionista permissoesNutricionista;
    private Administrador permissoesAdministrador;
    private Vendedor permissoesVendedor;

    public TipoUsuarioBean() {
    }

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(Integer nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public Double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(Double precoCredito) {
        this.precoCredito = precoCredito;
    }

    public Cliente getPermissoesCliente() {
        return permissoesCliente;
    }

    public void setPermissoesCliente(Cliente permissoesCliente) {
        this.permissoesCliente = permissoesCliente;
    }

    public Nutricionista getPermissoesNutricionista() {
        return permissoesNutricionista;
    }

    public void setPermissoesNutricionista(Nutricionista permissoesNutricionista) {
        this.permissoesNutricionista = permissoesNutricionista;
    }

    public Administrador getPermissoesAdministrador() {
        return permissoesAdministrador;
    }

    public void setPermissoesAdministrador(Administrador permissoesAdministrador) {
        this.permissoesAdministrador = permissoesAdministrador;
    }

    public Vendedor getPermissoesVendedor() {
        return permissoesVendedor;
    }

    public void setPermissoesVendedor(Vendedor permissoesVendedor) {
        this.permissoesVendedor = permissoesVendedor;
    }

    public int getId() {
       return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
            
}
