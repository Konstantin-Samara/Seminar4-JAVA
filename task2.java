// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - 
// помещает элемент в конец очереди, dequeue() - возвращает первый элемент из 
// очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
public static void main(String[] args) {    
    LinkedList my_list = new LinkedList<String>();

    my_input(my_list);   
    System.out.println("Введенный список : "); my_print(my_list);
    System.out.println("метод dequeue : "+dequeue(my_list)); my_print(my_list);
    System.out.println("метод first : "+first(my_list)); my_print(my_list);}

static public Void my_input(LinkedList list1) {
    Scanner my_str;
    my_str = new Scanner(System.in); 
    String s = "";
    int count = 0;
    while (!s.equalsIgnoreCase("end")) {
        System.out.print("Введите "+count+" элемент списка (\"end\" - завершить): ");
        s = my_str.nextLine();
        if (!s.equalsIgnoreCase("end")) {enqueue(s, list1); count++;}}
    my_str.close();
return null;}

static Void my_print(LinkedList list1) {
    for (int i = 0; i < list1.size(); i++) System.out.println(i+" "+list1.get(i));
return null;}

static Void enqueue(String item, LinkedList list1) {
    list1.add(item);
    return null;}

static String dequeue(LinkedList list1) {
    String s = String.valueOf(list1.get(0));
    list1.remove(0);
    return s;}

static String first(LinkedList list1) {
    String s = String.valueOf(list1.get(0));
    return s;}   
}

               

