package algorithms.search;

import java.awt.*;
import java.util.ArrayList;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm{
    private int visitedNodes;

    /**
     * Constructor
     */
    public ASearchingAlgorithm() {
        visitedNodes=0;
    }

    @Override
    public int GetNumberOfVisitedNodes() {
        return visitedNodes;
    }

    protected ArrayList<AState> get_(AState curr){
        return null;

    }
}