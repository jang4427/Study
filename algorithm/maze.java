public class Test {
    public int check[][]= {
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}};

    int map[][]={
            {1,1,1,1,1,1,1,1},
            {1,0,1,0,0,0,1,1},
            {1,0,1,0,1,0,1,1},
            {1,0,0,0,1,0,1,1},
            {1,0,1,1,1,0,1,1},
            {1,0,0,0,1,0,1,1},
            {1,1,1,1,1,0,0,1},
            {1,1,1,1,1,1,1,1}};


    public static void main(String[] argc) {
        Test test = new Test();
        test.check[1][1] = 0;
        test.search(1,1);
    }

    public void search(int x, int y) {
        if(x==6 && y==6)
            System.out.println("end");

        if(map[x][y-1] == 0 && check[x][y-1] == 0) { //top
            check[x][y-1] = 1;
            search(x,y-1);
        }
        if(map[x-1][y] == 0 && check[x-1][y] == 0) { //left
            check[x-1][y] = 1;
            search(x-1,y);
        }
        if(map[x][y+1] == 0 && check[x][y+1] == 0) { //bottom
            check[x][y+1] = 1;
            search(x,y+1);
        }
        if(map[x+1][y] == 0 && check[x+1][y] == 0) { //right
            check[x+1][y] = 1;
            search(x+1,y);
        }
    }
}