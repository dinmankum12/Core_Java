package com.learning.core.day2session1;

import java.util.*;

public class D02P0505 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the strings separated by space:");
        String[] strings = scanner.nextLine().split(" ");
        scanner.close();
        
        String result = canFormCircle(strings) ? "Yes" : "No";
        System.out.println(result);
    }
 
    public static boolean canFormCircle(String[] strings) {
        if (strings == null || strings.length == 0)
            return false;
 
        Map<Character, List<String>> map = new HashMap<>();
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            map.putIfAbsent(firstChar, new ArrayList<>());
            map.get(firstChar).add(str);
            if (firstChar != lastChar) {
                map.putIfAbsent(lastChar, new ArrayList<>());
                map.get(lastChar).add(str);
            }
        }
 
        Set<String> visited = new HashSet<>();
        return dfs(strings[0], strings[0].charAt(0), map, visited);
    }
 
    private static boolean dfs(String current, char startChar, Map<Character, List<String>> map, Set<String> visited) {
        if (visited.contains(current))
            return false;
 
        visited.add(current);
        char lastChar = current.charAt(current.length() - 1);
        if (!map.containsKey(lastChar))
            return false;
 
        for (String next : map.get(lastChar)) {
            if (next.charAt(0) == startChar && visited.size() == map.size())
                return true;
            if (dfs(next, startChar, map, visited))
                return true;
        }
 
        visited.remove(current);
        return false;
    }
}
