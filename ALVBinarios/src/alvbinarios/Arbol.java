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
public class Arbol {
    /*Atributo de la clase*/
    NodoArbol raiz;
    
    /*Métodos de la clase árbol*/
    public void iniciaArbol(){
        raiz= new NodoArbol();
        raiz = null;
    }
    public void setRaiz(NodoArbol hijo){
        raiz = hijo;
    }
    public NodoArbol getRaiz(){
        return raiz;
    }
    /*public void amplitud(NodoArbol raiz){
        Cola cola,colaAux;
        NodoArbol aux;
        
        if (raiz!=null) {
            cola=new Cola();
            colaAux=new Cola();
            cola.push(raiz);
            
            while(cola.colaVacia()!=1){
                colaAux.push(aux=cola.pop);
                if(aux.getIzq()!=null){
                cola.push(aux.getIzq());
                }
            if (aux.getDer()!=null) {
                cola.push(aux.getDer());
            }
            }
            colaAux.print();
        }
    }*/
    
    /*Este método inserta los nodos del árbol de manera recursiva*/
    public NodoArbol insertaArbol(NodoArbol nuevo, NodoArbol raiz){
        /*esto es el caso base que va a detener la recursividad*/
        if(raiz==null)
            raiz=nuevo;
        else{
            /*Casos recursivos*/
            if(nuevo.getNumero()<=raiz.getNumero()){
            /*esto es el caso base que va a detener la recursividad*/
                if(raiz.getIzq()==null){
                    raiz.setIzq(nuevo);
                }else{
                /*Casos recursivos*/
                    insertaArbol(nuevo, raiz.getIzq());
                }
            }else{
                if(nuevo.getNumero()>raiz.getNumero()){
                    if(raiz.getDer()==null){
                        raiz.setDer(nuevo);
                    }else{
                        insertaArbol(nuevo, raiz.getDer());
                    }
                }
            }
        }
        return raiz;
    } // cierra el metodo
    
    public void preOrden(NodoArbol raiz){
        /*Caso base que detendra la recursividad*/

        if(raiz==null){
            return;
        }else{
            System.out.println("El nodo es: "+raiz.getNumero());
            preOrden(raiz.getIzq());
            preOrden(raiz.getDer());
        }
    }
    public void intOrden(NodoArbol raiz){
        
        if(raiz==null){
            return;
        }else{
            intOrden(raiz.getIzq());
            System.out.println("El nodo es: "+raiz.getNumero());
            intOrden(raiz.getDer());
        }
    }
    public void postOrden(NodoArbol raiz){
        
        if(raiz==null){
            return;
        }else{
            postOrden(raiz.getIzq());
            postOrden(raiz.getDer());
            System.out.println("El nodo es "+ raiz.getNumero());
        }
    }
} //cierra la clase
