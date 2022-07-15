Node *findMiddle(Node *head) {
    Node* slow = head, *fast = head;
    while(fast && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next;
        if(fast) fast = fast->next;
    }
    return slow;
}
