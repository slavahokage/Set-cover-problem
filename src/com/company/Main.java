package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> neededStates = new HashSet<>();
        neededStates.add("mt");
        neededStates.add("wa");
        neededStates.add("or");
        neededStates.add("id");
        neededStates.add("nv");
        neededStates.add("ut");
        neededStates.add("ca");
        neededStates.add("az");
        neededStates.add("zopa");

        Map<String, Set<String>> stations = new HashMap<>();

        Set<String> kone = new HashSet<>();
        kone.add("id");
        kone.add("nv");
        kone.add("ut");

        Set<String> ktwo = new HashSet<>();
        ktwo.add("wa");
        ktwo.add("id");
        ktwo.add("mt");


        Set<String> ktree = new HashSet<>();
        ktree.add("or");
        ktree.add("nv");
        ktree.add("ca");

        Set<String> kfour = new HashSet<>();
        kfour.add("nv");
        kfour.add("ut");


        Set<String> kfive = new HashSet<>();
        kfive.add("ca");
        kfive.add("az");

        stations.put("kone", kone);
        stations.put("ktwo", ktwo);
        stations.put("ktree", ktree);
        stations.put("kfour", kfour);
        stations.put("kfive", kfive);

        SetCoverageService setCoverageService = new SetCoverageService();
        System.out.println(setCoverageService.findStationsToCoverageSet(neededStates, stations));

    }
}
