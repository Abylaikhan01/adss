package com.company;
class Node{
    String key;
    int values;
    Node next;

    Node(String kee, int val){
        key= kee;
        values = val;
        next = null;
    }
}
public class Hashtable {
    Node[] value;

    Hashtable(int sizelist){
        value = new Node[sizelist];
}
int Hashfunc(String kee)  {
        int index;
        index = kee.length()%value.length;
        return index;
}
void put(String kee, int val){
        int index = Hashfunc(kee);
        Node node = value[index];
        if(node == null){
            node = new Node(kee,val);
            value[index]=node;
        } else{
            while (node.next !=null){
                node =node.next;
            }
            Node newNode = new Node(kee, val);
        }
}
 int get(String kee){
        int index = Hashfunc(kee);
        Node node = value[index];
        if (node ==null){
            return -1;
        }
        while (node.next != null){
            if (node.key == kee) {
                return node.values;
            }
            node = node.next;
        }
        if (node.key == kee){
            return node.values;
        }
        return -1;
}
}
