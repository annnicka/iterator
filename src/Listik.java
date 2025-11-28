import java.util.ArrayList;
import java.util.Iterator;

public class Listik implements Iterable<Integer>{

    private ArrayList<Integer> listy;

    public void addNumber(int number){
        listy.add(number);
    }


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
