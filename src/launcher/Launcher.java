 package launcher;

import ui.Login;

public class Launcher {

    public static void main(String[] args) {
        try {
            Thread.sleep(4000);
            Login login = new Login();
            login.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

}
