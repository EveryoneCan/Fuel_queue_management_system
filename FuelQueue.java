package com.example.task04;

import java.io.*;
import java.util.*;

public class FuelQueue {


    ArrayList<String> lines = new ArrayList<String>();

    public static void VFQ(Passenger[] array1, Passenger[] array2, Passenger[] array3, Passenger[] array4, Passenger[] array5) {
        System.out.println("\nYou are in view all fuels queues section (VFQ)\n");


        //Display first whole queue with values
        for(int k=1;k<7;k++){
            if(array1[k].getfirstName()==null){
                System.out.println("Queue 01 position "+k+" : Empty");
            }
            else {
                System.out.println("Queue 01 position " + k + " : name " + array1[k].getfirstName() + " " + array1[k].getsecondName() + " vehicle no " + array1[k].getvehicleNum());
            }

        }

        //Display second whole queue with values
        for(int k=1;k<7;k++){
            if(array2[k].getfirstName()==null){
                System.out.println("Queue 02 position "+k+" : Empty");
            }
            else {
                System.out.println("Queue 02 position " + k + " : name " + array2[k].getfirstName() + " " + array2[k].getsecondName() + " vehicle no " + array2[k].getvehicleNum());
            }

        }
        //Display third whole queue with values
        for(int k=1;k<6;k++){
            if(array3[k].getfirstName()==null){
                System.out.println("Queue 03 position "+k+" : Empty");
            }
            else {
                System.out.println("Queue 03 position " + k + " : name " + array5[k].getfirstName() + " " + array5[k].getsecondName() + " vehicle no " + array5[k].getvehicleNum());
            }

        }
        //Display fourth whole queue with values
        for(int k=1;k<7;k++){
            if(array4[k].getfirstName()==null){
                System.out.println("Queue 04 position "+k+" : Empty");
            }
            else {
                System.out.println("Queue 04 position " + k + " : name " + array4[k].getfirstName() + " " + array4[k].getsecondName() + " vehicle no " + array4[k].getvehicleNum());
            }

        }
        //Display fifth whole queue with values
        for(int k=1;k<6;k++){
            if(array5[k].getfirstName()==null){
                System.out.println("Queue 05 position "+k+" : Empty");
            }
            else {
                System.out.println("Queue 05 position " + k + " : name " + array5[k].getfirstName() + " " + array5[k].getsecondName() + " vehicle no " + array5[k].getvehicleNum());
            }

        }
    }

    //View all empty queues with the position
    public static void VEQ(Passenger[] array1, Passenger[] array2, Passenger[] array3, Passenger[] array4, Passenger[] array5) {
        System.out.println("You are in view all empty queues (VEQ)");

        //In queue 01
        for (int a = 1; a < array1.length; a++) {
            if (array1[a].getfirstName() == null) {
                System.out.println("Queue 01 position " + a + " : Empty");
            }
        }

        //In queue 02
        for (int b = 1; b < array2.length; b++) {
            if (array2[b].getfirstName() == null) {
                System.out.println("Queue 02 position " + b + " : Empty");
            }
        }
        //In queue 03
        for (int c = 1; c < array3.length; c++) {
            if (array3[c].getfirstName() == null) {
                System.out.println("Queue 03 position " + c + " : Empty");
            }
        }
        //In queue 04
        for (int d = 1; d < array4.length; d++) {
            if (array4[d].getfirstName() == null) {
                System.out.println("Queue 04 position " + d + " : Empty");
            }
        }
        //In queue 05
        for (int e = 1; e < array5.length; e++) {
            if (array5[e].getfirstName() == null) {
                System.out.println("Queue 05 position " + e + " : Empty");
            }
        }
    }


    //Add customer to a queue
    public static void ACQ(String[]array,Passenger[] array1, Passenger[] array2, Passenger[] array3, Passenger[] array4, Passenger[] array5) throws IOException {
        System.out.println("You are in add customer to a queue (ACQ)");

        Scanner input = new Scanner(System.in);

        //User input
        System.out.println("Please enter your first name  :");
        String UserFirstName = input.next();

        System.out.println("Please enter your second name  :");
        String UserSecondName = input.next();

        System.out.println("Please enter your vehicle name  :");
        String VehicleNo = input.next();

        //Check whether if user input integer or not
        double litersRequired;
        while (true) {
            System.out.println("Please enter number of liters that you want  :");
            try {
                litersRequired = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter an integer or double value.");
                input = new Scanner(System.in);
            }
        }


        //Array one count null values
        int count1 = 0;
        for (int a = 0; a < array1.length; a++) {
            if (array1[a].getfirstName() == null) {
                count1++;
            }
        }

        //Array two count null values
        int count2 = 0;
        for (int b = 0; b < array2.length; b++) {
            if (array2[b].getfirstName() == null) {
                count2++;
            }
        }

        //Array three count null values
        int count3 = 0;
        for (int c = 0; c < array3.length; c++) {
            if (array3[c].getfirstName() == null) {
                count3++;
            }
        }

        //Array four count null values
        int count4 = 0;
        for (int d = 0; d < array4.length; d++) {
            if (array4[d].getfirstName() == null) {
                count4++;
            }
        }
        //Array four count null values
        int count5 = 0;
        for (int d = 0; d < array5.length; d++) {
            if (array5[d].getfirstName() == null) {
                count5++;
            }
        }

        //Waiting queue
        System.out.println(count1);
        if(count1==1 && count2==1){
            System.out.println("You were added to waiting queue");
            for (int i = 1; i < 20; i++) {
                if(array[i] == "Empty"){
                    array[i]=UserFirstName;
                    break;
                }
            }
            System.out.println(array[1]+"\n"+array[2]+"\n"+array[3]+"\n"+array[4]+"\n"+array[5]+"\n"+array[6]+"\n"+array[7]+"\n"+array[8]+"\n"+array[9]+"\n"+array[10]+"\n"+array[11]+"\n"+array[12]+"\n"+array[13]+"\n"+array[14]+"\n"+array[15]+"\n"+array[16]+"\n"+array[17]+"\n"+array[18]+"\n"+array[19]);

        }
        else if (count1 > count2 && count1 > count3) {
            for (int b = 1; b < 7; b++) {
                if (array1[b].getfirstName() == null) {
                    array1[b].setfirstName(UserFirstName);


                    System.out.println("You were added to queue 01 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue01.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count2 > count1) {
            for (int b = 1; b < 7; b++) {
                if (array2[b].getfirstName() == null) {
                    array2[b].setfirstName(UserFirstName);


                    System.out.println("You were added to queue 02 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue02.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count1 == count2) {
            for (int b = 1; b < 7; b++) {
                if (array1[b].getfirstName() == null) {
                    array1[b].setfirstName(UserFirstName);


                    System.out.println("You were added to queue 01 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue01.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count1 > count2) {
            for (int b = 1; b < 7; b++) {
                if (array3[b].getfirstName() == null) {
                    array3[b].setfirstName(UserFirstName);

                    System.out.println("You were added to queue 03 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue03.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }

        }
        //Processing part
        if (count5 > count1 && count5 > count2 && count5 > count3 && count5 > count4) {
            for (int f = 1; f < 7; f++) {
                if (array5[f].getfirstName() == null) {
                    array5[f].setfirstName(UserFirstName);
                    array5[f].setsecondName(UserSecondName);
                    array5[f].setvehicleNum(VehicleNo);

                    System.out.println("You were added to queue 05 position " + f);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue05.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count4 > count1 && count4 > count2 && count4 > count3) {
            for (int d = 1; d < 7; d++) {
                if (array4[d].getfirstName() == null) {
                    array4[d].setfirstName(UserFirstName);
                    array4[d].setsecondName(UserSecondName);
                    array4[d].setvehicleNum(VehicleNo);
                    BufferedWriter writerqueue01 = null;

                    System.out.println("You were added to queue 04 position " + d);

                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue04.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count1 > count2 && count1 > count3) {
            for (int b = 1; b < 7; b++) {
                if (array1[b].getfirstName() == null) {
                    array1[b].setfirstName(UserFirstName);
                    array1[b].setsecondName(UserSecondName);
                    array1[b].setvehicleNum(VehicleNo);

                    System.out.println("You were added to queue 01 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue01.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count2 > count1 && count2 > count3) {
            for (int b = 1; b < 7; b++) {
                if (array2[b].getfirstName() == null) {
                    array2[b].setfirstName(UserFirstName);
                    array2[b].setsecondName(UserSecondName);
                    array2[b].setvehicleNum(VehicleNo);

                    System.out.println("You were added to queue 02 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue02.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count1 == count2 && count1 == count3) {
            for (int b = 1; b < 7; b++) {
                if (array1[b].getfirstName() == null) {
                    array1[b].setfirstName(UserFirstName);
                    array1[b].setsecondName(UserSecondName);
                    array1[b].setsecondName(UserSecondName);
                    array1[b].setvehicleNum(VehicleNo);

                    System.out.println("You were added to queue 01 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue01.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count3 > count1 && count3 > count2) {
            for (int b = 1; b < 7; b++) {
                if (array3[b].getfirstName() == null) {
                    array3[b].setfirstName(UserFirstName);
                    array3[b].setsecondName(UserSecondName);
                    array3[b].setvehicleNum(VehicleNo);

                    System.out.println("You were added to queue 03 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue03.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        } else if (count2 == count3) {
            for (int b = 1; b < 7; b++) {
                if (array2[b].getfirstName() == null) {
                    array2[b].setfirstName(UserFirstName);
                    array2[b].setsecondName(UserSecondName);
                    array2[b].setvehicleNum(VehicleNo);

                    System.out.println("You were added to queue 02 position " + b);

                    BufferedWriter writerqueue01 = null;
                    try {
                        writerqueue01 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue02.txt", true));
                        writerqueue01.write(litersRequired + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writerqueue01.close();

                    break;
                }
            }
        }
        //Store liters that user get into an array
        BufferedWriter writer12 = null;
        try {
            writer12 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\literRequired.txt", true));
            writer12.write(litersRequired + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer12.close();


        //Write whole data to a file
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\Task02newfiles.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.close();

        //Store user input names in a file
        BufferedWriter writer1 = null;
        try {
            writer1 = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\Task02names.txt", true));
            writer1.write(UserFirstName + " " + UserSecondName + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer1.close();
    }
    public static void RCQ(Passenger[] array1, Passenger[] array2, Passenger[] array3, Passenger[] array4, Passenger[] array5) {

        //Get queue number
        Scanner input = new Scanner(System.in);
        int queueNum;
        while (true) {
            System.out.print("Enter your current queue number (1-5) : ");
            try {
                queueNum = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter number between 0 to 6.");
                input = new Scanner(System.in);
            }
        }
        //Get position number
        int position;
        while (true) {
            System.out.print("Enter your current position (1-6) :");
            try {
                position = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter number between 0 to 7.");
                input = new Scanner(System.in);
            }
        }
        //Get  new queue number
        int newQueueNum;
        while (true) {
            System.out.print("Enter queue number that you want to go (1-5) : ");
            try {
                newQueueNum = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter number between 0 to 6.");
                input = new Scanner(System.in);
            }
        }
        //Get  new position number
        int newPosition;
        while (true) {
            System.out.print("Enter queue number that you want to go (1-5) : ");
            try {
                newPosition = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter number between 0 to 6.");
                input = new Scanner(System.in);
            }
        }

        //If user current queue number is 1
        if (queueNum == 1) {
            String x = array1[position].getfirstName();
            if (newQueueNum == 1) {
                array1[newPosition].setfirstName(x);
            }
            if (newQueueNum == 2) {
                array2[newPosition].setfirstName(x);
            }
            if (newQueueNum == 3) {
                array3[newPosition].setfirstName(x);
            }
            if (newQueueNum == 4) {
                array4[newPosition].setfirstName(x);
            }
            if (newQueueNum == 5) {
                array5[newPosition].setfirstName(x);
            }
            array1[position].setfirstName(null);
        }
        //If user current queue number is 2
        if (queueNum == 2) {
            String x = array2[position].getfirstName();
            if (newQueueNum == 1) {
                array1[newPosition].setfirstName(x);
            }
            if (newQueueNum == 2) {
                array2[newPosition].setfirstName(x);
            }
            if (newQueueNum == 3) {
                array3[newPosition].setfirstName(x);
            }
            if (newQueueNum == 4) {
                array4[newPosition].setfirstName(x);
            }
            if (newQueueNum == 5) {
                array5[newPosition].setfirstName(x);
            }
            array2[position].setfirstName(null);
        }
        //If user current queue number is 3
        if (queueNum == 3) {
            String x = array3[position].getfirstName();
            if (newQueueNum == 1) {
                array1[newPosition].setfirstName(x);
            }
            if (newQueueNum == 2) {
                array2[newPosition].setfirstName(x);
            }
            if (newQueueNum == 3) {
                array3[newPosition].setfirstName(x);
            }
            if (newQueueNum == 4) {
                array4[newPosition].setfirstName(x);
            }
            if (newQueueNum == 5) {
                array5[newPosition].setfirstName(x);
            }
            array3[position].setfirstName(null);
        }
        //If user current queue number is 4
        if (queueNum == 4) {
            String x = array4[position].getfirstName();
            if (newQueueNum == 1) {
                array1[newPosition].setfirstName(x);
            }
            if (newQueueNum == 2) {
                array2[newPosition].setfirstName(x);
            }
            if (newQueueNum == 3) {
                array3[newPosition].setfirstName(x);
            }
            if (newQueueNum == 4) {
                array4[newPosition].setfirstName(x);
            }
            if (newQueueNum == 5) {
                array5[newPosition].setfirstName(x);
            }
            array4[position].setfirstName(null);
        }
        //If user current queue number is 5
        if (queueNum == 5) {
            String x = array5[position].getfirstName();
            if (newQueueNum == 1) {
                array1[newPosition].setfirstName(x);
            }
            if (newQueueNum == 2) {
                array2[newPosition].setfirstName(x);
            }
            if (newQueueNum == 3) {
                array3[newPosition].setfirstName(x);
            }
            if (newQueueNum == 4) {
                array4[newPosition].setfirstName(x);
            }
            if (newQueueNum == 5) {
                array5[newPosition].setfirstName(x);
            }
            array5[position].setfirstName(null);
        }
    }
    //Remove a served customer from a queue
    public static void PCQ(Passenger[] array1, Passenger[] array2, Passenger[] array3, Passenger[] array4, Passenger[] array5) {
        System.out.println("You are in remove a served customer (PCQ)");

        //Get queue number
        Scanner input = new Scanner(System.in);
        int queueNum;
        while (true) {
            System.out.print("Enter your current queue number (1-5) : ");
            try {
                queueNum = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter number between 0 to 6.");
                input = new Scanner(System.in);
            }
        }

        //Get position number
        int position;
        while (true) {
            System.out.print("Enter your current position (1-6) :");
            try {
                position = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter number between 0 to 7.");
                input = new Scanner(System.in);
            }
        }

        //Do process
        if (queueNum == 1) {
            array1[position].getfirstName();
            array1[position].setfirstName(null);
            array1[position].setsecondName(null);
            array1[position].setvehicleNum(null);
        }
        if (queueNum == 2) {
            array2[position].getfirstName();
            array2[position].setfirstName(null);
        }
        if (queueNum == 3) {
            array3[position].getfirstName();
            array3[position].setfirstName(null);
        }
        if (queueNum == 4) {
            array4[position].getfirstName();
            array4[position].setfirstName(null);
        }
        if (queueNum == 5) {
            array5[position].getfirstName();
            array5[position].setfirstName(null);
        }

    }

    //View customers sorted in alphabetical
    public void VCS() {
        System.out.println("You are in view customer sorted in alphabetical order (VCS)");

        BufferedReader reader = null;
        BufferedWriter writer = null;


        try {
            //Creating BufferedReader object to read the input file
            reader = new BufferedReader(new FileReader("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\Task02names.txt"));

            //Reading all the lines of input file one by one and adding them into ArrayList
            String currentLine = reader.readLine();
            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }

            //Sorting the ArrayList
            Collections.sort(lines);

            //Creating BufferedWriter object to write into output file
            writer = new BufferedWriter(new FileWriter("D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\SortedNames.txt"));

            //Writing sorted lines into output file
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            //Closing the resources
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            reader = new BufferedReader(new FileReader(
                    "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\SortedNames.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    //Store program data into file
    public static void SPD() {
        System.out.println("You are in store program data into file (SPD)");

        System.out.print("You stored data Successfully to the file \'Task02newfiles\' ");
    }

    //Load program data from file
    public static void LPD() {
        System.out.println("You are load program data from file (LPD)");
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\Task02newfiles.txt"));
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
    public static void STK(double allFuel) {
        System.out.println("You are in view remaining fuel stock (STK)");


        String fileName = "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\literRequired.txt";

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));) {
            double sum = 0;

            while (true) {
                String lineRead = fileReader.readLine();
                if (lineRead == null) {
                    // End of file is reached
                    break;//w  w w.  j ava  2 s.  com
                }
                double num = Double.parseDouble(lineRead);
                sum += num;
            }// end of while
            double currentFuel = allFuel - sum;


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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Add fuel stock
    public static void AFS(double allFuel) {
        System.out.println("You are add fuel stock (AFS)");

        Scanner input = new Scanner(System.in);
        double addFuel;
        while (true) {
            System.out.print("How much do you want to add the fuel stock : ");
            try {
                addFuel = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter decimal value");
                input = new Scanner(System.in);
            }
        }
        STK((double) (allFuel + addFuel));
    }

    //Add Fuel Stock
    public static void IFQ( double allFuel) {
        System.out.println("You are in income of each Fuel queue (IFQ)");

        Scanner input = new Scanner(System.in);



        //Get queue number

        int queueNum;
        while (true) {
            System.out.print("In which queue do you want to see the income (between 0-6): ");
            try {
                queueNum = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid input. Please enter number between 0 to 6.");
                input = new Scanner(System.in);
            }
        }
        //Queue 01
        if (queueNum == 1) {
            String fileName = "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue01.txt";
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));) {
                double sum = 0;
                while (true) {
                    String lineRead = fileReader.readLine();
                    if (lineRead == null) {
                        // End of file is reached
                        break;
                    }
                    double num = Double.parseDouble(lineRead);
                    sum += num;
                }// end of while

                System.out.println("Income of this queue is :" +sum * 430);
            }// end of try block

            catch (IOException ioex) {
                System.err.println("Error");
            }
        }
        //Queue 02
        if (queueNum == 2) {
            String fileName1 = "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue02.txt";
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));) {
                double sum = 0;
                while (true) {
                    String lineRead = fileReader.readLine();
                    if (lineRead == null) {
                        // End of file is reached
                        break;
                    }
                    double num = Double.parseDouble(lineRead);
                    sum += num;
                }// end of while

                System.out.println("Income of this queue is :" +sum * 430);
            }// end of try block

            catch (IOException ioex) {
                System.err.println("Error");
            }
        }
        //Queue 03
        if (queueNum == 3) {
            String fileName3 = "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue03.txt";
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName3));) {
                double sum = 0;
                while (true) {
                    String lineRead = fileReader.readLine();
                    if (lineRead == null) {
                        // End of file is reached
                        break;
                    }
                    double num = Double.parseDouble(lineRead);
                    sum += num;
                }// end of while

                System.out.println("Income of this queue is :" +sum * 430);
            }// end of try block

            catch (IOException ioex) {
                System.err.println("Error");
            }
        }
        //Queue 03
        if (queueNum == 4) {
            String fileName4 = "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue04.txt";
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName4));) {
                double sum = 0;
                while (true) {
                    String lineRead = fileReader.readLine();
                    if (lineRead == null) {
                        // End of file is reached
                        break;
                    }
                    double num = Double.parseDouble(lineRead);
                    sum += num;
                }// end of while

                System.out.println("Income of this queue is :" +sum * 430);
            }// end of try block

            catch (IOException ioex) {
                System.err.println("Error");
            }
        }
        //Queue 05
        if (queueNum == 5) {
            String fileName5 = "D:\\IIT\\sem2\\4COSC010C Software Development II\\Java\\CourseWork\\CW\\FuelQueueManagemnt\\queue05.txt";
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName5));) {
                double sum = 0;
                while (true) {
                    String lineRead = fileReader.readLine();
                    if (lineRead == null) {
                        // End of file is reached
                        break;
                    }
                    double num = Double.parseDouble(lineRead);
                    sum += num;
                }// end of while

                System.out.println("Income of this queue is :" +sum * 430);
            }// end of try block

            catch (IOException ioex) {
                System.err.println("Error");
            }
        }
    }
    //Exit the Program
    public static void EXT()  {
        System.out.println("You exits from the program");
    }
}
