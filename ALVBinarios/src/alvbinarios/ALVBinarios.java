/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvbinarios;

import java.util.Scanner;

/**
 *
 * @author vicsa
 */
public class ALVBinarios {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int op=0, numero=0;
        NodoArbol nuevo,n1 = null;
        Arbol raiz = new Arbol();
        
        /*Inicia el arbol*/
        raiz.iniciaArbol();
        /*Solicitar los datos para el arbol*/
        do{
            System.out.println("Menú de Operaciones con arboles binarios");
            System.out.println("              1.-Insertar               ");
            System.out.println("              2.-Recorrido PreOrden     ");
            System.out.println("              3.-Recorrido InOrden      ");
            System.out.println("              4.-Recorrido PosOrden     ");
            System.out.println("              5.-Salir                  ");
            op=leer.nextInt();
            switch(op){
                case 1: System.out.println("Dame un número positivo");
                numero = leer.nextInt();
                nuevo = new NodoArbol();
                nuevo.creaNodo(numero);
                n1 = raiz.insertaArbol(nuevo, n1);
                        break;
                case 2: 
                    raiz.preOrden(n1);
                    break;
                case 3:
                    raiz.intOrden(n1);
                    break;
                case 4:
                    raiz.postOrden(n1);
                    break;
                case 5: 
                 break;
            }
            }
            while(op!=5);
    }
}
