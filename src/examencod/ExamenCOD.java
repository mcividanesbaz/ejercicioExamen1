
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int iN = 11;
            	if (metodoTuyo(iN))
System.out.println("Es numero primo");
else
 System.out.println("NO es numero primo");           	 
          	 
for (int x=2;x<1000;x++) {
if (metodoTuyo(x))
System.out.print(x + " ");                         	 
}         	 
	}
public static boolean metodoTuyo(int variable1){
int j = 2;
boolean aux=true;
while ((aux) && (j!=variable1)){
if (variable1 % j == 0)
aux = false;
j++;
}
return aux;
  } 	     
}
