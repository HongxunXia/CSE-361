package com.gwt.cse361UI.client.loginPage;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;

public class LoginPanel extends Composite {
	private TextBox textBoxUsername;
	private TextBox textBoxPassword;
	private Button btnSignIn;

	public LoginPanel() {
		
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		initWidget(verticalPanel);
		
		Label lblSignInTo = new Label("Sign in to your account ");
		lblSignInTo.setStyleName("gwt-Label-Login");
		verticalPanel.add(lblSignInTo);
		
		FlexTable flexTable = new FlexTable();
		verticalPanel.add(flexTable);
		
		Label lblUsername = new Label("Username:");
		lblUsername.setStyleName("gwt-Label-Login");
		flexTable.setWidget(0, 0, lblUsername);
		
		textBoxUsername = new TextBox();
		flexTable.setWidget(0, 1, textBoxUsername);
		
		Label lblPassword = new Label("Password:");
		lblPassword.setStyleName("gwt-Label-Login");
		flexTable.setWidget(1, 0, lblPassword);
		
		textBoxPassword = new TextBox();
		flexTable.setWidget(1, 1, textBoxPassword);
		
		CheckBox chckbxRememberMeOn = new CheckBox("Remember me on this computer");
		flexTable.setWidget(2, 1, chckbxRememberMeOn);
		
		btnSignIn = new Button("Sign In");
		btnSignIn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (textBoxUsername.getText().length() == 0
						|| textBoxPassword.getText().length() == 0) {
						Window.alert("Username or password is empty."); 
					}
			}
		});
		flexTable.setWidget(3, 1, btnSignIn);
	}
	
	/**Returns the login button
	 * 
	 * @return The login button
	 * */
	public Button getLoginbutton() {
		return btnSignIn;
	}

	public TextBox getTextBoxUsername() {
		return textBoxUsername;
	}

	public void setTextBoxUsername(TextBox textBoxUsername) {
		this.textBoxUsername = textBoxUsername;
	}

	public TextBox getTextBoxPassword() {
		return textBoxPassword;
	}

	public void setTextBoxPassword(TextBox textBoxPassword) {
		this.textBoxPassword = textBoxPassword;
	}
	


}
