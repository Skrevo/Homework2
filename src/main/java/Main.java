import broadcast.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        List<PartOfBroadcast> listOfParts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a name of broadcast:");
        String fileName = sc.next();
        Broadcast broadcast = new Broadcast(fileName.substring(0,fileName.length()-4), listOfParts);
        char c = 0;
        while (c != 'q') {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Write a name of broadcast part, name of singer(or author, or product name),name of song(if it is song)");
            String part = sc2.nextLine();
            String[] split = part.split(",");
            if (split[0].equals("Song")) {
                Song song = new Song(split[0],0,split[1],split[2]);
                System.out.println("Write a duration: ");
                song.setDuration(sc.nextDouble());
                listOfParts.add(song);
            }
            if (split[0].equals("Interview")) {
                Interview interview = new Interview(split[0],0,split[1]);
                System.out.println("Write a duration: ");
                interview.setDuration(sc.nextDouble());
                listOfParts.add(interview);
            }
            if (split[0].equals("Advertising")) {
                Advertising advertising = new Advertising(split[0],0,split[1]);
                System.out.println("Write a duration: ");
                advertising.setDuration(sc.nextDouble());
                listOfParts.add(advertising);
            }
            boolean check = check(listOfParts,broadcast);
            if (check)
                write(listOfParts, fileName);
            if (!check) {
                System.out.println("This broadcast is full!");
                listOfParts.remove(listOfParts.size()-1);
            }
            System.out.println("Type \"q\" to exit");
            c=sc.next().charAt(0);
        }
        System.out.println(broadcast);
    }

    private static boolean check(List<PartOfBroadcast> listOfParts, Broadcast broadcast) {
        double currentDuration = 0;
        double currentDurationOfPaidParts = 0;
        for (int i = 0; i < listOfParts.size(); i++) {
            double duration = listOfParts.get(i).getDuration();
            currentDuration += duration;
            if (listOfParts.get(i).getCost() != 0) {
                double durationOPP = listOfParts.get(i).getDuration();
                currentDurationOfPaidParts += durationOPP;
            }
        }
        if (currentDuration > broadcast.getMAX_DURATION())
            return false;
        return !(currentDurationOfPaidParts > (broadcast.getMAX_DURATION() / 2));
    }

    private static void write(List<PartOfBroadcast> listOfParts, String fileName) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < listOfParts.size(); i++) {
                bw.write(String.valueOf(listOfParts.get(i)));
                bw.newLine();
            }
        }
    }
}
