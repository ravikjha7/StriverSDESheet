LinkedListNode<int>* removeKthNode(LinkedListNode<int> *head, int n)
{
    int l = 0;
    if(head == NULL) return head;
        LinkedListNode<int>* p = head;
        while(p != NULL) {
            l++;
            p = p->next;
        }
        if(n == l) return head->next;
    if(n == 0) return head;
        LinkedListNode<int>* q = head;
        n = l - n - 1;
        while(n--) {
            q = q->next;
        }
        q->next = q->next->next;
        return head;
}
