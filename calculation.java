import java.util.Scanner;

 class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            displayMenu();
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    circle();
                    break;
                case 2:
                    rectangle();
                    break;
                case 3:
                    square();
                    break;
                case 4:
                    triangle();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to run the program again? (Y/N): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("Y/y"));

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Calculate the area of a circle");
        System.out.println("2. Calculate the area of a rectangle");
        System.out.println("3. Calculate the area of a square");
        System.out.println("4. Calculate the area of a triangle");
        System.out.print("Enter your choice: ");
    }

    public static void circle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }

    public static void rectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }

    public static void square() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;

        System.out.println("The area of the square is: " + area);

        scanner.close();
    }

    public static void triangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}


