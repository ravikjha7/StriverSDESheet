Node<int>* sortTwoLists(Node<int>* list1, Node<int>* list2)
{
    if(list1==NULL) return list2;
        if(list2==NULL) return list1;
        Node<int> *p = list1;
        Node<int> *q = list2;
        Node<int> *r;
        Node<int> *root ;
        if(list1->data<list2->data) 
        {
            r = list1;
            root = r;
            p = p->next;
        }
        else
        {
            r = list2;
            root = r;
            q = q->next;
        }
        while(p!=NULL && q!=NULL)
        {
            if(p->data<q->data)
            {
                r->next = p;
                r = r->next;
                p = p->next;
            }
            else
            {
                r->next = q;
                r = r->next;
                q = q->next;
            }
        }
        if(p!=NULL) r->next = p;
        if(q!=NULL) r->next = q;
        return root;
}
