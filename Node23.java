package ASD_Jobsheet_Graff;

public class Node23 {
    int data;
    Node23 prev, next;
    int jarak;

    Node23(Node23 prev, int data, int jarak, Node23 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
