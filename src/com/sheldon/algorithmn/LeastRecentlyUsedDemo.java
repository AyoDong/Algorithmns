package com.sheldon.algorithmn;

import java.util.HashMap;

public class LeastRecentlyUsedDemo {

    private Node head;
    private Node end;
    private int limit;

    private HashMap<String, Node> hashMap;

    public LeastRecentlyUsedDemo(int limit){
        this.limit = limit;
        hashMap = new HashMap<String, Node>();
    }

    public String get(String key){
        Node node = hashMap.get(key);
        if(node == null){
            return null;
        }

        refreshNode(node);
        return node.value;
    }

    public void put(String key, String value){
        Node node = hashMap.get(key);
        if(node == null){
            if(hashMap.size() >= limit){
                String oldKey = removeNode(head);
                hashMap.remove(oldKey);
            }
            node = new Node(key, value);
            addNode(node);
            hashMap.put(key, node);
        }else{
            node.value = value;
            refreshNode(node);
        }
    }

    public void remove(String key){
        Node node = hashMap.get(key);
        removeNode(node);
        hashMap.remove(key);
    }

    private void refreshNode(Node node){
        if(node == end){
            return;
        }
        removeNode(node);

        addNode(node);
    }

    private String removeNode(Node node){
        if(node == end){
            end = end.pre;
        }else if(node == head){
            head = head.next;
        }else{
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        return node.key;
    }

    private void addNode(Node node){
        if(end != null){
            end.next = node;
            node.pre = end;
            node.next = null;
        }
        end = node;
        if(head == null){
            head = node;
        }
    }

    public static void main(String[] args) {
        LeastRecentlyUsedDemo lruCache = new LeastRecentlyUsedDemo(5);
        lruCache.put("1", "用户1信息");
        lruCache.put("2", "用户2信息");
        lruCache.put("3", "用户3信息");
        lruCache.put("4", "用户4信息");
        lruCache.put("5", "用户5信息");
        String node2 = lruCache.get("2");
        lruCache.put("4", "用户4信息 - 更新");
        lruCache.put("6", "用户6信息");

        System.out.println(lruCache.get("1"));
        System.out.println(lruCache.get("6"));

        System.out.println("NODE-1 : " + lruCache.head.value);
        System.out.println("NODE-2 : " + lruCache.head.next.value);
        System.out.println("NODE-3 : " + lruCache.head.next.next.value);
        System.out.println("NODE-4 : " + lruCache.head.next.next.next.value);
        System.out.println("NODE-5 : " + lruCache.head.next.next.next.next.value);
    }
}

class Node{
    Node(String key, String value){
        this.key = key;
        this.value = value;
    }

    public Node pre;
    public Node next;
    public String key;
    public String value;
}