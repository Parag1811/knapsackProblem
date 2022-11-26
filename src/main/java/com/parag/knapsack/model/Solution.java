package com.parag.knapsack.model;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    private final List<Integer> selectedItems;

    public Solution(List<Integer> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public List<Integer> getSelectedItems() {
        return selectedItems;
    }

    /**
     * sorts the selected items and gets them as a string.
     *
     * @return a string version of the solution.
     */
    public String toStringAndSort() {
        return !selectedItems.isEmpty() ? selectedItems.stream().sorted().map(String::valueOf).collect(Collectors.joining(",")) : "-";
    }

}