/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilersexamplec0;

import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class Tabla {
    
    private ArrayList<Simbolo> tablaSimbolos;
    private ArrayList<Tipo> tablaTipo;

    public Tabla() {
        tablaSimbolos = new ArrayList<Simbolo>();
        tablaTipo = new ArrayList<Tipo>();
        tablaTipo.add(new Tipo(0, "int"));
    }

    public ArrayList<Simbolo> getTablaSimbolos() {
        return tablaSimbolos;
    }

    public void setTablaSimbolos(ArrayList<Simbolo> tablaSimbolos) {
        this.tablaSimbolos = tablaSimbolos;
    }

    public ArrayList<Tipo> getTablaTipo() {
        return tablaTipo;
    }

    public void setTablaTipo(ArrayList<Tipo> tablaTipo) {
        this.tablaTipo = tablaTipo;
    }
    
    public boolean encontrarSimbolo(String id){
        for... busqueda
    }
    
    
}
