package com.chevs.homedesign.service.helper;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EmailHelper {

	@Autowired
	JavaMailSender sender;

	public void sendEmail(EmailParams params) throws Exception {
		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);
			helper.setFrom(params.getFrom());
			helper.setTo(params.getTo());
			helper.setText(params.getBody());
			helper.setSubject(params.getSubject());
			sender.send(message);
		} catch (MailException ex) {
			System.out.println(" mail exception : - " + ex.getMessage());
		}
	}
}
