public class TipoPrimitivo {
    public static void main(String [] args){
        ImprimirPrimitivos();
    }
    private static void ImprimirPrimitivos(){
        //Inteiros
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;

        //Ponto flutuantes
        float f = 50.20F;
        double d = 50.20;

        //Caracter
        char c ='A';

        //Booleano
        boolean bool = true;


        System.out.print("byte: "+b +
                "\n" + "int: "+i +
                "\n" + "short: "+ s+
                "\n" + "long: " +l +
                "\n" + "float: "+f+
                "\n" + "double: "+d+
                "\n" + "char: "+c+
                "\n" + "boolean: "+bool  );


    }

}

