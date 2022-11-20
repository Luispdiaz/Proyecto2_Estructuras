/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_pcr;

/**
 *
 * @author Luisp
 */
public class ArbolBinario {

    private NodoArbol pRoot;

    public ArbolBinario() {
        this.pRoot = null;
    }

    public NodoArbol getpRoot() {
        return pRoot;
    }

    public void setpRoot(NodoArbol pRoot) {
        this.pRoot = pRoot;
    }

    public NodoArbol Insertar(NodoArbol Padre, String info) {
        NodoArbol nuevo = new NodoArbol(info);
        if (Padre == null) {
            this.pRoot = nuevo;
        } else if (Padre.getpHijoIzquierdo() == null) {
            Padre.setpHijoIzquierdo(nuevo);
            nuevo.setpPadre(Padre);
        } else if (Padre.getpHijoDerecho() == null) {
            Padre.setpHijoDerecho(nuevo);
            nuevo.setpPadre(Padre);
        } else {
            System.out.println("No permite mas hijos");
            return null;
        }
        return nuevo;
    }

    public void ImprimirPreorden(NodoArbol padre) {
        System.out.println(padre.getInfo());
        if (padre.getpHijoIzquierdo() != null) {
            ImprimirPreorden(padre.getpHijoIzquierdo());
        }
        if (padre.getpHijoDerecho() != null) {
            ImprimirPreorden(padre.getpHijoDerecho());
        }
    }

    public void ImprimirInorden(NodoArbol padre) {
        if (padre.getpHijoIzquierdo() != null) {
            ImprimirInorden(padre.getpHijoIzquierdo());
        }
        System.out.println(padre.getInfo());
        if (padre.getpHijoDerecho() != null) {
            ImprimirInorden(padre.getpHijoDerecho());
        }
    }

    public void ImprimirPosorden(NodoArbol padre) {
        if (padre.getpHijoIzquierdo() != null) {
            ImprimirPosorden(padre.getpHijoIzquierdo());
            if (padre.getpHijoDerecho() != null) {
                ImprimirPosorden(padre.getpHijoDerecho());
            }
        }
        System.out.println(padre.getInfo());
    }

    public ArbolBinario ConvertirExpresion(String[] expresion){
    Pila PilaConversion = new Pila();
    for(int i=0; i!=expresion.length; i++){
    if("+".equals(expresion[i])||"/".equals(expresion[i])||"*".equals(expresion[i])||"-".equals(expresion[i])||"^".equals(expresion[i])){
    PilaConversion.desapilar();
    }
    else{
    NodoArbol nuevo = new NodoArbol(expresion[i]);
    PilaConversion.apilar(nuevo);
    }
    }
    return null;
    
    
    }
    
    
    
}
