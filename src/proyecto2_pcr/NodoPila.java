/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_pcr;

/**
 *
 * @author Luisp
 */
public class NodoPila {
    private NodoArbol apuntadorArbol;
    private NodoPila pNext;

    public NodoPila(NodoArbol informacion) {
        this.apuntadorArbol = informacion;
        this.pNext = null;
    }

    public NodoArbol getApuntadorArbol() {
        return apuntadorArbol;
    }

    public void setApuntadorArbol(NodoArbol apuntadorArbol) {
        this.apuntadorArbol = apuntadorArbol;
    }

    public NodoPila getpNext() {
        return pNext;
    }

    public void setpNext(NodoPila pNext) {
        this.pNext = pNext;
    }
    
}
