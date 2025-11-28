import java.util.ArrayList;
import java.util.Iterator;

public class Listik implements Iterable<Integer>{

    private ArrayList<Integer> listy;

    public void addNumber(int number){
        listy.add(number);
    }

    public int size(){
        return listy.size();
    }

    public Integer get(int index){
        return listy.get(index);
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
