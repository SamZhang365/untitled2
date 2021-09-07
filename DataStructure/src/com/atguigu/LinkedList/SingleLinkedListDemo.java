package com.atguigu.LinkedList;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江1", "及时雨1");
        HeroNode hero2 = new HeroNode(2, "宋江2", "及时雨2");
        HeroNode hero3 = new HeroNode(3, "宋江3", "及时雨3");
        HeroNode hero4 = new HeroNode(4, "宋江4", "及时雨4");
        //创建链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        //加入节点
//        singleLinkedList.add(hero1);
//        singleLinkedList.add(hero2);
//        singleLinkedList.add(hero3);
//        singleLinkedList.add(hero4);

        //按照编号顺序加入节点
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero2);

        //测试修改节点的代码
        //显示链表
        singleLinkedList.list();
        HeroNode newHeroNode = new HeroNode(2, "卢俊义", "玉麒麟");
        singleLinkedList.update(newHeroNode);
        System.out.println("修改后的链表情况~~~");
        //显示链表
        singleLinkedList.list();

        //删除节点
//        singleLinkedList.delete(1);
//        singleLinkedList.delete(4);

        System.out.println("修改后的链表情况~~~");
        //显示链表
        singleLinkedList.list();

        //测试，求单链表种有效节点的个数
        System.out.println(getLength(singleLinkedList.getHead()));

        //测试，得到倒数第k个节点
        HeroNode res = findLastIndexNode(singleLinkedList.getHead(), 2);
        System.out.println(res);
    }

    /**
     * 单链表反转
     *
     * @param head 头节点
     */
    public static void reverseList(HeroNode head) {
        //如果当前链表为空或者只有一个节点，无需反转，直接返回
        if (head.next == null || head.next.next == null) {
            return;
        }

    }

    /**
     * 查找单链表的倒数第k个节点
     * 1.编写一个方法，接收head节点，同时接收一个index
     * 2.index表示是倒数第index个节点
     * 3.先把链表从头到尾遍历，得到链表的总长度getlength
     * 4.得到size后，我们从链表的第一个开始遍历（size-Index）个，就可以得到
     * 5.如果找到了，则返回该节点，否则返回null
     *
     * @param head
     * @param index
     * @return
     */
    public static HeroNode findLastIndexNode(HeroNode head, int index) {
        //判断链表是否为空
        if (head.next == null) {
            return null;
        }
        //第一个遍历得到链表的长度
        int size = getLength(head);
        //第二次遍历得到size-index位置，就是倒数第k个节点
        //index校验
        if (index <= 0 || index > size) {
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    /**
     * 获取单链表的节点的个数
     *
     * @param head 链表的头节点
     * @return 返回有效节点的个数，不包括头节点
     */
    public static int getLength(HeroNode head) {
        //链表为空
        if (head.next == null) {
            return 0;
        }
        //统计节点个数
        int length = 0;
        //当前节点
        HeroNode cur = head.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;

    }
}

/**
 * 定义SingleLinkedList管理我们的英雄
 */
class SingleLinkedList {
    /**
     * 先初始化一个头结点，头节点不要动，不存放具体的数据
     */
    private HeroNode head = new HeroNode(0, "", "");

    /**
     * 返回头节点
     *
     * @return
     */
    public HeroNode getHead() {
        return head;
    }

    //    思路，当不考虑编号顺序时
//    1.找到当前链表的最后节点
//    2.将最后的这个节点的next指向新的节点

    /**
     * 添加节点到单向链表
     *
     * @param heroNode 待添加的节点
     */
    public void add(HeroNode heroNode) {
        /**
         * 因为head节点不能动，因此我们需要一个辅助遍历temp
         */
        HeroNode temp = head;
//        遍历链表，找到最后
        while (temp.next != null) {
            //找到链表的最后
            //如果没有找到最后，将temp后移
            temp = temp.next;
        }
        //当退出while循环时，temp就指向了链表的最后
        //将最后这个节点的next指向新的节点
        temp.next = heroNode;
    }

    /**
     * 第二种方式添加英雄，根据排名将英雄插入到值定的位置
     *
     * @param heroNode
     */
    public void addByOrder(HeroNode heroNode) {
        //头节点不能动，我们通过一个辅助指针帮助添加位置
        //因为是单链表，我们要找的temp是位于添加位置的前一个节点，否则添加不了
        HeroNode temp = head;
        //标志位，代表添加的编号已经存在
        boolean flag = false;
        while (true) {
            //temp已经到链表的最后
            if (temp.next == null) {
                break;
            }
            //位置找到，就在temp的后面插入
            if (temp.next.no > heroNode.no) {
                break;
            } else if (temp.next.no == heroNode.no) {
                //添加的编号已经存在了，不能再添加了
                flag = true;
                break;
            }
            //后移，遍历当前链表
            temp = temp.next;
        }
        //判断flag的值
        if (flag) {
            //不能添加了，编号存在
            System.out.println("编号已经存在，不能添加了");
        } else {
            //可以添加
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    /**
     * 修改节点的信息，根据节点的no编号来修改，即no编号不能动
     *
     * @param newHeroNode no编号
     */
    public void update(HeroNode newHeroNode) {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        //链表不为空
        //找到需要修改的节点，根据no编号
        //定义一个辅助变量
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            //到底了也没找到
            if (temp == null) {
                break;
            }
            //找到了
            if (temp.no == newHeroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //找到了
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.printf("没有找到编号为%d的节点，不能修改\n", newHeroNode.no);
        }

    }


    /**
     * 删除节点
     * 1. head不能动，因此我们需要一个temp辅助节点找到待删除的节点的前一个结点
     * 2. 说明我们在比较时，是temp.next.no和需要删除的节点的no进行比较
     *
     * @param no 待删除的节点
     */
    public void delete(int no) {
        HeroNode temp = head;
        //标记是否找到待删除的节点
        boolean flag = false;
        while (true) {
            //没找到
            if (temp.next == null) {
                break;
            }
            //找到了
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.printf("没有找到要删除的节点%d\n", no);
        }


    }


    /**
     * 显示链表
     */
    public void list() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //头节点不能动，我们需要一个辅助变量来遍历
        HeroNode temp = head.next;
        while (temp != null) {
            //输出节点信息
            System.out.println(temp);
            //将temp后移
            temp = temp.next;
        }
    }


}

/**
 * 定义HeroNode,每个HeroNode对象就是一个节点
 */
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    /**
     * 指向下一个节点
     */
    public HeroNode next;

    /**
     * 构造函数
     *
     * @param no       编号
     * @param name     名字
     * @param nickname 昵称
     */
    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    /**
     * 重写toString方法
     *
     * @return
     */
    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +

                '}';
    }
}
