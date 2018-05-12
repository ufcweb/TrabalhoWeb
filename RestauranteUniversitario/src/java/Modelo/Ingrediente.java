/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import modelBean.IngredienteBean;

/**
 *
 * @author mathe
 */
public class Ingrediente  {
    private int id;
    private String nomeComida;

    public Ingrediente(IngredienteBean ingrediente) {
        this.setNomeComida(ingrediente.getNome());
        this.setId(ingrediente.getId());
    }
    
    public static int a(){return 0;
}
    public static int a(int i){return 0;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public void setNomeComida(String nomeComida) {
        if(nomeComida != null){
           this.nomeComida = nomeComida; 
        }
    }  
}
