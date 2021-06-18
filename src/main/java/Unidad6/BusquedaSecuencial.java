package Unidad6;

public class BusquedaSecuencial {
	  
    public  int BusquedaNumero(int[] vector, int buscar){
        int pos = -1;
        for(int i = 0;i < vector.length; i++){
            if(vector[i] == buscar){
                pos = i;
                return pos;
            }
        }
        return pos;
    }
}
