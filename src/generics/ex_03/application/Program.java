package generics.ex_03.application;

import generics.ex_03.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();
        Map<Candidate, Integer> candidates = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.valueOf(fields[1]);
                Candidate candidate = new Candidate(name, votes);

                if (candidates.containsKey(candidate)) {
                    Integer existingVotes = candidates.get(candidate);
                    candidates.put(candidate, votes + existingVotes);
                } else {
                    candidates.put(candidate, votes);
                }
                line = br.readLine();
            }

            for (Map.Entry<Candidate, Integer> entry : candidates.entrySet()) {
                Candidate candidate = entry.getKey();
                Integer voteCount = entry.getValue();
                System.out.println(candidate.getName() + ": " + voteCount);
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
