import java.util.Comparator;

class RiderComparatorWins implements Comparator<Rider>
{
    public int compare(Rider one, Rider two)
    {
        if (one.wins > two.wins)
            return -1;
        else if (two.wins > one.wins)
            return 1;
        else
            return 0;
    }

}