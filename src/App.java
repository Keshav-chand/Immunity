import java.util.Scanner;
class App{
     static void bubblesort(int array[]) {
        int j,temp=0;
        for(int i=0;i<array.length;i++){
            for(j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

     }
     public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the records");
        int n=sc.nextInt();
        int[] vaccineStrength=new int[n];
        int[] patientsimmunity=new int[n];
        System.out.println("enter"+n+"records for vaccine's immunity");
        for(int i=0;i<n;i++){
            vaccineStrength[i]=sc.nextInt();

        }
        System.out.println("enter"+n+"records for paitent's immunity");
        for(int i=0;i<n;i++){
            patientsimmunity[i]=sc.nextInt();
        }
        bubblesort(vaccineStrength);// arrange vaccine strength in sorted order
        bubblesort(patientsimmunity);//arrange patient strength in sorted order
        int count=0;
        for(int i=0;i<n;i++){
            if(vaccineStrength[i]<patientsimmunity[i])
            count++;
        }
        if(count>0){
            System.out.println("Not possible");
        }
        else{
            System.out.println("yes, it is possible");
        }
     }
}
