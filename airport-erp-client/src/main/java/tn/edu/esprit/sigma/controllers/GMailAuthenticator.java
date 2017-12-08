package tn.edu.esprit.sigma.controllers;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
public class GMailAuthenticator {
	String user;
    String pw;
    public GMailAuthenticator (String username, String password)
    {
       super();
       this.user = username;
       this.pw = password;
    }
   public PasswordAuthentication getPasswordAuthentication()
   {
      return new PasswordAuthentication(user, pw);
   }
}
