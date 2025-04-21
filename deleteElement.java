import java.util.Arrays;

public class deleteElement{
    

    public static void main(String[]args){
        int[] numbers={10,20,30,40,50};
        int deleteIndex = 2;
        int[] newArray= new int[numbers.length-1];
        for(int i=0,j=0; i< numbers.length;i++){
            if(i!=deleteIndex){
               
                newArray[j++]=numbers[i];
            }
        }
        for (int num:newArray){
            System.out.print(num +"");
        }
    }
}
