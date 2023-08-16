package com.ict.email.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	private JavaMailSender mailSender;
	private MimeMailMessage message;
	private MimeMessageHelper messageHelper;
	
	public void sendEmail(String randomNumber, String toMail) {
		MailHandler sendMail;
		try {
			sendMail = new MailHandler(mailSender);
			sendMail.setSubject("[ICT EDU 인증 메일입니다.]");   // 메일 제목
			sendMail.setText(""                              //메일 내용
						+"<table><tbody>"
						+"<tr><td><h2>ICT EDU 메일 인증</h2></td></tr>"
						+"<tr><td><h3>ICT EDU</h3></td></tr>"
						+"<tr><td><font size='20px'>인증번호 안내입니다.</font></td></tr>"
						+"<tr><td></td></tr>"
						+"<tr><td>안녕하세요 인증번호 생성되었습니다.</td></tr>"
						+"<tr><td></td></tr>"
						+"<tr><td><font size='20px'>확인번호 : "+ randomNumber +"</font></td></tr>"
						+"</tbody></table>");   
			
			// 보내는 이
			sendMail.setFrom("tlstlf36@gmail.com", "ICTEDU");  // 실무에서는 상수로 만들어서 씀(회사측메일, 제목)
			
			// 받는 이
			sendMail.setTo(toMail);   // db갔다온 메일 받아서 실행
			sendMail.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
