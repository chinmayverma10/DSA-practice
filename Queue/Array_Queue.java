public class Array_Queue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return ;
            }
            rear += 1;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue Empty");
                return -1;
            }

            int data = arr[0];
            for(int i=0;i<=rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return data;
        }
        public static int peek() {
            if(isEmpty()){
                System.out.print("Queue Empty");
                return -1;
            }
            return arr[0];
        }

        public static void printQueue(){
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(10);
        System.out.println(q.isEmpty());
        q.printQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.printQueue();
        System.out.println();
        q.remove();
        q.printQueue();
        System.out.println();
        System.out.println(q.peek());
    }
}