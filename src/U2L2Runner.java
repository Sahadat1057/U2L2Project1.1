import java.util.Scanner;
public class U2L2Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Rectangle rect1 = new Rectangle (150, 200);
        //rect1.printRectangleInfo();
        Rectangle rect2 = new Rectangle (100);
        //rect2.printRectangleInfo();
        Rectangle rect3 = new Rectangle ();
        //rect3.printRectangleInfo();



        rect1.setWidth(125);
        //rect1.printRectangleInfo();
        rect2.setWidth(125);
        rect2.setLength(125);
        //rect2.printRectangleInfo();
        rect3.setWidth(125);
        //rect3.printRectangleInfo();

       int perimeter1 = rect1.getWidth() + rect1.getLength();
        System.out.println("The perimeter for rectangle 1 is " + perimeter1 + " feet");
        int perimeter2 = rect2.getWidth() + rect2.getLength();
        System.out.println("The perimeter for rectangle 2 is " + perimeter2 + " feet");
        int perimeter3 = rect3.getWidth() + rect3.getLength();
        System.out.println("The perimeter for rectangle 3 is " + perimeter3 + " feet");
        int perimeterTotal = perimeter1 + perimeter2 + perimeter3;
        System.out.println("The total length in fencing that will be needed to enclose all three plots of land is " + perimeterTotal + " feet");

        int area1 = rect1.getWidth() * rect1.getLength();
        System.out.println("The area for rectangle 1 is " + area1 + " feet");
        int area2 = rect2.getWidth() * rect2.getLength();
        System.out.println("The area for rectangle 2 is " + area2 + " feet");
        int area3 = rect3.getWidth() * rect3.getLength();
        System.out.println("The area for rectangle 3 is " + area3 + " feet");
        int totalArea = area1 + area2 + area3;
        System.out.println("The total area for all 3 rectangles are " + totalArea + " feet");

        rect1.calculateArea();
        rect2.calculateArea();
        rect3.calculateArea();
        int totalArea = rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea();
        System.out.println("The total area that will need seeding is " + totalArea + " square feet");


        rect1.getPerimeter();
        rect2.getPerimeter();
        rect3.getPerimeter();
        int totalPerimeter = rect1.getPerimeter() + rect2.getPerimeter() + rect3.getPerimeter();
        System.out.println(rect1.getPerimeter());
        System.out.println(rect2.getPerimeter());
        System.out.println(rect3.getPerimeter());
        */
        System.out.print("Number of boards needed: ");
        int numberOfBoards = s.nextInt();
        System.out.print("Number of windows needed: ");
        int numberOfWindows = s.nextInt();
        System.out.print("Tax Rate within area: ");
        int taxRate = s.nextInt();
        double percentTax = taxRate / 100.0;
        System.out.print("Percent tax rate is: " + percentTax);

        System.out.println( boardCost());




    }



    }

