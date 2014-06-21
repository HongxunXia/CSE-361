

package com.gwt.cse361UI.client.mainView;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {

	/**The main panel of the main view*/
	private VerticalPanel mainPanel = new VerticalPanel();
	private HTML defaultText = new HTML("<center><h2>Main View of the application</h2></center><p/>");
	private Image defaultImage = new Image("resources/images/mainViewPic.jpg");

	private Header header = new Header();

	public MainView() {
		
		mainPanel.add(defaultText);
		defaultImage.setWidth("600px");
		mainPanel.add(defaultImage);
	}

	
	/**Returns the main panel of the main view
	 * 
	 * @return The main panel of the main view
	 * */
	public VerticalPanel getMainPanel() {
		return mainPanel;
	}
	
	/**Returns the header of the main view
	 * 
	 * @return The header of the main view
	 * */
	public Header getMainheader() {
		return header;
	}

}
