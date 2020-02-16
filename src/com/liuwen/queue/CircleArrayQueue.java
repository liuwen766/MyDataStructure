package com.liuwen.queue;

public class CircleArrayQueue {
    public static void main(String[] args){
    }

    //front 变量的含义做一个调整： front 就指向队列的第一个元素, 也就是说 arr[front] 就是队列的第一个元素
    //front 的初始值 = 0

    //rear 变量的含义做一个调整：rear 指向队列的最后一个元素的后一个位置. 因为希望空出一个空间做为约定.
    //rear 的初始值 = 0

    // 判断队列是否满

    // 判断队列是否为空

    // 添加数据到队列

    // 获取队列的数据, 出队列
    // 这里需要分析出 front是指向队列的第一个元素
    // 1. 先把 front 对应的值保留到一个临时变量
    // 2. 将 front 后移, 考虑取模
    // 3. 将临时保存的变量返回

    // 显示队列的所有数据

    // 显示队列的头数据， 注意不是取出数据

    // 求出当前队列有效数据的个数
}
