import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // These are command that show the list of shapes to select from
        System.out.println("Select a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle"); 
        System.out.println("3. Rectangle");
        System.out.println("4. Sphere");
        System.out.println("5. Cube");

        int choice = scanner.nextInt();

        Shape shape = null;
        if (choice == 1){
            System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
        } 
        else if (choice == 2 ){
             System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
        }
        else if (choice ==3){
             System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = scanner.nextDouble();
                shape = new Rectangle(length, breadth);
        }
        else if (choice ==4){
            System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Sphere(radius);
        }
        else if (choice ==5){
            System.out.print("Enter side: ");
              double side = scanner.nextDouble();
                shape = new Cube(side);
        } 
        else{
           System.out.println("Invalid choice");
                return; 
        }


        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.calculateArea());
        if (shape instanceof ThreeDimensionalShape) {
            System.out.println("Volume: " + ((ThreeDimensionalShape) shape).calculateVolume());
        }
    scanner.close();   
    }
}