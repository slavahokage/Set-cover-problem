package com.company;

import java.util.*;

public class SetCoverageService {

    private List<String> finalStations;

    private boolean noStationThatCanCoverState;

    public SetCoverageService() {
        this.finalStations = new ArrayList<>();
    }

    public List<String> findStationsToCoverageSet(Set<String> neededStations, Map<String, Set<String>> stations){

        while (!neededStations.isEmpty() && !noStationThatCanCoverState){
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            noStationThatCanCoverState = true;
            for (Map.Entry<String, Set<String>> station : stations.entrySet()) {

                Set<String> remainingStations = new HashSet<>(neededStations);
                remainingStations.retainAll(station.getValue());

                if (remainingStations.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered.clear();
                    statesCovered.addAll(remainingStations);
                    noStationThatCanCoverState = false;
                }
            }

            if (noStationThatCanCoverState){
                System.out.println("Sorry no one station can't cover this states -> " + neededStations);
            }

            finalStations.add(bestStation);
            neededStations.removeAll(statesCovered);
        }

        return finalStations;
    }
}
