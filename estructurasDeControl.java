public class estructurasDeControl {

    public static void main(String[] args) {

        String[] palabras ={"Hola", "como", "estan", "ustedes", "hoy", ",", "bien ?"};
        String frase = null;
        String espacio = " ";

        for(String palabra : palabras){

           frase = frase + espacio + palabra;
        }
        System.out.println(frase);


    }

}
