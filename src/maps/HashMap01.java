package maps;
import java.util.Map;
import java.lang.instrument.ClassFileTransformer;
import java.util.HashMap;

public class HashMap01 {
    
    public static void main(String[] args) {
        
        //Criando um Map  com uma chave do tipo Integer e um valor do tipo String

        Map<Integer, String> names = new HashMap<Integer, String>();

        names.put(0,"cassiano");
        names.put(1,"jose");
        names.put(2,"cassi");
        names.put(3,"cecilia");
        names.put(4,"ceci");
        names.put(5,"joao");

        //Imprimindo o Map de nomes
        System.out.println(names);

        //imprimindo o conjunto de chaves
        System.out.println(names.keySet());

        //Imprimindo o conjunto de valores
        System.out.println(names.values());

        //Imprimindo o conjunto de entradas
        System.out.println(names.entrySet());

        //Atualizando um valor
        names.put(1, "mariana");

        //Inserindo um valor caso a chave não exista
        names.putIfAbsent(10, "joana");

        //Tentando inserir um valor com uma chave existente
        names.putIfAbsent(1, "marianne");

        System.out.println(names);

        //Removendo um item com base na chave
        System.out.println(names.remove(5));

        //removendo um item com base na relação chave/valor
        System.out.println(names.remove(1,"mariana"));


        

    }

}
