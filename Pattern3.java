package JavaPrograms100;

//To Display the output as:

//  1234554321

//  1234  4321

//  123    321

//  12      21

//  1        1

class Pattern3 {
  public void compute()
    {
int i,f,j,c=5,sp=0;

for(int k=1;k<=5;k++){ 
  for(i=1;i<=c;i++){
  System.out.print(i);
   if(i==c)
 { for(f=1;f<=sp;f++)
 { System.out.print(" ");}
 for(int j=c;j>=1;j"){
  System.out.print(j);
}
	     c=c-1;
 System.out.println();
 sp=sp+2;

 }           }
 }
}}
