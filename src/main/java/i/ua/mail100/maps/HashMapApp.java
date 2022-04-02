package i.ua.mail100.maps;

import java.util.HashMap;
import java.util.Map;

/*
HashMap внутри - [linkedList]. Элемент - объект
        класса Entry, содержит ключ, значение и ссылку на следующий Entry.
        Поиск - по ключу. По hashСode() ключа -> бакет => значит нашли нужный нам связанный список. Далее проходим по списку и сравниваем ключи элементов списка с нашим ключом для поиска по equals().
        Смысл такого хранения в том, что при поиске/удалении можно отбрасывать ненужные корзины, и исключать все их элементы из рассмотрения.
*/

public class HashMapApp {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();


    }
}
