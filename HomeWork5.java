//1. Создать словарь HashMap. Обобщение <Integer, String>.
//2. Заполнить тремя ключами (индекс, цвет), добавить ключ, если не было!)
//3. Изменить значения дописав восклицательные знаки.
//4. *Создать TreeMap, заполнить аналогично.
//5. *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
//6. **Сравнить время последовательного и случайного перебора тысячи элементов словарей.


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

public class HomeWork5 {
    public static void main(String[] args) {

        Random random = new Random();

        HashMap<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "red");
        myMap.put(2, "green");
        myMap.put(3, "blue");
        myMap.putIfAbsent(4, "magenta");
        System.out.println(myMap);

//        myMap.compute(1, (k, v) -> v = "red!");
//        System.out.println(myMap.get(1));

        Iterator<String> iterator = myMap.values().iterator();
        while (iterator.hasNext()) {
            String tmp = iterator.next() + "!";
            System.out.println(tmp);
        }

        long startMyMap = System.currentTimeMillis();
        for (int i = 0; i < 1001; i++) {
            int randomKey = random.nextInt();
            myMap.put(randomKey, "color");
        }
        long endMyMap = System.currentTimeMillis();
        System.out.println(myMap);
        System.out.println(endMyMap - startMyMap);

        TreeMap<Integer, String> myTree = new TreeMap<>();

        myTree.put(1, "red");
        myTree.put(2, "green");
        myTree.put(3, "blue");
        myTree.putIfAbsent(4, "magenta");
        System.out.println(myTree);

        long startMyTree = System.currentTimeMillis();
        for (int i = 0; i < 1001; i++) {
            int key = random.nextInt();
            myTree.put(key, "color");
        }
        long endMyTree = System.currentTimeMillis();

        System.out.println(myTree);
        System.out.println(endMyTree - startMyTree);

    }
}