 /**
* The <code>Email</code> class creates Email Objects.
* These Email objects contain the information of the email a person is typing.
* Information includes the variables to, cc, bcc, subject, and body of type String
* ad variable timestamp of type GregorianCalendar.
*  
* 
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
package cse214hw5;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class Email implements Serializable,Comparable {
	//DATA****************************************
	private String to;//stores the “to” field.
	private String cc;//stores the “cc” field.
	private String bcc;// stores the “bcc” field.
	private String subject;//stores the “subject” field.
	private String body;//stores all of the text in the email’s body.
	private GregorianCalendar timestamp;//Represents the time that this email was created.
	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It creates a new Email that sets all data types to null.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Email Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Email object with its very own referrence
	    *
	    **/
	public Email(){
		to=null;
		cc=null;
		bcc=null;
		subject=null;
		body=null;
		timestamp=null;
	}

	//GETTERS*************************************
	/**
	    * Gets the value at variable To
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Email
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private to variable
	    *    and returns whatever String value is being held
	    *    by the to variable
	    *
	    * @returns String to
	    * 
	    **/
	public String getTo() {return to;}
	/**
	    * Gets the value at variable cc
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Email
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private cc variable
	    *    and returns whatever String value is being held
	    *    by the cc variable
	    *
	    * @returns String cc
	    * 
	    **/
	public String getCc() {return cc;}
	/**
	    * Gets the value at variable bcc
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Email
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private bcc variable
	    *    and returns whatever String value is being held
	    *    by the bcc variable
	    *
	    * @returns String bcc
	    * 
	    **/
	public String getBcc() {return bcc;}
	/**
	    * Gets the value at variable subject
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Email
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private subject variable
	    *    and returns whatever String value is being held
	    *    by the subject variable
	    *
	    * @returns String subject
	    * 
	    **/
	public String getSubject() {return subject;}
	/**
	    * Gets the value at variable body
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Email
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private body variable
	    *    and returns whatever String value is being held
	    *    by the body variable
	    *
	    * @returns String body
	    * 
	    **/
	public String getBody() {return body;}
	/**
	    * Gets the value at variable timestamp
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Email
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private timestamp variable
	    *    and returns whatever GregorianCalendar value is being held
	    *    by the timestamp variable
	    *
	    * @returns GregorianCalendar timestamp
	    * 
	    **/
	public GregorianCalendar getTimestamp() {return timestamp;}
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of to, and gives them access to changing the value.
	    *
	    * @param String to 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable to for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setTo(String to) {
		this.to = to;
	}
	/**
	    * Allows the user to access the private data field
	    * of cc, and gives them access to changing the value.
	    *
	    * @param String cc 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable cc for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setCc(String cc) {
		this.cc = cc;
	}
	/**
	    * Allows the user to access the private data field
	    * of bcc, and gives them access to changing the value.
	    *
	    * @param String bcc 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable bcc for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}
	/**
	    * Allows the user to access the private data field
	    * of subject, and gives them access to changing the value.
	    *
	    * @param String subject
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable subject for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	    * Allows the user to access the private data field
	    * of body, and gives them access to changing the value.
	    *
	    * @param String body 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable body for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setBody(String body) {
		this.body = body;
	}
	/**
	    * Allows the user to access the private data field
	    * of timestamp, and gives them access to changing the value.
	    *
	    * @param GregorianCalendar timestamp 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type GregorianCalendar passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable timestamp for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setTimestamp(GregorianCalendar timestamp) {
		this.timestamp = timestamp;
	}

	//OVERRIDE*************************************

	@Override
	public int compareTo(Object o) {
      Email otherEmail = (Email)o;
      if (this.timestamp.compareTo(otherEmail.timestamp)==0)
              return 0;
      else if (this.timestamp.compareTo(otherEmail.timestamp)==1)
              return 1;
      else
              return -1;
    }

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
	        return false;
	    }
	    Email other = (Email) obj;
	    if (this.to.equals(other.to)!=true) {
	        return false;
	    }
	    if (this.cc.equals(other.cc)!=true){
	        return false;
	    }
	    if (this.bcc.equals(other.bcc)!=true) {
	        return false;
	    }
	    if (this.subject.equals(other.subject)!=true) {
	        return false;
	    }
	    if (this.body.equals(other.body)!=true) {
	        return false;
	    }
	    if (this.compareTo(other)!=0) {
	        return false;
	    }
	    return true;
	}
	
	@Override
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat();
	    sdf.applyPattern("hh:mma MM/dd/yyyy");
		return sdf.format(this.getTimestamp().getTime())+" | "+ this.getSubject();
	}
    
	//OTHERS*************************************
	/**
	    * Allows the user to compare two objects based on the variable
	    * Subject and tells the user which objects has a lower ranking
	    * letter than the other
	    *
	    * @param Object o1, Object o2
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Object passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>None
	    *
	    * @returns int
	    * 
	    * 
	    **/
	public static int compareSubject(Object o1, Object o2) {
	    Email e1 = (Email) o1;
	    Email e2 = (Email) o2;
	    if(compareSubject(e1.getSubject(),e2.getSubject())==0) return 0;
	    else if(compareSubject(e1.getSubject(),e2.getSubject())==1) return 1;
	    else return -1;
	}
	
  //***************************************************************************************************************
  //*************************************!!!!UNFINISHED CODE!!!****************************************************
  //***************************************************************************************************************
	/*
	public static void main(String[] args){
		String x,y;
		x="0";
		y="a";
		Email a= new Email(x,x,x,y,x);
		x="1";
		y="b";
		Email b = new Email(x,x,x,y,x);
		x="2";
		y="c";
		Email c = new Email(x,x,x,y,x);
		x="3";
		y="d";
		Email d = new Email(x,x,x,y,x);
		
		a.setTimestamp(new GregorianCalendar());
		in.nextLine();
		b.setTimestamp(new GregorianCalendar());
		in.nextLine();
		c.setTimestamp(new GregorianCalendar());
		in.nextLine();
		d.setTimestamp(new GregorianCalendar());

		System.out.println("a to b : "+compareSubject(a, b) );
		System.out.println("a to a : "+compareSubject(a, a));
		System.out.println("b to a : "+compareSubject(b, a));
		System.out.println("a to d : "+compareSubject(a, d));
		System.out.println("d to a : "+compareSubject(d, a));
		
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
	}	
*/
}


