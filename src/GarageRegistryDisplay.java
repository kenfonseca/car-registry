import java.util.*;

public class GarageRegistryDisplay {

    public static Garage garage = new Garage();
    public static Map<String,String> admins = new HashMap<>();

    public static void main(String args[]) {
        while(true){
            System.out.println("SELECT OPTION");
            System.out.println("\t1. Configure admin(s)\n\t2. Start garage display\n\t3. Quit");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    adminConfig();
                    break;
                case 2:
                    runGarageDisplay();
                case 3:
                    return;
                default:
                    System.out.println("Option not available. Try again");
            }
        }
    }

    public static void adminConfig(){
        System.out.println("\tEnter admin username (minimum length 3):");
        Scanner in = new Scanner(System.in);
        String adminName = in.next();
        while(adminName.length() < 3){
            System.out.println("\tAdmin username must be at least 3 characters in length:");
            adminName = in.next();
        }

        System.out.println("\tEnter admin password (minimum length 6):");
        String password = in.next();
        while(password.length() < 6){
            System.out.println("\tAdmin password must be at least 6 characters in length:");
            password = in.next();
        }

        admins.put(adminName, password);

    }

    public static void runGarageDisplay(){
        if(!login()){
            return;
        }
        while(true){
            System.out.println("GARAGE REGISTRY [ADMIN]");
            System.out.println("\t1. Set to user display\n\t2. Set to staff display\n\t3. Garage Options\n\t4. Exit");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    setToUserDisplay();
                    break;
                case 2:
                    // setToStaffDisplay()
                    break;
                case 3:
                    // garageOptions()
                case 4:
                    return;
                default:
                    System.out.println("Option not available. Try again");
            }
        }

    }
    public static void garageOptions(){
        System.out.println("GARAGE OPTIONS");
        System.out.println("\t1. Configure garage\n\t2. Delete garage\n\t3. Show Garage\n\t4. Exit");
    }

    public static void setToUserDisplay(){
        while(true){
            System.out.println("\nSCAN CREDENTIALS OR PRESS BUTTON FOR TICKET");
            System.out.println("\t1. Scan credentials\n\t2. Button\n\t3. Exit");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch(choice){
                case 1:
                    System.out.println("\tCredentials scanned, have a nice day!");
                    break;
                case 2:
                    System.out.println("Here's your ticket! Have a nice day!");
//                ticket.toString()
                    break;
                case 3:
                    if(login()){
                        return;
                    }
                    break;
                default:
                    System.out.println("Option not available. Try again");
            }
        }
    }

    public static boolean login(){
        Scanner in = new Scanner(System.in);
        System.out.println("\tEnter admin username:");
        String adminUser = in.next();
        while(admins.get(adminUser) == null){
            System.out.println("\tNo such admin username, please enter an admin username:");
            adminUser = in.next();
        }
        String adminPW = admins.get(adminUser);
        int tries = 3;
        System.out.println("\tEnter password:");
        String password = in.next();
        while(tries > 0 && !(adminPW.equals(password))){
            tries--;
            System.out.println("\tIncorrect password, try again [Tries: "+tries+"]:" );
            password = in.next();
        }
        return adminPW.equals(password);
    }

}


