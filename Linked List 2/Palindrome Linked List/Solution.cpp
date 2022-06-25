#include <bits/stdc++.h> 

LinkedListNode<int>* reverse(LinkedListNode<int>* ptr) {
    LinkedListNode<int>* pre=NULL;
    LinkedListNode<int>* nex=NULL;
    while(ptr!=NULL) {
        nex = ptr->next;
        ptr->next = pre;
        pre=ptr;
        ptr=nex;
    }
    return pre;
}

bool isPalindrome(LinkedListNode<int> *head) {
    
    if(head == NULL) return true;
    
    // Write your code here.
    LinkedListNode<int>* slow = head;
        LinkedListNode<int>* fast = head;
        while(fast->next && fast->next->next) {
            fast = fast->next->next;
            slow = slow->next;
        }
        
        slow->next = reverse(slow->next);
        slow = slow->next;
        fast = head;
        while(slow != NULL) {
            if(slow->data == fast->data) {
                slow = slow->next;
                fast = fast->next;
            }
            else return false;
        }
        return true;
}
