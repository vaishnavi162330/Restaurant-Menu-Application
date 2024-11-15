
import java.util.Scanner;

class Menu {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int fp = 0;

        System.out.println("Welcome to Mahi's Restaurant.");

        System.out.println("Please select the category of items you want to order:");
        System.out.println("1. Appetizers");
        System.out.println("2. Soups");
        System.out.println("3. Salads");
        System.out.println("4. Main Course");
        System.out.println("5. Chinese Specialties");
        System.out.println("6. Italian Delights");
        System.out.println("7. South Indian Favorites");
        System.out.println("8. Desserts");
        System.out.print("9. Beverages \n ->");

        int MainChoice = s.nextInt();

        if (MainChoice == 1) {

            System.out.println("\nEnter the item number to order from Appetizers.");
            System.out.print("\t1.1 Vegetable Samosa. \t 50/- \n\t1.2 Paneer Tikka.  \t 150/-  \n\t1.3 Aloo Tikki Chaat. \t 80/- \n\t1.4 Hara Bhara Kabab. \t 120/- \n\t1.5 Spring Rolls. \t 100/- \n\t ->");
            String Appetizers = s.next();
            System.out.print("\tEnter the quantity you want to order: \n\t -> ");
            int q = s.nextInt();

            switch (Appetizers) {

                case "1.1":
                    System.out.println("1.1 Vegetable Samosa, Quantity: " + q);
                    fp = 50 * q;
                    break;
                case "1.2":
                    System.out.println("1.2 Paneer Tikka, Quantity: " + q);
                    fp = 150 * q;
                    break;
                case "1.3":
                    System.out.println("1.3 Aloo Tikki Chaat, Quantity: " + q);
                    fp = 80 * q;
                    break;
                case "1.4":
                    System.out.println("1.4 Hara Bhara Kabab, Quantity: " + q);
                    fp = 120 * q;
                    break;
                case "1.5":
                    System.out.println("1.5 Spring Rolls, Quantity: " + q);
                    fp = 100 * q;
                    break;
                default:
                    System.out.println("Invalid choice! Please select correct option to order Appetizer.");
                    break;
            }
        } else if (MainChoice == 2) {

            System.out.println("\n\tEnter the item number to order: ");
            System.out.print("\t2.1 Tomato Basil Soup. \t\t 90/-  \n\t2.2 Sweet Corn Soup. \t\t 100/-  \n\t2.3 Vegetable Clear Soup. \t 80/- \n\t2.4 Cream of Mushroom Soup. \t 110/-  \n\t2.5 Manchurian Soup. \t\t 140/- \n\t -> ");
            String Soups = s.next();

            System.out.print("\tEnter the quantity you want to order: \n\t ->");
            int q = s.nextInt();

            switch (Soups) {
                case "2.1":
                    System.out.println("2.1 Tomato Basil Soup, Quantity:  " + q);
                    fp = 90 * q;
                    break;

                case "2.2":
                    System.out.println("2.2 Sweet Corn Soup, Quantity: " + q);
                    fp = 100 * q;
                    break;

                case "2.3":
                    System.out.println("2.3 Vegetable Clear Soup, Quantity:  " + q);
                    fp = 80 * q;
                    break;

                case "2.4":
                    System.out.println("2.4 Cream of Mushroom Soup, Quantity:  " + q);
                    fp = 110 * q;
                    break;

                case "2.5":
                    System.out.println("2.5 Manchurian Soup, Quantity:  " + q);
                    fp = 150 * q;
                    break;

                default:
                    System.out.println("Invalid choice! Please select correct option to order Soups.");
                    break;
            }
        } else if (MainChoice == 3) {

            System.out.println("\n\tEnter the item number to order from Salads:)");
            System.out.print("\t3.1 Greek Salad. \t\t 130/- \n\t3.2 Chickpea Salad. \t\t 100/-  \n\t3.3 Garden Green Salad. \t 90/- \n\t3.4 Fruit and Nut Salad. \t 120/- \n\t3.5 Fruit Salad. \t\t 180/- \n\t ->");
            String Salads = s.next();

            System.out.print("\tEnter the quantity you want to order: \n\t -> ");
            int q = s.nextInt();

            switch (Salads) {
                case "3.1":
                    System.out.println("3.1 Greek Salad, Quantity:  " + q);
                    fp = 130 * q;
                    break;

                case "3.2":
                    System.out.println("3.2 Chickpea Salad, Quantity: " + q);
                    fp = 100 * q;
                    break;

                case "3.3":
                    System.out.println("3.3 Vegetable Clear Soup, Quantity:  " + q);
                    fp = 90 * q;
                    break;

                case "3.4":
                    System.out.println("3.4 Cream of Mushroom Soup, Quantity:  " + q);
                    fp = 120 * q;
                    break;

                case "3.5":
                    System.out.println("3.5 Manchurian Soup, Quantity:  " + q);
                    fp = 180 * q;
                    break;

                default:
                    System.out.println("Invalid choice! Please select correct option to order Salads.");
                    break;
            }
        } else if (MainChoice == 4) {

            System.out.println("\n\tEnter the item number to order from Main Course:)");
            System.out.print("\t4.1 Paneer Butter Masala. \t 180/- \n\t4.2 Chole Bhature. \t\t 160/- \n\t4.3 Dal Makhani. \t\t 150/- \n\t4.4 Aloo Gobi. \t\t\t 140/- \n\t4.5 Malai Kofta. \t\t 170/- \n\t ->");
            String MainCourse = s.next();

            System.out.print("\tEnter the quantity you want to order:  \n\t ->");
            int q = s.nextInt();

            switch (MainCourse) {
                case "4.1":
                    System.out.println("4.1 Paneer Butter Masala, Quantity:  " + q);
                    fp = 180 * q;
                    break;

                case "4.2":
                    System.out.println("4.2 Chole Bhature, Quantity: " + q);
                    fp = 160 * q;
                    break;

                case "4.3":
                    System.out.println("4.3 Dal Makhani, Quantity:  " + q);
                    fp = 150 * q;
                    break;

                case "4.4":
                    System.out.println("4.4 Aloo Gobi, Quantity:  " + q);
                    fp = 140 * q;
                    break;

                case "4.5":
                    System.out.println("4.5 Malai Kofta, Quantity:  " + q);
                    fp = 170 * q;
                    break;

                default:
                    System.out.println("Invalid choice! Please select correct option to order Main Course.");
                    break;
            }
        } else if (MainChoice == 5) {

            System.out.println("\n\tEnter the item number to order from Chinese Specialties.");
            System.out.print("\t5.1 Veg Hakka Noodles. \t\t\t 120/- \n\t5.2 Schezwan Fried Rice. \t\t 130/- \n\t5.3 Manchurian Gravy with Fried Rice. \t 150/- \n\t5.4 Stir-Fried Vegetables. \t\t 110/-  \n\t5.5 Kolhapuri Fried Rice. \t\t 170/- \n\t ->");
            String ChineseSpecialties = s.next();

            System.out.print("\tEnter the quantity you want to order: \n\t ->");
            int q = s.nextInt();

            switch (ChineseSpecialties) {
                case "5.1":
                    System.out.println("5.1 Veg Hakka Noodles, Quantity:  " + q);
                    fp = 120 * q;
                    break;

                case "5.2":
                    System.out.println("5.2 Schezwan Fried Rice, Quantity: " + q);
                    fp = 130 * q;
                    break;

                case "5.3":
                    System.out.println("5.3 Manchurian Gravy with Fried Rice, Quantity:  " + q);
                    fp = 150 * q;
                    break;

                case "5.4":
                    System.out.println("5.4 Stir-Fried Vegetables, Quantity:  " + q);
                    fp = 110 * q;
                    break;

                case "5.5":
                    System.out.println("5.5 Kolhapuri Fried Rice, Quantity:  " + q);
                    fp = 170 * q;
                    break;

                default:
                    System.out.println("Invalid choice! Please select correct option to order Chinese Specialties.");
                    break;
            }
        } else if (MainChoice == 6) {

            System.out.println("\n\tEnter the item number to order from Italian Delights.");
            System.out.print("\t6.1 Margherita Pizza. \t\t\t 200/- \n\t6.2 Veggie Delight Pasta.  \t\t 180/- \n\t6.3 Spinach and Ricotta Ravioli.  \t 190/- \n\t6.4 Lasagna. \t\t\t 220/- \n\t ->");
            String ItalianDelights = s.next();

            System.out.print("\tEnter the quantity you want to order:\n\t ->");
            int q = s.nextInt();

            switch (ItalianDelights) {
                case "6.1":
                    System.out.println("6.1 Margherita Pizza, Quantity:  " + q);
                    fp = 200 * q;
                    break;

                case "6.2":
                    System.out.println("6.2 Veggie Delight Pasta, Quantity: " + q);
                    fp = 180 * q;
                    break;

                case "6.3":
                    System.out.println("6.3 Spinach and Ricotta Ravioli, Quantity:  " + q);
                    fp = 190 * q;
                    break;

                case "6.4":
                    System.out.println("6.4 Lasagna, Quantity:  " + q);
                    fp = 220 * q;
                    break;

                default:
                    System.out.println("Invalid choice! Please select correct option to order Italian Delights.");
                    break;
            }
        } else if (MainChoice == 7) {

            System.out.println("\n\tEnter the item number to order from South Indian Favorites");
            System.out.print("\t7.1 Masala Dosa. \t\t 80/-  \n\t7.2 Idli with Coconut Chutney. \t 60/-  \n\t7.3 Medu Vada.  \t\t 70/-  \n\t7.4 Sambar Rice. \t\t 100/- \n\t -> ");
            String SouthIndian = s.next();

            System.out.print("\tEnter the quantity you want to order: \n\t -> ");
            int q = s.nextInt();

            switch (SouthIndian) {
                case "7.1":
                    System.out.println("7.1 Masala Dosa, Quantity:  " + q);
                    fp = 80 * q;
                    break;

                case "7.2":
                    System.out.println("7.2 Idli with Coconut Chutney, Quantity: " + q);
                    fp = 60 * q;
                    break;

                case "7.3":
                    System.out.println("7.3 Medu Vada, Quantity:  " + q);
                    fp = 70 * q;
                    break;

                case "7.4":
                    System.out.println("7.4 Sambar Rice, Quantity:  " + q);
                    fp = 100 * q;
                    break;

                default:
                    System.out.println("Invalid choice! Please select correct option to order South Indian Favorites.");
                    break;
            }
        } else if (MainChoice == 8) {

            System.out.println("\n\tEnter the item number to order from Desserts.");
            System.out.print("\t8.1 Gulab Jamun. \t\t 50/-  \n\t8.2 Ras Malai. \t\t\t 70/- \n\t8.3 Fruit Custard. \t\t 60/- \n\t8.4 Chocolate Brownie. \t\t 80/- \n\t8.5 Ice Cream Selection. \t 90/- \n\t ->");
            String Desserts = s.next();

            System.out.print("\tEnter the quantity you want to order: \n\t -> ");
            int q = s.nextInt();

            switch (Desserts) {
                case "8.1":
                    System.out.println("8.1 Gulab Jamun, Quantity:  " + q);
                    fp = 50 * q;
                    break;

                case "8.2":
                    System.out.println("8.2 Ras Malai, Quantity: " + q);
                    fp = 70 * q;
                    break;

                case "8.3":
                    System.out.println("8.3 Fruit Custard, Quantity:  " + q);
                    fp = 60 * q;
                    break;

                case "8.4":
                    System.out.println("8.4 Chocolate Brownie, Quantity:  " + q);
                    fp = 80 * q;
                    break;

                case "8.5":
                    System.out.println("8.5 Ice Cream Selection, Quantity:  " + q);
                    fp = 90 * q;

                    break;

                default:
                    System.out.println("Invalid choice! Please select correct option to order Desserts.");
                    break;
            }
        } else if (MainChoice == 9) {

            System.out.println("\n\tEnter the item number to order from Beverages.");
            System.out.print("\t9.1 Fresh Lime Soda. \t 50/-  \n\t9.2 Mango Lassi. \t 70/-  \n\t9.3 Masala Chai. \t 30/-  \n\t9.4 Coffee. \t\t 40/-  \n\t9.5 Soft Drinks. \t 20/- \n\t -> ");
            String Beverages = s.next();

            System.out.print("\tEnter the quantity you want to order: \n\t -> ");
            int q = s.nextInt();

            switch (Beverages) {
                case "9.1":
                    System.out.println("9.1 Fresh Lime Soda, Quantity:  " + q);
                    fp = 50 * q;
                    break;

                case "9.2":
                    System.out.println("9.2 Mango Lassi, Quantity: " + q);
                    fp = 70 * q;
                    break;

                case "9.3":
                    System.out.println("9.3 Masala Chai, Quantity:  " + q);
                    fp = 30 * q;
                    break;

                case "9.4":
                    System.out.println("9.4 Coffee, Quantity:  " + q);
                    fp = 40 * q;
                    break;

                case "9.5":
                    System.out.println("9.5 Soft Drinks, Quantity:  " + q);
                    fp = 20 * q;
                    break;

                default:
                    System.out.println("Invalid choice! Please select correct option to order Beverages.");
                    break;
            }

        }
        System.out.println("\nTotal Price is: " + fp);
        System.out.println("\nThank you for visiting Mahi's Restraunt. ");
    }
}
