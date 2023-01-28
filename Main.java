package com.example.task04;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

        //Create empty tree set
        TreeSet<String> tree = new TreeSet<String>();

        //main method
        public static void main(String[] args) throws IOException {
            //Build Scanner method
            Scanner input = new Scanner(System.in);

            //Create an array
            String[] array = new String[18];

            //Put "0" for all elements of array
            for (int i = 0; i < 18; i++) {
                array[i] = "0";
            }
            //All fuel stock
            int allFuel = 6600;

            //Showing the current Fuel and if fuel is lower than 500 liters display a message
            STK(allFuel);


            //Display what user can input
            while (true) {
                System.out.println("\n---------Please enter one of these options---------\n\n");
                System.out.println("100 or VFQ: View all Fuel Queues.");
                System.out.println("101 or VEQ: View all Empty Queues.");
                System.out.println("102 or ACQ: Add customer to a Queue.");
                System.out.println("103 or RCQ: Remove a customer from a Queue. (From a specific location).");
                System.out.println("104 or PCQ: Remove a served customer.");
                System.out.println("105 or VCS: View Customers Sorted in alphabetical order.");
                System.out.println("106 or SPD: Store Program Data into file.");
                System.out.println("107 or LPD: Load Program Data from file.");
                System.out.println("108 or STK: View Remaining Fuel Stock.");
                System.out.println("109 or AFS: Add Fuel Stock.");
                System.out.println("999 or EXT: Exit the Program.\n");

                //Get user choice
                System.out.print("\nPlease enter your choice : ");
                String choice = input.next();
                System.out.println();

                //Calling the sub methods
                if ((choice.equals("099")  || (choice.equalsIgnoreCase("VGI")))) {
                    HelloApplication.main(args);
                }
                if ((choice.equals("100") || (choice.equalsIgnoreCase("VFQ")))) {
                    VFQ(array);
                }
                if ((choice.equals("101") || (choice.equalsIgnoreCase("VEQ")))) {
                    VEQ(array);
                }
                if ((choice.equals("102") || (choice.equalsIgnoreCase("ACQ")))) {
                    ACQ(array);
                }
                if ((choice.equals("103") || (choice.equalsIgnoreCase("RCQ")))) {
                    RCQ(array);
                }
                if ((choice.equals("104") || (choice.equalsIgnoreCase("PCQ")))) {
                    PCQ(array);
                }
                if ((choice.equals("105") || (choice.equalsIgnoreCase("VCS")))) {
                    new Main().VCS();
                }
                if ((choice.equals("106") || (choice.equalsIgnoreCase("SPD")))) {
                    SPD();
                }
                if ((choice.equals("107") || (choice.equalsIgnoreCase("LPD")))) {
                    LPD(array);
                }
                if ((choice.equals("108") || (choice.equalsIgnoreCase("STK")))) {
                    STK(allFuel);
                }
                if ((choice.equals("109") || (choice.equalsIgnoreCase("AFS")))) {
                    AFS(allFuel);
                }
                if ((choice.equals("999") || (choice.equalsIgnoreCase("EXT")))) {
                    EXT();
                    break;
                }
            }
        }
        //View all fuel queues
        public static void VFQ(String[] array) {
            System.out.println("\nYou are in view all fuels queues section (VFQ)\n");

            //Queue 01
            int count1 = 1;
            int pos1 = 0;
            while (count1 < 7) {
                System.out.println("Q1 " + count1 + " : " + array[pos1]);
                pos1++;
                count1++;
            }
            //Queue 02
            int pos2 = 6;
            int count2 = 1;
            while (count2 < 7) {
                System.out.println("Q2 " + count2 + " : " + array[pos2]);
                pos2++;
                count2++;
            }
            //Queue 03
            int pos3 = 12;
            int count3 = 1;
            while (count3 < 7) {
                System.out.println("Q3 " + count3 + " : " + array[pos3]);
                pos3++;
                count3++;
            }
        }
        //View all empty queues with the position
        public static void VEQ(String[] array) {
            System.out.println("\nYou are in view all empty queues section (VEQ)\n");

            //Queue 01
            int jk=6;
            for (int i = 0; i < 6; i++) {
                if (array[i] == "0") {
                    System.out.print("Q1 "+jk);
                    System.out.println(" is empty");
                    jk--;
                }
            }

            int l=6;
            for (int k = 6; k < 12; k++) {
                if (array[k] == "0") {
                    System.out.print("Q2 "+l);
                    System.out.println(" is empty");
                    l--;
                }
            }

            int n=6;
            for (int m = 12; m < 18; m++) {
                if (array[m] == "0") {
                    System.out.print("Q3 "+n);
                    System.out.println(" is empty");
                    n--;
                }
            }

        }
        //Add customer to a queue
        public static void ACQ(String[] array) throws IOException {
            System.out.println("\nYou are in add customer to a queue section (ACQ)\n");

            Scanner input = new Scanner(System.in);
            //User input
            System.out.print("Please enter your vehicle number : ");
            String vehicleNo = input.next();
            System.out.print("Please enter your name : ");
            String name = input.next();
            System.out.print("Please enter queue number that you want to add : ");
            int queueNum = input.nextInt();

            //Add to the separate queue that user want to go
            //Add to queue 01
            if (queueNum == 1) {
                for (int counts1 = 0; counts1 < 6; counts1++) {
                    if (array[counts1] == "0") {
                        array[counts1] = vehicleNo;
                        break;
                    }
                }
            }
            //Add to queue 02
            if (queueNum == 2) {
                for (int counts2 = 6; counts2 < 12; counts2++) {
                    if (array[counts2] == "0") {
                        array[counts2] = vehicleNo;
                        break;
                    }
                }
            }
            //Add to queue 03
            if (queueNum == 3) {
                for (int counts3 = 12; counts3 < 18; counts3++) {
                    if (array[counts3] == "0") {
                        array[counts3] = vehicleNo;
                        break;
                    }
                }
            }
            //Write data to a file
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\newfiles.txt", true));
                writer.write(vehicleNo + "\t\t" + name + "\t\t" + queueNum + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            writer.close();

            BufferedWriter writer1 = null;
            try {
                writer1 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\names.txt", true));
                writer1.write(name + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            writer1.close();
        }

        //Remove a customer to a specific location
        public static void RCQ(String[] array) {
            System.out.println("\nYou are in remove customer from a specific location section (RCQ)\n");

            //Get user input
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your current queue : ");
            int queue1 = input.nextInt();
            System.out.print("Enter your current position : ");
            int pos1 = input.nextInt();
            String vehi = "";

            //Remove a customer from the current location put "0" for the current location
            //Queue 01
            switch (queue1) {
                case 1: {
                    vehi = array[pos1 - 1];
                    array[pos1 - 1] = "0";
                    break;
                }
                //Queue 02
                case 2: {
                    pos1 = 7;
                    vehi = array[pos1 - 1];
                    array[pos1 - 1] = "0";
                    break;
                }
                //Queue 03
                case 3: {
                    pos1 = 13;
                    vehi = array[pos1 - 1];
                    array[pos1 - 1] = "0";
                    break;
                }
            }
            //User input
            System.out.print("Enter queue number that you want to go : ");
            int newqueue = input.nextInt();
            System.out.print("Enter position number that you want to go : ");
            int newpos = input.nextInt();

            //and customer to the location that he suggest
            switch (newqueue) {
                //Queue 01
                case 1: {
                    array[newpos - 1] = vehi;
                    break;
                }
                //Queue 02
                case 2: {
                    newpos = 6 + newpos;
                    array[newpos - 1] = vehi;
                    break;
                }
                //Queue 03
                case 3: {
                    newpos = newpos + 12;
                    array[newpos - 1] = vehi;
                    break;
                }
            }
        }
        //Remove a server customer.Put "0" for served customer
        public static void PCQ(String[] array) {
            System.out.println("\nYou are in remove a served customer section (PCQ)\n");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter your queue number to remove  : ");
            int queue = input.nextInt();
            System.out.print("Enter your position number to remove  : ");
            int pos = input.nextInt();

            //Queue 01
            if (queue == 1) {
                array[pos - 1] = "0";
            }
            //Queue 02
            if (queue == 2) {
                pos = 7;
                array[pos - 1] = "0";
            }
            //Queue 03
            if (queue == 3) {
                pos = 13;
                array[pos - 1] = "0";
            }
        }
        //Sort customer names in alphabetical order
        public void VCS() {
            System.out.println("\nYou are in view customer sorted in alphabetical order section(VCS)\n");

            getlist();
            System.out.println(tree);
        }

        void getlist() {
            try {
                File myfile = new File("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\names.txt");
                BufferedReader reader = new BufferedReader(new FileReader(myfile));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    addnames(line);
                }
                reader.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        void addnames(String a) {
            tree.add(a);
            for (int i = 1; i <= a.length(); i++) {
            }
        }
        //Store data into a file
        public static void SPD() {
            System.out.println("\nYou are in store program data into file section (SPD)\n");


            System.out.print("You stored data Successfully to the file \'ViewFile\' ");
        }


        //Load Program Data from file
        public static void LPD(String[] array) {
            System.out.println("\nYou are load program data from file section (LPD)\n");
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(
                        "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\newfiles.txt"));
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    // read next line
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //View Remaining Fuel Stock
        public static void STK(int allFuel) {
            System.out.println("\nYou are in view remaining fuel stock section (STK)\n");

            int count = 0;
            try {
                File veiwFile = new File("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\newfiles.txt");
                Scanner sc = new Scanner(veiwFile);
                while (sc.hasNextLine()) {
                    sc.nextLine();
                    count++;
                }
                sc.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
            //When user get fuel remove 10 liters
            int currentFuel = allFuel - count * 10;

            //Display message
            System.out.println("Remaining fuel stock : " + currentFuel + "\n");

            if (currentFuel <= 0) {
                currentFuel = 0;
                System.out.println("Remaining fuel stock : " + currentFuel + "\n");

                if (currentFuel < 500) {
                    System.out.println("Fuel stock is low than 500 liters");
                }
                if (currentFuel == 0) {
                    System.out.println("Fuel stock is finished");
                }
            }
        }
        public static void AFS(int allFuel) {
            System.out.println("\nYou are add fuel stock section (AFS)\n");
            Scanner input =new Scanner(System.in);
            System.out.print("How much do you want to add the fuel stock : ");
            int addFuel = input.nextInt();
            STK((int) (allFuel+addFuel));
        }

        public static void EXT() throws FileNotFoundException {
            System.out.println("\nYou exits from the program (EXT)\n");
            File file1 = new File("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\names.txt");
            PrintWriter writer1 = new PrintWriter(file1);
            writer1.print("");
            writer1.close();

        }
    }

