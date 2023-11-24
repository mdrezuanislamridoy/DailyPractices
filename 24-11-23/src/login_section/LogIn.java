package login_section;

public class LogIn {
    
    private String[] userName = { "Ridoy","Babu","King"};
    private String[] pass= {"sbss","bbps","kkg"};
    
   


    LogIn(String user , String passs){
        if (Perm(user,passs)) {
            System.out.println("login Sucess");
        }else{
            System.out.println("failed");
        }   
    }
    
    boolean Perm(String enterUser,String enterpass){
        for (int i = 0; i < userName.length; i++) {
            if (userName[i]==enterUser && pass[i].equals(enterpass)) {
                return true;
            }
            
        }
        return false;
    }
    
}
