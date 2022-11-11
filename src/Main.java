import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=25; i++)
        {
            System.out.println(i + " " + is_prime(i));
        }

    }

    public static boolean is_prime(int number)
    {
        if(number < 3)
        {
            return false;
        }
        for(int i=2; i*i<=number; i++)
        {
            if(number%i == 0)
            {
                return false;
            }
        }
        return true;
    }

}
