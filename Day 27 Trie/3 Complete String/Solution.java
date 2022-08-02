import java.util.*;

class Node {
    public char c;
    public HashMap<Character, Node> hm;
    public boolean isLast;
    
    public Node(char a) {
        c = a;
        hm = new HashMap<>();
        isLast = false;
    }
}

class Solution {
    
    static Node root = new Node('A');
    public static void insert(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            if(!temp.hm.containsKey(word.charAt(i))) {
                Node t = new Node(word.charAt(i));
                temp.hm.put(word.charAt(i), t);
                
            }
            temp = temp.hm.get(word.charAt(i));
            if(i == word.length() - 1) temp.isLast = true;
        }
    }
    
    public static boolean search(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            if(!temp.hm.containsKey(word.charAt(i))) return false;
            temp = temp.hm.get(word.charAt(i));
            if(!temp.isLast) return false;
        }
        return true;
    }

  public static String completeString(int n, String[] a) {
      root = new Node('A');
      for(int i = 0; i < a.length; i++) {
          insert(a[i]);
      }
      StringBuilder s = new StringBuilder();
      for(int i = 0; i < a.length; i++) {
          if(search(a[i])) {
              if(a[i].length() > s.length()) s = new StringBuilder(a[i]);
              else if(a[i].length() == s.length()) {
                  if(s.toString().compareTo(a[i]) > 0) s = new StringBuilder(a[i]);
              } 
          }
      }
      
      String qq = s.toString();
      if(qq.length() == 0) return "None";
      return qq;
  }
}
