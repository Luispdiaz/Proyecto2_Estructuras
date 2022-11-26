/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_pcr;

/**
 *
 * @author Luisp
 */
public class Pila {
    
    private NodoPila pCima;

    public Pila() {
        this.pCima = null;
    }

    public NodoPila getpCima() {
        return pCima;
    }

    public void setpCima(NodoPila pCima) {
        this.pCima = pCima;
    }
    
    public boolean esVacia(){
        return pCima == null;
    }
    
    public void apilar(NodoArbol valor){
        NodoPila nuevo = new NodoPila(valor);
        if (esVacia()) {
            pCima = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setpNext(pCima);
            pCima = nuevo;
        }
    } 
    
    public NodoPila desapilar(){
        if (!esVacia()) {
            NodoPila aux = pCima;
            pCima = pCima.getpNext();
            return aux;
        }
        return null;
    }
    
}
