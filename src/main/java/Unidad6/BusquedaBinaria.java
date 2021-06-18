package Unidad6;

public class BusquedaBinaria {
    int temp;
    public BusquedaBinaria(){
    this.temp=0;
    }
    public int BusquedaNumero(int[] vector, int buscar){
        int centro, primero, ultimo, valorCentro;
        primero=0;
        ultimo=vector.length-1;
        while(primero<=ultimo){
            centro=(primero+ultimo)/2;
            valorCentro=vector[centro];
            if(buscar==valorCentro){
                return centro;
            }else if(buscar<valorCentro){
                ultimo=centro-1;
            }else{
                primero=centro+1;
            }
        }
        return -1;
    }
    
    
    public String Burbuja(int m[]){
        for (int i = 0; i < m.length; i++) {
            for (int j = i+1; j < m.length; j++) {
                if(m[i]>m[j]){
                temp=m[i];
                m[i]=m[j];
                m[j]=temp;
                }
            }
        }
        return mostring(m);
     }
    
    
    public String mostring(int[]numeros){
        int k=0;String cad="";
         for (k = 0; k < numeros.length; k++) {
             cad+="["+numeros[k]+"]";
         }
         cad+="\n";
         return cad;
    }
}
