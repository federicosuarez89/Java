package programacion_concurrente.threads_start;

public class NumerosLetras implements Runnable{
    //Variable de clase
    private int tipo;

    //Constructore de la clase
    public NumerosLetras(int tipo){
        this.tipo = tipo;
    }

    @Override
    public void run() {
        while (true){
            switch (tipo){
                case 1:
                    //Imprimimos los numeros del 0-30
                    for (int i=0;i<31;i++){
                        System.out.println(i);
                    }
                    break;
                case 2:
                    //Imprimimos los caracteres de a-z
                    for (char c = 'a';c<='z';c++){
                        System.out.println(c);
                    }
                    break;
            }
        }
    }
}
