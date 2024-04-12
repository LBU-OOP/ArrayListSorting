import java.util.ArrayList;

public class ArrayListExample
{

    public ArrayListExample()
    {
        ArrayList <Rider> riders = new  ArrayList<>(); //note the <> means parameterised type. If you don't put it you'll get a warning. ecause of polymorphism we can put ANY class/type in a collection class. The <> allows us to limit it to a specific type, which ordinarily we would want to do. Hence the warning if we don't.
        Rider r1 = new Rider("Geraint Thomas", 11, 5.7f);
        Rider r2 = new Rider("Tadej Pogacar", 15, 6.2f);
        Rider r3 = new Rider("Jonas Vinegaard", 14, 6.1f);
        riders.add(r1);
        riders.add(r2);
        riders.add(r3);
        //now just directly create them using the null references in the arraylist
        riders.add( new Rider("Wout Van Aert", 9, 5.9f));
        riders.add(new Rider("Mathieu Van Der Poel", 9, 5.8f));
        riders.add( new Rider("Duncan Mullier", 0, 4.7f));

        System.out.println("Sort on w/kg");
        riders.sort(new RiderComparatorWpKG()); //here we pass the way we compare two riders to ArrayLists sort method
        for (Rider rider : riders)
        {
            System.out.println("Rider = " + rider.name + " has " + rider.wattsPerKilo + " watts/kg");
        }
        System.out.println("Sort on wins");
        riders.sort(new RiderComparatorWins()); //here we pass a different way to compare two riders to ArrayLists sort method
        for (Rider rider : riders)
        {
            System.out.println("Rider = " + rider.name + " has " + rider.wins + " wins");
        }

    }

    public static void main(String[] args)
    {
        System.out.println("***start***");
        new ArrayListExample();
        System.out.println("**end**");

    }





}
