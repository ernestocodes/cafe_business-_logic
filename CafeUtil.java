import java.util.ArrayList;
public class CafeUtil{

    public Integer getStreakGoal(){
        int sum = 0;
        for(int i = 0; i <=10; i++){
            sum += i;
        }
        return sum;
    }

    public Double getOrderTotal(double[] orders){
        double total = 0;
        for(double amount : orders){
            total += amount;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu){
        int i = 0;
        for(String item : menu){
            System.out.println(i + " " + item);
            i++;
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello %s!", userName));
        int customerCount = customers.size();
        System.out.println(String.format("There are %s people in front of you", customerCount));
        customers.add(userName);
        System.out.println(customers);
    }
}