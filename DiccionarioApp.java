import java.util.*;

public class DiccionarioApp {
    public static void main(String[] args) {

        Map<String, String> diccionario = getStringMap();

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaClaves = new ArrayList<>(diccionario.keySet());
        //System.out.println(listaClaves);
        Collections.shuffle(listaClaves);
        //System.out.println(listaClaves);
        listaClaves.subList(0, 15).clear();
        //System.out.println(listaClaves);
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        System.out.print("Bienvenida al diccionario. Empecemos con la practica\n");
        for (int i = 0; i < listaClaves.size(); i++) {
            System.out.print("¿Cómo se escribe la palabra " + listaClaves.get(i)  + " en inglés?\n");
            System.out.print("Ingresa la palabra en inglés: \n");
            String word = sc.nextLine();
            if(word.equals(diccionario.get(listaClaves.get(i)))){
                contadorCorrectas++;
                System.out.println("Excelente, la respuesta es correcta!");
            } else {
                contadorIncorrectas++;
                System.out.println("Oh, la palabra era: " + diccionario.get(listaClaves.get(i)));
            }
        }
        System.out.println("Tus resultados fueron: ");
        System.out.println("Palabras correctas: " + contadorCorrectas);
        System.out.println("Palabras incorrectas: " + contadorIncorrectas);
        System.out.println("¡Hasta la próxima!");
        
    }//main

    private static Map<String, String> getStringMap() {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("rojo", "red");
        diccionario.put("perro", "dog");
        diccionario.put("azul", "blue");
        diccionario.put("naranja", "orange");
        diccionario.put("gato", "cat");
        diccionario.put("caja", "box");
        diccionario.put("llave", "key");
        diccionario.put("agua", "water");
        diccionario.put("leche", "milk");
        diccionario.put("dulce", "candy");
        diccionario.put("lápiz", "pencil");
        diccionario.put("papel", "paper");
        diccionario.put("negro", "black");
        diccionario.put("blanco", "white");
        diccionario.put("morado", "purple");
        diccionario.put("bolsa", "bag");
        diccionario.put("conejo", "rabbit");
        diccionario.put("madera", "wood");
        diccionario.put("mesa", "table");
        diccionario.put("mano", "hand");
        return diccionario;
    }
}//class
