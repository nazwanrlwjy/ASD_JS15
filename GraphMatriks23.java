package ASD_Jobsheet_Graff;

public class GraphMatriks23 {
        int vertex;
        int[][] matriks;
    
        public GraphMatriks23(int v) {
            vertex = v;
            matriks = new int[v][v];
        }
    
        public void makeEdge(int asal, int tujuan, int jarak) {
            matriks[asal][tujuan] = jarak;
        }
    
        public void removeEdge(int asal, int tujuan) {
            matriks[asal][tujuan] = -1; 
        }
    
        public void printGraph() {
            for (int i = 0; i < vertex; i++) {
                System.out.print("Gedung " + (char) ('A' + i) + " : ");
                for (int j = 0; j < vertex; j++) {
                    if (matriks[i][j] != -1) {
                        System.out.print("Gedung " + (char) ('A' + j) + "(" + matriks[i][j] + " m), ");
                    }
                }
                System.out.println();
            }
        }
    
        public boolean isEdge(int source, int target) {
            return (matriks[source][target] != 0);
        }
    
        public int inDegree(int node) {
            int inDegree = 0;
            for (int i = 0; i < vertex; i++) {
                if (matriks[i][node] != -1) {
                    inDegree++;
                }
            }
            return inDegree;
        }
    
        public int outDegree(int node) {
            int outDegree = 0;
            for (int j = 0; j < vertex; j++) {
                if (matriks[node][j] != -1) {
                    outDegree++;
                }
            }
            return outDegree;
        }
    
        public int totalDegree(int node) {
            return inDegree(node) + outDegree(node);
        }
        public void updateJarak(int source, int target, int newDistance) {
            if (source >= 0 && source < vertex && target >= 0 && target < vertex) {
                matriks[source][target] = newDistance;
                System.out.println("Jarak antara Gedung " + (char) ('A' + source) + " dan Gedung " + (char) ('A' + target) + " berhasil diubah menjadi " + newDistance + "m.");
            } else {
                System.out.println("Indeks node tidak valid.");
            }
        }

        public String hitungEdge() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hitungEdge'");
        }
        
    }
