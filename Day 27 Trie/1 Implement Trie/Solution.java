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

public class Trie {


    //Initialize your data structure here
    static Node root;
    Trie() {
        root = new Node('A');
    }


    //Inserts a word into the trie

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


    //Returns if the word is in the trie

    public static boolean search(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            if(!temp.hm.containsKey(word.charAt(i))) return false;
            temp = temp.hm.get(word.charAt(i));
        }
        if(temp.isLast) return true;
        return false;
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            if(!temp.hm.containsKey(word.charAt(i))) return false;
            temp = temp.hm.get(word.charAt(i));
        }
        return true;
    }
}
