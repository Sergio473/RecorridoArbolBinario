/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvbinarios;

/**
 *
 * @author vicsa
 */
public class NodoArbol {
    private int Numero;
    private NodoArbol izq;
    private NodoArbol der;

    public void creaNodo(int Numero){
        this.Numero= Numero;
        izq = null;
        der = null;
    }

    public int getNumero() {
        return Numero;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
}
