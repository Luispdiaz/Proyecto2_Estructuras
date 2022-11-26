/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_pcr;

/**
 *
 * @author Luisp
 */
public class NodoArbol {
    private String info;
    private NodoArbol pHijoIzquierdo;
    private NodoArbol pHijoDerecho;
    private NodoArbol pPadre;

    public NodoArbol(String info) {
        this.info = info;
        this.pHijoIzquierdo = null;
        this.pHijoDerecho = null;
        this.pPadre = null;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public NodoArbol getpHijoIzquierdo() {
        return pHijoIzquierdo;
    }

    public void setpHijoIzquierdo(NodoArbol pHijoIzquierdo) {
        this.pHijoIzquierdo = pHijoIzquierdo;
    }

    public NodoArbol getpHijoDerecho() {
        return pHijoDerecho;
    }

    public void setpHijoDerecho(NodoArbol pHijoDerecho) {
        this.pHijoDerecho = pHijoDerecho;
    }

    public NodoArbol getpPadre() {
        return pPadre;
    }

    public void setpPadre(NodoArbol pPadre) {
        this.pPadre = pPadre;
    }
    
    public boolean Eshoja(){
    return this.getpHijoIzquierdo() == null;
    }
    
    
}
