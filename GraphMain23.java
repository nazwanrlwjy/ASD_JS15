package ASD_Jobsheet_Graff;

import java.util.Scanner;

public class GraphMain23 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphMatriks23 gdg = new GraphMatriks23(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Keluar");

            System.out.print("Masukkan pilihan menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Asal   : ");
                    int source = scanner.nextInt();
                    System.out.print("Masukkan Tujuan : ");
                    int target = scanner.nextInt();
                    System.out.print("Masukkan Jarak  : ");
                    int weight = scanner.nextInt();
                    gdg.makeEdge(source, target, weight);
                    break;
                case 2:
                    System.out.print("Masukkan Asal   : ");
                    int src = scanner.nextInt();
                    System.out.print("Masukkan Tujuan : ");
                    int trg = scanner.nextInt();
                    gdg.removeEdge(src, trg);
                    break;
                case 3:
                    System.out.print("Masukkan node       : ");
                    int node = scanner.nextInt();
                    System.out.println("InDegree Gedung     : " + gdg.inDegree(node));
                    System.out.println("OutDegree Gedung    : " + gdg.outDegree(node));
                    System.out.println("Total Degree Gedung : " + gdg.totalDegree(node));
                    break;
                case 4:
                    gdg.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan Asal   : ");
                    int s = scanner.nextInt();
                    System.out.print("Masukkan Tujuan : ");
                    int t = scanner.nextInt();
                    if (gdg.isEdge(s, t)) {
                        System.out.println("Gedung " + (char) ('A' + s) + " dan Gedung " + (char) ('A' + t) + " bertetangga.");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + s) + " dan Gedung " + (char) ('A' + t) + " tidak bertetangga.");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
            System.out.println("Update Jarak");
            gdg.updateJarak(0, 2, 90); // Perubahan pada baris ini
            gdg.printGraph();
        }
        System.out.println("Jumlah Egde dalam graph : "+ gdg.hitungEdge());
        scanner.close();
    }
}
