package Unidad6;

import java.util.Arrays;

public class BúsquedaPorfuncionesDeHASH {

    String[] arreglo;
    int tam;
    int count;
    
    public BúsquedaPorfuncionesDeHASH(int tam){
        this.tam = tam;
        this.arreglo = new String[tam];
        Arrays.fill(this.arreglo, "-1");
    }
    
    
    public void fucionHash(String[] cadenaArreglo, String[] Arreglo){
        for(int i = 0; i <  cadenaArreglo.length; i++){
            String Elemento =  cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(Elemento) % arreglo.length;
            while(cadenaArreglo[indiceArreglo] != "-1"){
                indiceArreglo++;
            }
            arreglo[indiceArreglo] = Elemento;
        }
    }
    
    
    
    private boolean buscarClave(String buscar, String[] vector){
        int indiceArreglo = Integer.parseInt(buscar) % (vector.length-1);
        int count = 0;
        while(this.arreglo[indiceArreglo] != "-1"){
            if(this.arreglo[indiceArreglo] == buscar){
                return true;
            }
            indiceArreglo++;
            indiceArreglo %= this.tam;
            count++;
            if(count > vector.length -1){
                break;
            }
        }
        return false;
    }
    
    public boolean BusquedaNumero(int[] vector,int buscar){
        BúsquedaPorfuncionesDeHASH nuevo = new BúsquedaPorfuncionesDeHASH(vector.length);
        String[] Elementos = new String[vector.length];
        
        for(int i = 0; i < vector.length;i++){
            Elementos[i] = vector[i] + "";
        }
        
        nuevo.fucionHash(Elementos, nuevo.arreglo);
        String buscar2 = buscar + "";
        
        return nuevo.buscarClave(buscar2,Elementos);
    }
}
