package com.gwt.cse361UI.client.loginPage;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

public class LoginPage extends Composite {
	
	/**don't need the footer and header for now */
	private LoginFooter loginFooter=new LoginFooter();
	private LoginHeader loginHeader=new LoginHeader();
	public LoginPanel loginPanel= new LoginPanel();
	
	/**Main panel of the login view*/
    private VerticalPanel mainpanel = new VerticalPanel();
	
	/**the Image that shows on the login page	 */
	private Image logo = new Image("resources/images/loginpage-logo.jpg");
	
	/**The headline below the logo*/
	private HTML secondoHeadline = new HTML("<h1>CSCE361 Project-Campus Picture Showcase</h1>");

	
	
	
	
	
	public LoginPage() {
    	//int windowHeight = Window.getClientHeight();
		int windowWidth = Window.getClientWidth();
		
		
		logo.setPixelSize(windowWidth, 200);
		mainpanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		
		
		mainpanel.add(logo);
		mainpanel.add(secondoHeadline);
		mainpanel.add(loginPanel);
		
		
	}






	public LoginPanel getLoginPanel() {
		return loginPanel;
	}




	public Button getLoginButton(){
		return loginPanel.getLoginbutton();
		
	}
	
	
	public TextBox getLoginUsername(){
		return loginPanel.getTextBoxUsername();
		
	}
	
	public TextBox getLoginPassword(){
		return loginPanel.getTextBoxPassword();
		
	}

	public void setLoginPanel(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}






	public VerticalPanel getMainpanel() {
		return mainpanel;
	}






	public void setMainpanel(VerticalPanel mainpanel) {
		this.mainpanel = mainpanel;
	}






	public Image getLogo() {
		return logo;
	}






	public void setLogo(Image logo) {
		this.logo = logo;
	}






	public HTML getSecondoHeadline() {
		return secondoHeadline;
	}






	public void setSecondoHeadline(HTML secondoHeadline) {
		this.secondoHeadline = secondoHeadline;
	}






	public LoginFooter getLoginFooter() {
		return loginFooter;
	}






	public void setLoginFooter(LoginFooter loginFooter) {
		this.loginFooter = loginFooter;
	}






	public LoginHeader getLoginHeader() {
		return loginHeader;
	}






	public void setLoginHeader(LoginHeader loginHeader) {
		this.loginHeader = loginHeader;
	}

}
