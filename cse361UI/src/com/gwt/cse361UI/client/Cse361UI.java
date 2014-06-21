package com.gwt.cse361UI.client;

import  com.gwt.cse361UI.client.loginPage.*;
import com.gwt.cse361UI.client.mainView.MainView;
import com.gwt.cse361UI.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Cse361UI implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);


	
	private FlowPanel header  = new FlowPanel();
	private FlowPanel content = new FlowPanel();
	private FlowPanel footer = new FlowPanel();
	
    private LoginPage loginPage= new LoginPage();
    private MainView mainView=new MainView();
   



		/**
		 * This is the entry point method.
		 */
		public void onModuleLoad() {

			// Add the nameField and sendButton to the RootPanel
			// Use RootPanel.get() to get the entire body element
			
			/* Adding an Eventhandler to the Login-Button */
	
			loginPage.getLoginButton().addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					if (loginPage.getLoginUsername().getText().length() == 0
							|| loginPage.getLoginPassword().getText().length() == 0) {
							Window.alert("Username or password is empty."); 
							
						}
					else{
						setContent(2);
					}
				}
			});
			
			
			/*Adds an event handler on the logout button of the mainview to return to login page */	    
		    this.mainView.getMainheader().getLogoutButton().addClickHandler(new ClickHandler() {
		          public void onClick(ClickEvent event) {
		        	  
		        	  setContent(0);        	  
		          }
			 });
			
			
			
			
			
			
			
			
			setContent(0);
	
			
			
			
		}
		
		
	
		/**
		 * this method sets the v
		 * @param status
		 */
		public void setContent(int status){
			switch(status){
	        case 0:
	        	 header.clear();
	 			header.add(loginPage.getLoginHeader().gethPanel());
	 			
	 			content.clear();
	 			content.add(loginPage.getMainpanel());
	 			
	 			footer.clear();
	 			footer.add(loginPage.getLoginFooter().getHpanel());
	 			
	 			/* Associate the panels with the HTML host page.*/
	 			RootPanel.get("content").add(content);

	 			RootPanel.get("header").add(header);

	 			RootPanel.get("footer").add(footer);
	            
	            break;
	        case 1:
	        	
		
			
	         break;
	        case 2:
//	        	System.out.println("setContent to mainView");
//	        	//main application view
//	        
	        	   header.clear();
	   			header.add(mainView.getMainheader().gethPanel());
	   			
	   			content.clear();
	   			content.add(mainView.getMainPanel());
	   			
	   			footer.clear();

	   		/* Associate the panels with the HTML host page.*/
	   		RootPanel.get("content").add(content);

	   		RootPanel.get("header").add(header);

	 			
	          

		

	            break;
	        default:
	            System.out.println("switch-case-defaulttext");
	        } 		
		}	
	}


