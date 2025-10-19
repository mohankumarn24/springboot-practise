package net.projectsync.standalone;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] nums = numList.toArray(Integer[]::new);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
