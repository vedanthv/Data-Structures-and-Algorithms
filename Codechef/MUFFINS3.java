import java.io.*;
 
class Test{
    public static void main(String[] s) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            
            int size=0;
            int total_cupcakes = Integer.parseInt(br.readLine()); 
            size= (total_cupcakes/2) + 1;
             System.out.println(size);
        }
        
    }
}