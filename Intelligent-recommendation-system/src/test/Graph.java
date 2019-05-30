package test;  
  
public class Graph {  
  
    private Vertex vertexList[]; // list of vertices  
    private int adjMat[][]; // adjacency matrix  
  
    private int nVerts;  
    private static int MAX_VERTS = 3; // n����  
  
    int i = 0;  
    int j = 0;  
  
    public Vertex[] getVertexList() {  
        return vertexList;  
    }  
  
    public int[][] getAdjMat() {  
        return adjMat;  
    }  
  
    public int getN() {  
        return MAX_VERTS;  
    }  
  
    public Graph(int index) {  
        adjMat = new int[MAX_VERTS][MAX_VERTS]; // �ڽӾ���  
        vertexList = new Vertex[MAX_VERTS]; // ��������  
        nVerts = 0;  
  
        for (i = 0; i < MAX_VERTS; i++) {  
            for (j = 0; j < MAX_VERTS; j++) {  
                adjMat[i][j] = 0;  
            }  
        }  
  
        addVertex("����");  
        addVertex("�Ϻ�");   
        addVertex("ʯ��ׯ");   
  
        addEdge(0, 1);  
        addEdge(0, 2); 
        addEdge(2, 1);   
  
        switch (index) {  
        case 0:  
            break;  
        case 1:  
            delEdge(4, 2);  
            break;  
        default:  
            break;  
        }  
    }  
  
    private void delEdge(int start, int end) {  
        adjMat[start][end] = 0;  
    }  
  
    private void addEdge(int start, int end) {// ����ͼ����ӱ�  
        adjMat[start][end] = 1;  
        // adjMat[end][start] = 1;  
    }  
  
    public void addVertex(String lab) {  
        vertexList[nVerts++] = new Vertex(lab);// ��ӵ�  
    }  
  
    public String displayVertex(int i) {  
        return vertexList[i].getLabel();  
    }  
  
    public boolean displayVertexVisited(int i) {  
        return vertexList[i].WasVisited();  
    }  
  
    public void printGraph() {  
        for (i = 0; i < MAX_VERTS; i++) {  
            System.out.print("��" + displayVertex(i) + "���ڵ�:" + " ");  
  
            for (j = 0; j < MAX_VERTS; j++) {  
                System.out.print(displayVertex(i) + "-" + displayVertex(j)  
                        + "��" + adjMat[i][j] + " ");  
            }  
            System.out.println();  
        }  
  
    }  
  
}  