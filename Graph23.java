package ASD_Jobsheet_Graff;

public class Graph23 {
    int vertex;
    DoubleLinkedList23[] list;

    public Graph23(int v) {
        vertex = v;
        list = new DoubleLinkedList23[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList23();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
        }
        // outDegree
        for (k = 0; k < list[asal].size(); k++) {
            list[asal].get(k);
        }
        totalOut = k;

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + "  : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + "    : " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isAdjacent(int asal, int tujuan) {
        try {
            for (int i = 0; i < list[asal].size(); i++) {
                if (list[asal].get(i) == tujuan) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            return false;
        }
    }

    public void updateJarak(int asal, int tujuan, int newJarak) throws Exception {
        list[asal].updateJarak(tujuan, newJarak);
    }
    public int hitungEdge() {
    int totalEdge = 0;
    for(int i = 0; i< vertex; i++){
        totalEdge += list[i].size();
    }
    return totalEdge;
    }
}
