package forEach;

public class forEach {

    public static void main (String [] args)
    {
        String[] vect = new String[] {"Nissan", "Honda", "Subaru", "Mitsubishi", "Mazda"};

        for (int i=0;i< vect.length;i++){
            System.out.println(vect[i]);
        }
        for(String obj : vect){
            System.out.println(obj);
        }
    }
}