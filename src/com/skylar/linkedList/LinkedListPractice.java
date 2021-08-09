package com.skylar.linkedList;


public class LinkedListPractice {

    //add linked list
    public static class SingleLikedList<T> {

        public Node<T> head = null;

        public class Node<T> {
            T data;
            Node<T> next = null;

            public Node(T data) {
                this.data = data;
            }
        }

        public void addNode(T data) {
            if(head == null) {
                head = new Node<T>(data);
            }else {
                Node<T> node = this.head;
                while (node.next != null) {
                    node = node.next;
                }
                node.next = new Node<T>(data);
            }
        }

        public Boolean delNode(T isData) {
            if(this.head == null) {
                return false;
            }else {
                Node<T> node = this.head;
                if(node.data == isData) {
                    this.head = this.head.next;
                return true;
                }else {
                    while(node.next != null) {
                        if(node.next.data == isData) {
                            node.next = node.next.next;
                            return true;
                        }
                        node = node.next;
                    }
                    return false;
                }
            }
        }

        public void printAll() {
            if(head != null) {
                Node<T> node = this.head;
                System.out.println(node.data);
                while(node.next != null) {
                    node = node.next;
                    System.out.println(node.data);
                }
            }
        }

        public Node<T> search(T data) {
            if(this.head == null) {
                return null;
            }else {
                Node<T> node = this.head;
                while(node != null) {
                    if(node.data == data) {
                        return node;
                    }else {
                        node = node.next;
                    }
                }

                return null;
            }
        }

        public void addNodeInside(T data, T isData) {
            Node<T> searchNode = this.search(isData);

            if(searchNode == null) {
                this.addNode(data);
            }else {
                Node<T> nextNode = searchNode.next;
                searchNode.next = new Node<T>(data);
                searchNode.next.next = nextNode;
            }
        }

    }

    public static void main(String[] args) {
        SingleLikedList<Integer> myLinkedList = new SingleLikedList<Integer>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        System.out.println(myLinkedList.head.next.data);
        myLinkedList.printAll();

    }






}
