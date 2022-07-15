bool detectCycle(Node *head)
{
    if(head == NULL) return false;
        Node* slow = head;
        Node* fast = head;
        do {
            slow = slow->next;
            fast = fast->next;
            if(fast) fast = fast->next;
        } while(fast != NULL && fast != slow);
        if(fast) return true;
        return false;
}
