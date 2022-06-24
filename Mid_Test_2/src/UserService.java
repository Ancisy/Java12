import java.util.ArrayList;

public class UserService {
    public ArrayList<User> getAllUser(){
        ArrayList<User> user = new ArrayList<>();
        user.add(new User("jokeraccompany","sailorsmite@gmail.com","intopoint"));
        user.add(new User("babydid","oddcritic@gmail.com","xinchao"));
        user.add(new User("earringssong","draininner@gmail.com","hello"));
        user.add(new User("tellbra","orderrent@gmail.com","12345"));
        user.add(new User("sweepshine","cutepants@gmail.com","password123"));
        user.add(new User("saltclock","storyargue@gmail.com","111111"));
        return user;
    }

    public void show(ArrayList<User> user){
        for(User u : user){
            System.out.println(u);
        }
    }

    public boolean checkUserName(ArrayList<User> user, String userName){
        boolean flag = false;
        for(User u : user ){
            if(u.getUsername().equals(userName)) {
                flag = true;
            }
        }
        return flag;
    }

    public boolean checkPassWord(ArrayList<User> user, String passWord){
        boolean flag = true;
        for(User u : user ){
            if(u.getPassword().equals(passWord)) {
                flag = true;
            }
        }
        return flag;
    }
    //Tìm theo mail
    public User findYourMail(ArrayList<User> user,String mail){
        for(User u : user){
            if(u.getUsername().equals(mail)){
                return u;
            }
        }
        return null;
    }

    public void changeUserName(ArrayList<User> user,User myUser, String username){
        for(User u : user){
            if(u.getUsername()==username){
                System.out.println("Username đã tồn tại ");
                break;
            }else{
                System.out.println("Sửa username thành công");
            }
        }
        myUser.setUsername(username);
    }

    public void changeEmail(ArrayList<User> user,User myUser, String email){
        for(User u : user){
            if(u.getEmail()==email){
                System.out.println("Email đã tồn tại ");
                break;
            }
            else {
                System.out.println("Sửa email thành công");
            }
        }
        myUser.setEmail(email);
    }


    public void changePassword(User myUser, String newPassWord){
        myUser.setPassword(newPassWord);

    }

    //Quên mật khẩu
    public void forgetPassword(ArrayList<User> user,String yourEmail,String newPassWord){
        for(User u : user){
            if(u.getEmail().equals(yourEmail)){
                System.out.println("Không có tài khoản này ");
            }else{
                System.out.println("Mật khẩu tài khoản " + yourEmail + " được đổi thành công");
                u.setPassword(newPassWord);
            }
        }

    }


}
