#include <bits/stdc++.h> 
/*************************************************************

    Following is the LinkedListNode class structure

    template <typename T>   
    class LinkedListNode
    {
        public:
        T data;
        LinkedListNode<T> *next;
        LinkedListNode<T> *random;
        LinkedListNode(T data)
        {
            this->data = data;
            this->next = NULL;
        }
    };

*************************************************************/

LinkedListNode<int> *cloneRandomList(LinkedListNode<int> *head)
{
    map<LinkedListNode<int>*,LinkedListNode<int>*> m;
        LinkedListNode<int>* p = head;
        while(p) {
            m[p] = new LinkedListNode<int>(p->data);
            p = p->next;
        }
        p = head;
        while(p) {
            m[p]->next = m[p->next];
            m[p]->random = m[p->random];
            p = p->next;
        }
        return m[head];
}
