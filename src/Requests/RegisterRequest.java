package Requests;


public class RegisterRequest {

    public static void authenticate(String name,String username,String password,String confirm_password,String gender,String city,
         String address,String phone,String age ) {
        String hashPassword = Tools.Password.hashPassword(password);
      
            System.out.println(name);
            System.out.println(username);
            System.out.println(hashPassword);
            System.out.println(confirm_password);
            System.out.println(gender);
            System.out.println(city);
            System.out.println(address);
            System.out.println(phone);
            System.out.println(age);
        
    }
}
