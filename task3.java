// 4*. К калькулятору из предыдущего дз добавить логирование.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader f_r = new BufferedReader(new FileReader("calc_log.txt"));
        LinkedList<String> log_list = new LinkedList<>();
        String line;
        while ((line=f_r.readLine())!=null) log_list.add(line); f_r.close();

        float n1 = 0;
        float n2 = 0;
        float result = 0;
        int operand = 0;
        Scanner scan;
        boolean my_test = true;
        boolean main_test = true;
        String symb = "";
        scan = new Scanner(System.in);
        while (main_test) {
        scan = new Scanner(System.in);    
        System.out.println("Список ранее записанных операций : ");
        for (int i = 0; i < log_list.size(); i++) 
            System.out.println((i+1)+") : "+log_list.get(i));
            System.out.println("\n1. Перейти в калькулятор.");
            System.out.println("2. Удалить запись о последней операции.");
            System.out.println("3. Завершить.");
            System.out.print("Выберите пункт меню (1-3) :");
            operand = scan.nextInt();

        if (operand==3) main_test = false;
        else {if (operand==2) 
            {System.out.println("Из списка операций удалена последняя : "+log_list.removeLast());}
                else{if (operand==1){
                    while (my_test) {
                        scan = new Scanner(System.in); 
                        System.out.print("Введите число 1 : ");
                        if (scan.hasNextFloat()) {n1 = scan.nextFloat(); my_test = false;}          
                        else System.out.println("Вы ввели не число - попробуйте еще раз.");}
                    my_test = true;
            
                    while (my_test) {
                        scan = new Scanner(System.in);
                        System.out.println("1 - Сложение (+)");
                        System.out.println("2 - Вычитание (-)");
                        System.out.println("3 - Умножение (*)");
                        System.out.println("4 - Деление (/)");
                        System.out.println("5 - Возведение первого числа в степень второго (^)");
                        System.out.print("Выберите операнд (1-5) : ");
                        if (scan.hasNextFloat()) {
                            operand = scan.nextInt();
                            if ((operand>0)&&(operand<6)) {my_test = false;}
                            else System.out.println("Такого пункта нет в меню - попробуйте еще раз.");}             
                        else System.out.println("Вы ввели не число - попробуйте еще раз.");} 
                    my_test = true;
            
                    while (my_test) {
                        scan = new Scanner(System.in);
                        System.out.print("Введите число 2 : ");
                        if (scan.hasNextFloat()) {
                            n2 = scan.nextFloat();
                            if (operand==4&&n2==0) 
                            System.out.println("Нельзя делить на ноль - попробуйте еще раз.");
                            else my_test = false;}             
                        else System.out.println("Вы ввели не число - попробуйте еще раз.");}
            
                    if (operand==1) {result = n1+n2; symb = " + ";}
                    else {if (operand==2) {result = n1-n2; symb = " - ";}
                        else {if (operand==3) {result = n1*n2; symb = " * ";}
                            else {if (operand==4) {result = n1/n2; symb = " / ";}
                                    else {if (operand==5) {
                                            symb = " ^ "; result = 1;
                                            if (n2>=0) {for (int i=1; i<=n2; i++) result*=n1;}
                                            else {for (int i=1; i<=-n2; i++) result*=n1;
                                                    result = 1/result;}}
                                            
                                            }}}}
                    log_list.add(n1+symb+n2+" = "+result);
                    System.out.println(log_list.get(log_list.size()-1));}
                    else {System.out.println("Нет такого пункта - попробуйте еще раз.");}}}
}
        scan.close(); 
        FileWriter f_w = new FileWriter("calc_log.txt");
        for (int i = 0; i < log_list.size(); i++) f_w.append(log_list.get(i)+"\n");
        f_w.close(); 
       
}}    