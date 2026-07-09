public class stringBuilder{
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();

        String series = "";// adding char to string
        for(int i =0 ; i<26 ; i++){
            char ch = (char)('a' + i) ; 
           builder.append(ch);//here modification is done in single string, no extra space is wasted
        }
        System.out.println(builder.toString());

        //methods of string
        builder.deleteCharAt(0);
        System.out.println(builder);
        
        builder.reverse();
        System.out.println(builder);


    }
}