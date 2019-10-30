import java.util.*;

public class Main{
    public static void main(String args[]) {
// create an array list
        ArrayList<String> al = new ArrayList<String>();
        Scanner key=new Scanner(System.in);
        key.next();
        String answer="";
        while (!answer.equalsIgnoreCase("q")) {
            System.out.println("Which movie do you want to add to the list: ");
            answer = key.next();
            al.add(answer);

        }

        System.out.println();
        Collections.sort(al);
        System.out.println(al);
        Random r=new Random();
        int random=1+r.nextInt(al.size());
        System.out.println("We suggest this movie to watch: "+ al.get(random));

    }}
