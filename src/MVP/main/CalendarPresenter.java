package MVP.main;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.time.DayOfWeek;

public class CalendarPresenter {
	private IModel calendale;
	private IView view;
	private DateTimeFormatter formatter;
	private String input;

	public CalendarPresenter(IModel m, IView v) {
		this.calendale = m;
		this.view = v;

		// listen for the button press
		view.addButtonActionListener((ActionEvent e) -> {
			input = view.getText();
			try {
				updateview();
			} catch (DateTimeParseException e1) {
				view.seterro();
			}
		});
	}

	private void updateview() throws DateTimeParseException {
		if (errorinput(input)) {

			// store date to model
			calendale.setdate(input);
			calendale.shopdaycalculator();
			calendale.findzodiac();

			// update views
			view.setnextdate(calendale.getnextdate());
			view.setprevdate(calendale.getprevdate());
			view.setweek(calendale.getweek());
			view.setdate(calendale.getcurdate());
			view.setshopdate(calendale.getshopdate());
			view.setzodiac(calendale.getzodiac());
		} else
			view.seterro();
	}

	private boolean errorinput(String s) {
		Scanner scanner = new Scanner(s);
		scanner.useDelimiter("/");
		int month = 0, curday = 0, year = 0;
		try {
			month = scanner.nextInt();
			String s1 = scanner.next();
			curday = Integer.parseInt(s1);
			year = scanner.nextInt();
		} catch (Exception e) {
			view.seterro();
		}
		int day = 0;

		if (month == 2) {
			if (year % 4 == 0) {
				if (year % 100 != 0) {
					day = 29;
				} else {
					if (year % 400 == 0) {
						day = 29;
					} else
						day = 28;
				}
			} else {
				day = 28;
			}
			if (curday > day) {
				return false;
			} else
				return true;
		} else
			return true;

	}

}
