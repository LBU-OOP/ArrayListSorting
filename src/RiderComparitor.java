import java.util.Comparator;

class RiderComparitor implements Comparator<Rider>
{
    public int compare(Rider one, Rider two)
    {
        if (one.wattsPerKilo > two.wattsPerKilo)
            return 1;
        else if (two.wattsPerKilo > one.wattsPerKilo)
            return -1;
        else
            return 0;
    }

}