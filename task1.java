import java.util.LinkedList;
import java.util.Scanner;
// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
public class task1 {
    public static void main(String[] args) {
        LinkedList my_list = new LinkedList<String>();
        my_input(my_list);
        System.out.println("Введенный список : ");
        my_print(my_list);
        revers(my_list);
        System.out.println("\"Перевернутый\" список : ");
        my_print(my_list);}

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
        
    static Void revers(LinkedList list1) {
        for (int i = 0; i < list1.size(); i++) {
            list1.add(i,list1.get(list1.size()-1));
            list1.removeLast();}
        return null;}    
}
