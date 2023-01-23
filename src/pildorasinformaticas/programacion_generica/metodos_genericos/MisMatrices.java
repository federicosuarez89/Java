package pildorasinformaticas.programacion_generica.metodos_genericos;

public class MisMatrices {

    //Metodo generico
    public static <T> String getElemntosArray(T [] a){
        String resultado = "El array tiene "+a.length+" elementos";
        return resultado;
    }

    public static <U extends Comparable> U getDatoMenor(U [] a){
        U elementoMenor = a[0];
        if (a.length==0 || a==null){
            return null;
        }
        for (int i=1;i<a.length;i++){
            if (elementoMenor.compareTo(a[i])>0){
                elementoMenor = a[i];
            }
        }
        return elementoMenor;

    }
}
