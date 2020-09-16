package crosszero;
import java.util.Random;
import java.util.Scanner;

public class crosszero {
    static char[][] map;
    static final int SIZE = 3;

    static final char DOT_X ='X';
    static final char DOT_0 ='0';
    static final char DOT_EMPTY ='.';

    static void initMap()
    {
        map = new char[SIZE][SIZE];

        for (int i=0; i<map.length; i++)
        {
            for (int j=0; j<map[i].length; j++)
            {
                map[i][j]= DOT_EMPTY;
            }
        }

    }

    static void printMap()
    {
        for (int i=0; i<=SIZE; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=0; i<SIZE; i++)
        {
            System.out.print((i+1) + " ");

            for(int j=0; j<SIZE; j++)
            {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void humanTurn()
    {
        Scanner scanner= new Scanner(System.in);
        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате Х Y");
            x= scanner.nextInt() -1;
            y= scanner.nextInt() -1;
        }
        while (!isCellValid(x, y));


        map[y][x]=DOT_X;

    }

    static boolean isCellValid(int x, int y)
    {
        if (x<0 || x>=SIZE || y<0 || y>=SIZE)
        {
            return false;
        }

        if (map[y][x]==DOT_EMPTY)
        {
            return true;
        }
        return false;
    }

    static void aiTurn()
    {
        int x, y;
        Random random = new Random();


        do
        {
            x= random.nextInt(SIZE);
            y= random.nextInt(SIZE);
        }
        while (!isCellValid(x, y));


        System.out.println("Компьютер сходил: " + x + "И" +y);
        map[y][x]=DOT_0;

    }

    static boolean isWinner(char symb)
    {
        //строки
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb)
        {
            return true;
        }

        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb)
        {
            return true;
        }

        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb)
        {
            return true;
        }
        //столбцы
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb)
        {
            return true;
        }

        if (map[1][0] == symb && map[1][1] == symb && map[2][1] == symb)
        {
            return true;
        }

        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb)
        {
            return true;
        }
        //диагонали
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb)
        {
            return true;
        }

        if (map[2][0] == symb && map[1][1] == symb && map[0][0] == symb)
        {
            return true;
        }
        return false;

    }

    static boolean isMapFull()
    {
        for(int i=0; i<map.length; i++)
        {
            for (int j=0; j<map[i].length; j++)
            {
                if (map[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        //Организовать игровое поле
        initMap();
        printMap();

        while(true)
        {
            humanTurn();
            printMap();

            if (isWinner(DOT_X))
            {
                System.out.println("Поздравляем! Вы победили!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();

            if (isWinner(DOT_0))
            {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

        }
        //Организовать игровые фишки
        System.out.println("Игра окончена!");
    }

}
