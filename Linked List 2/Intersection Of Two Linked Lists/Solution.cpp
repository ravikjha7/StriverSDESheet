int findIntersection(Node *firstHead, Node *secondHead)
{
    Node* p = firstHead;
    Node* q = secondHead;
        
        int count = 0;
        while(p != NULL) {
            count++;
            p = p->next;
        }
        
        int count2 = 0;
        while(q != NULL) {
            count2++;
            q = q->next;
        }
        p = firstHead;
        q = secondHead;
        if(count > count2) {
            int t = count - count2;
            while(t--) {
                p = p->next;
            }
        } else {
            int t = count2 - count;
            while(t--) {
                q = q->next;
            }
        }
        while(p != NULL && q != NULL && p != q) {
            p = p->next;
            q = q->next;
        }
        return (p?p->data:-1);
}
