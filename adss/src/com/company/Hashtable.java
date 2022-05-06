package com.company;
class Node{
    String key;
    int values;
    Node next;

    Node(String kee, int val){
        //thats new constructor for creating slots where savr our value
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
        //this algorithm hashing the key
        return index;
}
void put(String kee, int val){
        int index = Hashfunc(kee);
        Node node = value[index];
        if(node == null){
            node = new Node(kee,val);
            //if our node empty we can put new value with its key
            value[index]=node;
        } else{
            while (node.next !=null){
                node =node.next;
                //if slot is not empty new info put in next slot
            }
            Node newNode = new Node(kee, val);
        }
}
 int get(String kee){
        int index = Hashfunc(kee);
        Node node = value[index];
        if (node ==null){
            return -1;
            //if our node is empty display on the console -1
        }
        while (node.next != null){
            if (node.key == kee) {
                return node.values;
            }
            node = node.next;
        }
        if (node.key == kee){
            return node.values;
            //if our key same with values key Its display on the console
        }
        return -1;
        //if not -1 display on the console
}
}
