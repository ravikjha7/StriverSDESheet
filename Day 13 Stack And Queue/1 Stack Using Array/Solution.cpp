// Stack class.
class Stack {
    
public:
    int size;
    vector<int> arr;
    int curr = 0;
    Stack(int capacity) {
        size = capacity;
    }

    void push(int num) {
        if(curr != size) {
            arr.push_back(num);
            curr++;
        } 
    }

    int pop() {
        if(curr != 0) {
            int ans = arr[curr - 1];
            arr.pop_back();
            curr--;
            return ans;
        }
        return -1;
    }
    
    int top() {
        if(curr != 0) return arr[curr - 1];
        return -1;
    }
    
    int isEmpty() {
        if(curr == 0) return 1;
        return 0;
    }
    
    int isFull() {
        if(curr == size) return 1;
        return 0;
    }
    
};
