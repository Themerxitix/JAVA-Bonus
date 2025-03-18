public class Loops
{
    public static void main(String[] args)
    {
        //opdarcht 1
        /*
        int number = 1;
        int odd = 0;
        //zolang het kleiner of gelijk
        while (number <= 100)
        {
            //test wat de nummer is
            //System.out.println("Test nummer" + number);

            //doe iets
            // vindt eerste de even getallen
            if (number % 2 == 0)
            {
                //wijs de waarde toe aan lege variable
                odd += number;

                //print alle sommen uit stap voor stap
//                System.out.println("Dit is de som: " + odd + " dit is de waarde van nummer: " + number);
//
            }
            // verhoog de begin getal
            number++;
        }
        // print som uit
        System.out.println("Dit is de som: " + odd);
         */

        //opdracht 2
        /*
        int nummber = 1;
        int result = 0;

        // zolang klein is dan
        while (result < 1000)
        {
            result = nummber * 2;
           System.out.println("Dit is resultaat: "+result + " dit is nummer: " + nummber);
            nummber++;
            //System.out.println("dit is nummer na verhoging: " + nummber);
        }
       // System.out.println("Dit is resultaat: "+result );
         */

        //opdarcht 3
        /*
        int[] getallenArray = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};

        int nummber = 0;

        while (nummber < getallenArray.length)
        {
            if (getallenArray[nummber] == 45)
            {
                System.out.println("Het getal 45 zit in de array!");
            }
            nummber++;
        }
         */

        //opdarcht4
        /*
        int[] getallenArray = {12, 5, 7, 2, 18, 3, 9, 12};

        int nummber = 0;
        int result = 0;
        while (nummber < getallenArray.length)
        {
//            System.out.println("Dit is de nummer: " + nummber+ "\t");
//            System.out.println("Dit is de arrayNummer: " + getallenArray[nummber]+ "\t");
            result += getallenArray[nummber];
            nummber++;
//            System.out.println("Dit is de som: " + result + "\t");
        }
        System.out.println("Dit is de som: " + result + "\t");

         */

        //opdarcht 5
        /*
        String[] stringArray = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};

        int nummber = 0;

        while (nummber < stringArray.length)
        {
           if (stringArray[nummber] == "")
           {
               System.out.println("Er is een lege string");
           }
           nummber++;
        }
         */

        //opdacht 6
        /*
        int number = 1;

        while (number < 10)
        {
            if (number == 2)
            {
                System.out.println("Dit is een priem getal: " + number);
            }
            else if (number % 2 == 1)
            {
                System.out.println("Dit is een oneven getal: " + number);
            }
            number++;
        }
         */

        //opdarcht 7
        /*
        int[] getallenArray = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};

        int nummber = 0;

        while (nummber < getallenArray.length)
        {
            if (getallenArray[nummber] > 45)
            {
                System.out.println(getallenArray[nummber]);
            }
            nummber++;
        }
         */

        //opdracht 8
        /*
        int teller = 10;

        while (teller > 0)
        {
            System.out.println("De teller is: " + teller);
            teller--;
        }
         */

        //opdracht 9
        /*
        int number = 10;
        int a = 0;
        int b = 1;
        int c;

        for (int i = 2; i <= number; i++)
        {
            c = a + b;
            a = b;
            b = c;

            System.out.println("Dit is c: " + c);
        }
         */

        //opdracht 10
        /*
       for (int i = 1; i < 10; i++)
        {
            System.out.println("        ");
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
        }

         */
    }
}