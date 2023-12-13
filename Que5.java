import java.util.Scanner;
class Que5{
     public static void main(String[] args) {
        
        Juice juice = new Juice();
        juice.input();
        System.out.println("Details = ");
        juice.display();
        juice.discount();
        System.out.println("\nDetails with discount = ");
        juice.display();
    }
}
class Juice {
    int code;
    String flavor;
    String type;
    int size;
    int price;

    
    public Juice() {
        code = 0;
        flavor = "";
        type = "";
        size = 0;
        price = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("put product code = ");
        code = sc.nextInt();

        System.out.print("put flavor = ");
        sc.nextLine(); 
        flavor = sc.nextLine();

        System.out.print("put pack type = ");
        type = sc.nextLine();

        System.out.print("put pack size = ");
        size = sc.nextInt();

        System.out.print("put product price = ");
        price = sc.nextInt();
    }
    public void discount() {
        price -= 10;
    }
    public void display() {
        System.out.println("Product Code: " + code);
        System.out.println("Flavor: " + flavor);
        System.out.println("Pack Type: " + type);
        System.out.println("Pack Size: " + size + " ml");
        System.out.println("Product Price: " + price);
    }
}
