package arrays;

public class UsoArrays {
    public static void main(String[] args) {
        int [] miMatriz=new int[5];
        miMatriz[0]=5;
        miMatriz[1]=38;
        miMatriz[2]=-15;
        miMatriz[3]=92;
        miMatriz[4]=71;
        for (int i=0;i<5;i++){
            System.out.println("Matriz1,valor del indice "+i+" = "+miMatriz[i]);
        }
        int []miMatriz2 = {6,39,-16,93,72,95,85,65,25,14,78};
        for (int i=0;i< miMatriz2.length;i++){
            System.out.println("Matriz2,valor del indice "+i+" = "+miMatriz2[i]);
        }

    }
}
