/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Modelo.InformacoesNutricionais;
import Modelo.Ingrediente;
import Modelo.OpcaoDiaria;
import Modelo.Relatorio;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mathe
 */
public class PermissaoNutricionista implements Nutricionista {

    @Override
    public Boolean montarCardapio(List<OpcaoDiaria> opcoesDiarias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Relatorio verRelatorioGeral(Date data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean criarOpcaoComida(String nome, String categoria, InformacoesNutricionais informacoesNutricionais, List<Ingrediente> ingredientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
