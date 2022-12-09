package MVP.main;

import java.awt.event.ActionListener;

public interface IView {
	void addButtonActionListener(ActionListener e);

	String getText();

	void setdate(String text);


	void setnextdate(String text);


	void setprevdate(String text);


	void setshopdate(int a);


	void setweek(String text);


	void setzodiac(String text);
	
	void seterro();
}
