import com.pa.adts.stack.Stack;
import com.pa.adts.stack.StackArray;
import com.pa.adts.stack.StackLinked;

import java.util.*;


public class MainTestIterator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++)
            list.add(i, 100 - i);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++)
            set.add( 100 - i);
        System.out.println("\nITERATE SET ");
        for (Integer i: set)
            System.out.print(i + " ");

        Stack<Integer> stack = new StackLinked<>();

        for (int i = 0; i < 20; i++)
            stack.push( 100 - i);
        System.out.println("\nITERATE STACK");
        for (Integer i: stack)
            System.out.print(i + " ");

/** Exercicio Adicional **/
        System.out.println("\nITERATE INVERSE");
        Iterator<Integer> it= stack.iteratorInverse();
         while(it.hasNext())
             System.out.print(it.next() + " ");

    }


}
