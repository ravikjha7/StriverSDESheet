Node *addTwoNumbers(Node *l1, Node *l2)
{
    Node *ptr = new Node(0);
        Node *temp = ptr;
        int c = 0;
        while (l1 != NULL ||  l2 != NULL || c)
        {
            int sum = 0;
            if(l1 != NULL)
            {
                sum += l1->data;
                l1 = l1 -> next;
            }
            if(l2 != NULL)
            {
                sum += l2->data;
                l2 = l2 -> next;
            }
            sum += c;
            c = sum/10;
            Node *node = new Node(sum%10);
            temp -> next = node;
            temp = temp -> next;
        }
        return ptr -> next;
}
