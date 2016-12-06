package com.intuit.txe;
 
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
 
@Path("/mail")
public class EmailImpl {		
	
	@POST
	@Path("/sendgrid")
	@Consumes("multipart/related")
	public Response sendgrid(String plsAddActualInputFromSendgrid) {
		System.out.println("Entered into sendgrid mock service");
		try {
			//Dummy check
			if (true) {
				String out = "Mail received by sendgrid";
				System.out.println("If clause Entered into sendgrid mock service");
				return Response.status(200).entity(out).build();
				//return Response.ok("OK").build();
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.err.println("mock service catch block");
		}
		return null;
	 }
	
	@POST
	@Path("/responsys")
	@Consumes("application/json; charset=UTF-8")
	public Response responsys(String plsAddActualInputFromResponsys) {
		try {
			//Dummy check
			if (true) {
				return Response.ok("responsys").build();
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	 }
	
	@POST
	@Path("/smtp")
	@Consumes("application/json; charset=UTF-8")
	public Response smtp(String plsAddActualInputFromSMTP) {
		try {
			//Dummy check
			if (true) {
				return Response.ok("smtp").build();
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	 }
	
	public static class Email {
        //private SMTPAPI smtpapi;
        private ArrayList<String> to;
        private ArrayList<String> toname;
        private ArrayList<String> cc;
        private String from;
        private String fromname;
        private String replyto;
        private String subject;
        private String text;
        private String html;
        private ArrayList<String> bcc;
        private Map<String, InputStream> attachments;
        private Map<String, String> contents;
        private Map<String, String> headers;

        public Email() {
            //this.smtpapi = new SMTPAPI();
            this.to = new ArrayList<String>();
            this.toname = new ArrayList<String>();
            this.cc = new ArrayList<String>();
            this.bcc = new ArrayList<String>();
            this.attachments = new HashMap<String, InputStream>();
            this.contents = new HashMap<String, String>();
            this.headers = new HashMap<String, String>();
        }
	}
}