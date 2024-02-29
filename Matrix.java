/* Mustafa Nafia
 * Course: C202
 * Professor: Dr.Walsh
 */

public class Matrix {
    
    private int r; //rows
    private int c; //columns
    private int [][]data;
    private final int MAX = 100;
    
    public Matrix(int row, int col) {
        r = row;
        c = col;
        data = new int[r][c];
        
        for(int i=0;i<r; i++){
            for (int j=0;j<c;j++){
                data[i][j]=(int)(Math.random()*3 + 1);
           } //for j
        } //for i
    } //Matrix constructor
    
    
        public String toString() {
            String output = "";
            for(int i=0;i<r;i++) {                
                for(int j=0;j<c;j++) { 
                    
                    String line = data[i][j] + "";
                    output += data[i][j] + "\t";
                } //for j
                output += "\n";
            } // for i
            return output;
        } //toString
          
        
        
        public void ScaleMult(int e) {
            for(int i = 0; i<r; i++) {
                for(int j = 0; j<c; j++) {
                    data[i][j]*=e;

                } //for i
            } //for j
            
        } //scalmult
        
        
        public Matrix multiply(Matrix m2) throws Exception {
            try {
               if (c != m2.r) {
                   System.out.println("Error! Column and Row does not match");
                   System.out.println(this.c+":"+m2.r);
                   throw new RuntimeException();
                }
                Matrix m3 = new Matrix(this.r,m2.c); //Create new Matrix
                for(int i=0; i<this.r; i++) {
                    for(int j=0; j < m2.c; j++) { 
                        m3.data[i][j] = 0;
                        for (int k = 0; k < this.c; k++) {
                            m3.data[i][j] += data[i][k] * m2.data[k][j];
                        } //fork
                    }//forj
                } //for i
                return m3;
            } //try
            catch (Exception ex) { 
                System.out.println("AAAAGGGH");
            }
            return m2;
        } //Multiply
        
        public Matrix copyMatrix(){
            Matrix copym = new Matrix(this.r,this.c);
            for(int i=0; i<r; i++) {
                System.arraycopy(this.data[i],0,copy.data[i],0();
            }
        }
        
                
    }
    
    
  