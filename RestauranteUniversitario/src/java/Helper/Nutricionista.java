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
import Modelo.RelatorioVendas;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mathe
 */
public interface Nutricionista {
    public Boolean montarCardapio(List<OpcaoDiaria> opcoesDiarias);
    public RelatorioVendas verRelatorioVendas(Date data);
    public Relatorio verRelatorioGeral(Date data);
    public Boolean criarOpcaoComida(String nome, String categoria, InformacoesNutricionais informacoesNutricionais,List<Ingrediente> ingredientes);
}