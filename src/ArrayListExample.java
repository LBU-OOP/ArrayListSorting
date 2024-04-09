import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample
{

    public ArrayListExample()
    {
        ArrayList <Rider> riders = new  ArrayList<>();
        Rider r1 = new Rider("Geraint Thomas", 11, 5.7f);
        Rider r2 = new Rider("Tadej Pogacar", 15, 6.2f);
        Rider r3 = new Rider("Jonas Vinegaard", 14, 6.1f);
        Rider r4 = new Rider("Wout Van Aert", 9, 5.9f);
        Rider r5 = new Rider("Mathieu Van Der Poel", 9, 5.8f);
        Rider r6 = new Rider("Duncan Mullier", 0, 4.7f);
        riders.add(r1);
        riders.add(r2);
        riders.add(r3);
        riders.add(r4);
        riders.add(r5);
        riders.add(r6);
        Collections.sort( riders, new RiderComparitor());
        for (Rider rider : riders)
        {
            Rider r = (Rider) rider;
            System.out.println("Rider = " + r.name + " has " + r.wattsPerKilo + " watts/kg");
        }

    }

    public static void main(String[] args)
    {
        System.out.println("***start***");
        ArrayListExample arrayListExample = new ArrayListExample();
        System.out.println("**end**");

    }





}
