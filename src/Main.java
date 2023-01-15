import java.util.Scanner;

class ArrayBubble{
    private long[] a;   //ссылка на массив
    private int elems;  //количество элементов в массиве

    public ArrayBubble(int max){    //конструктор класса
        a = new long[max];          //создание массива размером max
        elems = 0;                  //при создании массив содержит 0 элементов
    }

    public void into(long value){   //метод вставки элемента в массив
        a[elems] = value;           //вставка value в массив a
        elems++;                    //размер массива увеличивается
    }

    public void printer(){          //метод вывода массива в консоль
        for (int i = 0; i < elems; i++){    //для каждого элемента в массиве
            System.out.print(a[i] + " ");   //вывести в консоль
            System.out.println("");         //с новой строки
        }
        System.out.println("----Окончание вывода массива----");
    }

    private void toSwap(int first, int second){ //метод меняет местами пару чисел массива
        long dummy = a[first];      //во временную переменную помещаем первый элемент
        a[first] = a[second];       //на место первого ставим второй элемент
        a[second] = dummy;          //вместо второго элемента пишем первый из временной памяти
    }

    public void bubbleSorter(){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = elems - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){       //Внутренний цикл
                if(a[in] > a[in + 1])               //Если порядок элементов нарушен
                    toSwap(in, in + 1);             //вызвать метод, меняющий местами
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {


            ArrayBubble array = new ArrayBubble(5); //Создаем массив array на 5 элементов

            array.into(163);       //заполняем массив
            array.into(300);
            array.into(184);
            array.into(191);
            array.into(174);

            array.printer();            //выводим элементы до сортировки
            array.bubbleSorter();       //ИСПОЛЬЗУЕМ ПУЗЫРЬКОВУЮ СОРТИРОВКУ
            array.printer();            //снова выводим отсортированный йсписок



        System.out.println("Hello World!\nHello World!");

        byte num = 8;
        System.out.print(num+"\n");

        Scanner scanner = new Scanner(System.in);
        Double numwithdot = scanner.nextDouble();
        System.out.print(numwithdot);

        float number=4.35f;

        System.out.printf("Переменная:num=%f; \n", number);

        var num1 = 20;
        num1 = 5+num1;
        System.out.print(num+"\n");
        System.out.printf("Переменная:var=%d", num);

        double num2 = 1.4234;
        System.out.println(Math.pow(num1,3));

        String[] simAr = new String[] {"J", "a", "v", "a", "!"};
        System.out.printf("Элемент: "+ simAr[2]);

        for (int i=1; i<6; i++)
        {
            System.out.print("Номер элемента:" + i  + "\n");
        }
        int num3 = scanner.nextInt();

            switch (num) {
                case (3):
                    System.out.println("Три");
                    break;
                case (7):
                    System.out.println("Семь");
                    break;
                default:
                    System.out.println("Что-то другое");
                    break;

            }

        for (int i =10; i<=20;i++)
        {
            System.out.println(Math.pow(i,2));
        }

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 10));
            System.out.println(array1[i]);
        }
    }}
