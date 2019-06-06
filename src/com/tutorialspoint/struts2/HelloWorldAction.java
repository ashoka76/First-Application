package com.tutorialspoint.struts2;

public class HelloWorldAction {
   private String name;
   private String location;

   public String execute() throws Exception {
      System.out.println("Execute method");
	   return "success";
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public void setLocation(String location) {
	      this.location = location;
	   }
}