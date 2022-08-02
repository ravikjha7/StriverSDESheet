import java.util.*;

class Node {
    public char c;
    public HashMap<Character, Node> hm;
    public boolean isLast;
    public int count = 0;
    public int countF = 0;
    
    public Node(char a) {
        c = a;
        hm = new HashMap<>();
        isLast = false;
        count = 0;
        countF = 0;
    }
}

public class Trie {
    static Node root;
    
    public Trie() {
        root = new Node('A');
    }

    public void insert(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            if(!temp.hm.containsKey(word.charAt(i))) {
                Node t = new Node(word.charAt(i));
                temp.hm.put(word.charAt(i), t);
            }
            temp = temp.hm.get(word.charAt(i));
            temp.count += 1;
            if(i == word.length() - 1) 
            {
                temp.isLast = true;
                temp.countF += 1;
            }
        }
    }

    public int countWordsEqualTo(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            if(!temp.hm.containsKey(word.charAt(i))) return 0;
            temp = temp.hm.get(word.charAt(i));
        }
        return temp.countF;
    }

    public int countWordsStartingWith(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            if(!temp.hm.containsKey(word.charAt(i))) return 0;
            temp = temp.hm.get(word.charAt(i));
        }
        return temp.count;
    }

    public void erase(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            if(!temp.hm.containsKey(word.charAt(i))) return;
            temp = temp.hm.get(word.charAt(i));
            temp.count -= 1;
        }
        if(temp.isLast) {
            temp.isLast = false;
            temp.countF -= 1;
        }
    }

}
