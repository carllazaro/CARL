import java.util.*;
public class q {
    public static void main(String[] args) {
        Queue<String> register = new LinkedList<String>();
        String[] names = {"Carl","Jason","Laszaro"};
        for(int i=0;i<names.length;i++) {
            register.offer(names[i]);
        }
        System.out.println("In Queue: "+register);
        for(int j=0;j<names.length;j++) {
            System.out.println("Done << : "+register.poll());
            String result = (register.isEmpty())?"The Queue is empty":("Next >> : "+register.peek()+"\nIn Queue: "+register);
            System.out.println(result);
        }
    }
}
