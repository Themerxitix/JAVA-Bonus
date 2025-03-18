public class Ifelse
{
    public static void main(String[] args)
    {
        //aanroepen opdrachten
//        evenOod(4);
//        studentNumber(87);
//        theBigstNumber(9,3);
//        numberChecker(-7889);
//        ageClasification(22);
//        txtChecker("sfdlkfdlkfdlkfdlkfdlkfd");
//        yearChecker(1200);
//        theBiggstOutOfThree(5,10,10);
//        triangelType(9,3,3);
//        calculateMachine(20,5,"/");




    }

    //opdracht 1
    private static void evenOod(int number)
    {
        if (number % 2 == 0)
        {
            System.out.println("Het getal is even " + number);
        }
        else
        {
            System.out.println("Het getal is oneven " + number);
        }
    }

    //opdracht 2
    private static void studentNumber(int number)
    {
        if (number <= 0 || number > 10)
        {
            System.out.println("Het opgegeven getal is ongeldig! " + number);
        }
        else if (number <= 2)
        {
            System.out.println("Het letterwaarde " + number + " is: A" );
        }
        else if (number == 3 || number == 4 )
        {
            System.out.println("Het letterwaarde " + number + " is: B" );
        }
        else if (number == 5 || number == 6 )
        {
            System.out.println("Het letterwaarde " + number + " is: C" );
        }
        else if (number == 7 || number == 8 )
        {
            System.out.println("Het letterwaarde " + number + " is: D" );
        }
        else
        {
            System.out.println("Het letterwaarde " + number + " is: F" );
        }

    }
    //opdracht3
    private static void theBigstNumber(int firstNumber, int secondNumber)
    {
        if (firstNumber > secondNumber)
        {
            System.out.println("Het getal eerste nummer is groter!");
        }
        else
        {
            System.out.println("Het getal tweede nummer is groter!");
        }
    }

    //opdracht 4
    private static void numberChecker(int number)
    {
        if (number == 0)
        {
            System.out.println("Het getal is zero " + number);
        }
        else if (number < 0)
        {
            System.out.println("Het getal is negatief " + number);
        }
        else
        {
            System.out.println("Het getal is positief " + number);
        }
    }

    //opdrcht 5
    private static void ageClasification(int age)
    {
        if (age > 65)
        {
            System.out.println("Je bent een senior");
        }
        else if (age > 18)
        {
            System.out.println("Je bent een volwassen");
        }
        else if (age > 12)
        {
            System.out.println("Je bent een puber");
        }
        else
        {
            System.out.println("Je bent een kind");
        }
    }

    // opdarcht 6
    private static void txtChecker(String txt)
    {
        if (txt.length() > 20)
        {
            System.out.println("Tekst is lang");
        }
        else if (txt.length() > 10)
        {
            System.out.println("Tekst is middellang");
        }
        else
        {
            System.out.println("Tekst is kort");
        }
    }

    //opdarcht 7
    private static void yearChecker(int year)
    {
        if (year % 400 == 0)
        {
            System.out.println("Het getal is een schrikkeljaar ");
        }
        else if (year % 100 == 0 || year % 4 != 0)
        {
            System.out.println("Het getal is GEEN schrikkeljaar  ");
        }
        else
        {
            System.out.println("Het getal is een ?schrikkeljaar");
        }
    }

    //opdracht 8
    private static void theBiggstOutOfThree(int firstNumber, int secondNumber, int thiredNumber)
    {
        if (firstNumber > secondNumber && firstNumber >thiredNumber)
        {
            System.out.println("Eerste nummer is de grootste!");
        }
        else if (secondNumber > thiredNumber)
        {
            System.out.println("Tweede nummer is de grootste!");
        }
        else
        {
            System.out.println("Derde nummer is de grootste!");
        }
    }

    //opdracht 9
    private static void triangelType(double firstSide, double secondSide, double thiredSide)
    {
        if (firstSide == secondSide && firstSide == thiredSide && secondSide == thiredSide)
        {
            System.out.println("Gelijkzijdig driehoek!");
        }

        if (firstSide == secondSide || firstSide == thiredSide || secondSide == thiredSide)
        {
            System.out.println("Gelijkbenig driehoek!");
        }
        else
        {
            System.out.println("Gelijkbenig onzijdig!");
        }
    }

    //opdacht 10
    private static void calculateMachine(int firstNumber, int secondNumber, String operator)
    {
        if (operator == "+")
        {
            int sum = firstNumber + secondNumber;
            System.out.println("Berekining: " + sum);
        }
        else if (operator == "-")
        {
            int sum = firstNumber - secondNumber;
            System.out.println("Berekining: " + sum);
        }
        else if (operator == "*")
        {
            int sum = firstNumber * secondNumber;
            System.out.println("Berekining: " + sum);
        }
        else
        {
            int sum = firstNumber / secondNumber;
            System.out.println("Berekining: " + sum);
        }
    }
}
