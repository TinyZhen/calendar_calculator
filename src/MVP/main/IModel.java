package MVP.main;

import java.time.LocalDate;

public interface IModel {

	void setdate(String string);
	
	String getcurdate();

	void shopdaycalculator();

	int getshopdate();

	void findzodiac();

	String getzodiac();

	String getnextdate();

	String getprevdate();

	String getweek();

	LocalDate getdate();
}
