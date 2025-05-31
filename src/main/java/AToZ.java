public class AToZ {

    public static void main(String args[]){

        StringBuilder rs = new StringBuilder();

        for(int i=0;i<26;i++){
            char res = (char)('A'+i);
            rs.append(res + " ");
        }

        System.out.println(rs.toString());
    }
}
