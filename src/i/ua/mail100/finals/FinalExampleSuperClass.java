package i.ua.mail100.finals;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FinalExampleSuperClass {
    final int int1;

    public FinalExampleSuperClass(int int1) {
        this.int1 = int1;
    }

    public void testNotFinal(){

    }

    public final void testFinal(){
        System.out.println("super class");
    }

    public static void main(String[] args) throws Exception{
        final int[] array = {1,2,3,4,5};
        array[0] = 9;	//ок, т.к. изменяем содержимое массива – {9,2,3,4,5}
//        array = new int[5]; //ошибка компиляции

        final List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("fgdsf");
//        list1 = list2; //ошибка компиляции




        // Reflection
        String value = "Old value";
        System.out.println(value);

        //Получаем поле value в классе string
        Field field = value.getClass().getDeclaredField("value");
        //Разрешаем изменять его
        field.setAccessible(true);
        //Устанавливаем новое значение
        field.set(value, "JavaRush".getBytes());

        System.out.println(value);
        System.out.println("\n\n");



        // EFFECTIVELY FINAL
        // В примере ниже и a и b - effectively final, тк значения устанавливаютcя однажды:
        int a = 1;
        int b;
        if (a == 2) b = 3;
        else b = 4;
        // с НЕ является effectively final, т.к. значение изменяется
        int c = 10;
        c++;

        Stream.of(1, 2).forEach(s-> System.out.println(s + a)); //Ок
//        Stream.of(1, 2).forEach(s-> System.out.println(s + c)); //Ошибка компиляции
        System.out.println("\n\n");


        // getBytes
        String Str1 = new String("Добро пожаловать на ProgLang.su");
        try{
            byte[] Str2 = Str1.getBytes();
            System.out.println("Возвращаемое значение: " + Str2);

            Str2 = Str1.getBytes("UTF-8");
            System.out.println("Возвращаемое значение: " + Str2);

            Str2 = Str1.getBytes("ISO-8859-1");
            System.out.println("Возвращаемое значение: " + Str2);

            Str2 = Str1.getBytes("ProgLang.su");
            System.out.println("Возвращаемое значение: " + Str2);

        } catch (UnsupportedEncodingException e){
            System.out.println("Неподдерживаемая кодировка!");
        }

    }

}
