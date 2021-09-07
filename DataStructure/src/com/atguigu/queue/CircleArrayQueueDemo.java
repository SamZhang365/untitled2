//数组模拟环形队列
package com.atguigu.queue;

public class CircleArrayQueueDemo {
    public static void main(String[] args) {

    }
}

class CircleArray {
    /**
     * 表示数组的最大容量
     */
    private int maxSize;
    /**
     * 队列头,指向队列的第一个元素，初始值为0
     */
    private int front;
    /**
     * 队列尾，指向队列的最后一个元素的后一个位置，空出一个位置，初始值为0
     */
    private int rear;
    /**
     * 该数据用于存放数据，模拟队列
     */
    private int[] arr;

    public CircleArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    /**
     * 判断队列是否满
     *
     * @return
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加数据到队列
     *
     * @param n
     */
    public void addQueue(int n) {
        //判断队列是否满
        if (isFull()) {
            System.out.println("队列满，不能添加数据。");
            return;
        }
        //存入数据
        arr[rear] = n;
        //rear后移，必须考虑取模
        rear = (rear + 1) % maxSize;
    }

    /**
     * 获取队列的数据，出队列
     *
     * @return
     */
    public int getQueue() {
        //判断队列是否为空
        if (isEmpty()) {
            //通过抛出异常
            throw new RuntimeException("队列空，不能取数据！");
        }
        /**
         * 1.先把front对应的值保留到一个临时变量
         * 2.将front后移，考虑取模
         * 3.将临时变量返回
         */
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;

    }

    /**
     * 显示队列所有数据
     */
    public void showQueue() {
        //遍历
        if (isEmpty()) {
            System.out.println("队列空，没有数据");
            return;
        }
        for (int i = front; i < front+size(); i++) {
            System.out.println(i%maxSize);
            System.out.println(arr[i%maxSize]);
        }
    }

    /**
     * 求出当前队列有效数据的个数
     * @return
     */
    public int size() {
        return (maxSize - front + rear) % maxSize;
    }

    /**
     * 显示队列的头数据，不是取出数据
     *
     * @return
     */
    public int headQueue() {
        //判断
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据！");
        }
        return arr[front];
    }


}
