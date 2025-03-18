public class Ifelse
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        evenOod(3);
    }

    //opdracht 1
    private static void evenOod(int number)
    {
        if (number % 2 == 0)
        {
            System.out.println("Het getal is even" + number);
        }
        else
        {
            System.out.println("Het getal is oneven" + number);
        }
    }
}
