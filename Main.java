import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int res = 0;
    int m = Integer.parseInt(in.nextLine());
    int n = Integer.parseInt(in.nextLine());
    boolean[][] canvas = new boolean[m][n];
    int k = Integer.parseInt(in.nextLine());
    for(int i = 0; i<k;i++){
      String p = in.nextLine();
      String rc = p.substring(0,1);
      int num = Integer.parseInt(p.substring(2));
      if(rc.equals("R")){
        for(int a=0;a<canvas.length;a++){
          for(int b=0;b<canvas[0].length;b++){
            if(a == num-1){
              canvas[a][b]=!canvas[a][b];
            }
          }
        }
      }else if(rc.equals("C")){
        for(int a=0;a<canvas.length;a++){
          for(int b=0;b<canvas[0].length;b++){
            if(b == num-1){
              canvas[a][b]=!canvas[a][b];
            }
          }
        }
      }
    }
    for(boolean[] i : canvas){
      for(boolean j : i){
        if(j){
          res++;
        }
      }
    }
    System.out.println(res);
  }
}