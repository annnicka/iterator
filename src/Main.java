import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Listik l = new Listik();
        l.addNumber(2);
        l.addNumber(6);
        l.addNumber(8);
        l.addNumber(1);
        l.addNumber(9);
        l.addNumber(21);
        l.addNumber(22);
        l.addNumber(23);
        l.addNumber(28);


        IteratorListik iteratorListik = (IteratorListik) l.iterator();

        while(iteratorListik.hasNext()){
            System.out.println(iteratorListik.next());
        }



    }
}