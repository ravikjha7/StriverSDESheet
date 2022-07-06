class Queue {
public:
    vector<int> arr;
    int curr = 0;
    int size = 0;
    Queue() {
        
    }

    /*----------------- Public Functions of Queue -----------------*/

    bool isEmpty() {
        if(size == 0) return true;
        return false;
    }

    void enqueue(int data) {
        arr.push_back(data);
        size++;
    }

    int dequeue() {
        if(size == 0) return -1;
        size--;
        return arr[curr++];
    }

    int front() {
       if(size == 0) return -1;
       return arr[curr];
    }
};
