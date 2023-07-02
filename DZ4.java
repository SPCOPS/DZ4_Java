import java.util.Collections;
import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class DZ4 {
    // public static void main(String[] args) {
    //     LinkedList<String> list = new LinkedList<String>();
    //     list.add("a1");
    //     list.add("b2");
    //     list.add("c3");
    //     list.add("d4");
    //     list.add("e5");
    //     list.add("f6");
    //     list.add("g7");
    //     list.add("h8");
    //     list.add("j9");
    //     list.add("k10");
    //     LinkedList<String> reversedList = reverseLinkedList(list);
    //     System.out.println(reversedList);
    // }

    // public static LinkedList reverseLinkedList(LinkedList list) {
    //     Collections.reverse(list);
    //     return list;
    // }

    public static Deque<Object> fillList(){
        Deque<Object> list = new LinkedList<>();
        list.add("Список: ");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        return list;
    }

    public static void printList(Deque<Object> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
        System.out.println();
    }

    public static void enqueue(Deque<Object> list){
        System.out.println("Введите элемент, который надо добавить: ");
        Scanner sc1 = new Scanner(System.in);
        Object element = sc1.nextLine();
        list.addLast(element);
        sc1.close();
    }

    public static Object dequeue(Deque<Object> list){
        Object item = list.pollFirst();
        return item;
    }

    public static Object first(Deque<Object> list){
        return list.peekFirst();
    }

    public static void main(String[] args) {
        Deque<Object> que = new LinkedList<>();
        que = fillList();
        printList(que);
        System.out.println("Введите номер операции: 1 - поместить элемент в конец очереди; 2 - вернуть первый элемент из очереди и удалить его; 3 - вернуть первый элемент из очереди, не удаляя; 4 - завершение работы");
        while(true){
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if (cmd == 1){
                enqueue(que);
                printList(que);
                continue;
            }
            if (cmd == 2) {
                System.out.println("Первый элемент: " + dequeue(que));
                printList(que);
                continue;
            }
            if (cmd == 3){
                System.out.println("Первым элементом был: " + first(que));
                continue;
            }
            if (cmd == 4) break;
            else {
                System.out.println("Для выхода из программы введите 4");
            }
            sc.close();
        }
    }
}
