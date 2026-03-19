import java.util.Iterator;
import java.util.LinkedList;

public class TabellaHash{
    @SuppressWarnings("rawtypes")
    private LinkedList[] array;

    public TabellaHash(int dimensioneArr){
        array = new LinkedList[dimensioneArr];
    }

    public void add(String key, String value){
        int hashCode = hashCode(key);
        int posizioneArr = hashCode % array.length;
        if(array[posizioneArr] == null){
            array[posizioneArr] = new LinkedList<Elemento>();
            array[posizioneArr].add(new Elemento(key, value));
        }else{
            LinkedList lista = array[posizioneArr];
            Iterator iterator = lista.iterator();
            while (iterator.hasNext()) {
                Elemento elemento = (Elemento) iterator.next();
                if (elemento.getKey() == key) {
                    elemento.setValue(value);
                    return;
                }
            }
            lista.add(new Elemento(key, value));
        }
    }

    private int hashCode(String key){
        int hashCode = 0;
        for(int i=0; i<key.length(); i++){
            char c = key.charAt(i);
            hashCode += (int) c;
        }
        return hashCode;
    }

    public String toString(){
        String string = "";
        for(int i=0; i<array.length; i++){
            if(array[i] == null){
                string += "\n";
            }else{
                string += array[i] + "\n";
            }
        }
        return string;
    }
}