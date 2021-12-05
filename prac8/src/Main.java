import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Тест WaitList
        System.out.println("Тест WaitList");
        WaitList<Integer> waitList = new WaitList<>();
        System.out.println("Пуст ли WaitList? -> " + waitList.isEmpty());

        waitList.add(1);
        waitList.add(2);
        waitList.add(3);
        waitList.add(4);
        System.out.println(waitList);
        System.out.println("Пуст ли WaitList? -> " + waitList.isEmpty());
        System.out.println();

        System.out.println("Содержит ли WaitList 3? -> " + waitList.contains(3));
        System.out.println("Содержит ли WaitList 5? -> " + waitList.contains(5));
        System.out.println();

        var col = new ArrayList<Integer>();
        col.add(1);
        col.add(2);
        System.out.println("Содержит ли WaitList 1, 2? -> " + waitList.containsAll(col));
        col.add(5);
        System.out.println("Содержит ли WaitList 1, 2, 5? -> " + waitList.containsAll(col));
        System.out.println();

        System.out.println("Удаление первого элемента");
        waitList.remove();
        System.out.println(waitList);
        System.out.println("Конец теста WaitList");
        System.out.println();

        //Конец теста WaitList

        // Тест BoundedWaitList на 3 элемента
        System.out.println("Тест BoundedWaitList");
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(3);
        System.out.println("Пуст ли BoundedWaitList? -> " + boundedWaitList.isEmpty());

        boundedWaitList.add("one");
        boundedWaitList.add("two");
        boundedWaitList.add("three");
        System.out.println(boundedWaitList);
        System.out.println("Пуст ли BoundedWaitList? -> " + boundedWaitList.isEmpty());
        System.out.println();

        System.out.println("Содержит ли BoundedWaitList 'three'? -> " + boundedWaitList.contains("three"));
        System.out.println("Содержит ли BoundedWaitList 'five'? -> " + boundedWaitList.contains("five"));
        System.out.println();

        var col2 = new ArrayList<String>();
        col2.add("one");
        col2.add("two");
        System.out.println("Содержит ли BoundedWaitList 'one', 'two'? -> " + boundedWaitList.containsAll(col2));
        col2.add("five");
        System.out.println("Содержит ли BoundedWaitList 'one', 'two', 'five'? -> " + boundedWaitList.containsAll(col2));
        System.out.println();

        System.out.println("Какой максимум в BoundedWaitList? -> " + boundedWaitList.getCapacity());
        boundedWaitList.add("four");
        System.out.println();

        System.out.println("Удаление первого элемента");
        boundedWaitList.remove();
        System.out.println(boundedWaitList);
        System.out.println("Конец теста BoundedWaitList");
        System.out.println();

        //Конец теста BoundedWaitList

        // Тест UnfairWaitList
        System.out.println("Тест UnfairWaitList");
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        System.out.println("Пуст ли UnfairWaitList? -> " + unfairWaitList.isEmpty());

        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        unfairWaitList.add(4);
        System.out.println(unfairWaitList);
        System.out.println("Пуст ли UnfairWaitList? -> " + unfairWaitList.isEmpty());
        System.out.println();

        System.out.println("Содержит ли UnfairWaitList 3? -> " + unfairWaitList.contains(3));
        System.out.println("Содержит ли UnfairWaitList 5? -> " + unfairWaitList.contains(5));
        System.out.println();

        var col3 = new ArrayList<Integer>();
        col3.add(1);
        col3.add(2);
        System.out.println("Содержит ли UnfairWaitList 1, 2? -> " + unfairWaitList.containsAll(col3));
        col3.add(5);
        System.out.println("Содержит ли UnfairWaitList 1, 2, 5? -> " + unfairWaitList.containsAll(col3));
        System.out.println();

        System.out.println("Попытка удалить 1:");
        unfairWaitList.remove(1);
        System.out.println();

        System.out.println("Попытка удалить 2:");
        unfairWaitList.remove(2);
        System.out.println(unfairWaitList);
        System.out.println();

        System.out.println("Перенос 1 в конец очереди:");
        unfairWaitList.moveToBack(1);
        System.out.println(unfairWaitList);
        System.out.println();

        System.out.println("Конец теста UnfairWaitList");
        System.out.println();

        //Конец теста UnfairWaitList
    }
}
