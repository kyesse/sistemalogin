import java.util.HashMap;

public class IdeaPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IdeaPasswords() {
        logininfo.put("usuario1", "pizza");
        logininfo.put("pessoa2", "ketchup");
        logininfo.put("nomeusuario", "cooper");

    }

    IdeaPasswords(String loginID, String passwordID) {
        logininfo.put(loginID, passwordID);

    }

    protected HashMap getLoginInfo() {
        return logininfo;

    }

    protected HashMap setNewLoginInfo(String loginID, String passwordID) {
        logininfo.put(loginID, passwordID);
        return logininfo;

    }

}
