package com.koreait.board4;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuth extends Authenticator{
	
	PasswordAuthentication pa;
    
    public MailAuth() {
        String mail_id = "goonturtle4u@gmail.com";
        String mail_pw = "goon1234^^";
        
        pa = new PasswordAuthentication(mail_id, mail_pw);
    }
    
    public PasswordAuthentication getPasswordAuthentication() {
        return pa;
    }

}
