package MVP.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MVP.main.CalendarView;

class CalendarViewTest {

	@Test
	void testAddButtonActionListener() {
		CalendarView view = new CalendarView();
		assertDoesNotThrow(() -> view.getBtn_submit().doClick());

	}
	@Test
	void testAddButtonActionListener_sendinput() {
		CalendarView view = new CalendarView();
		view.setInput("12/01/2022");
		view.getBtn_submit().doClick();
		assertFalse(view.geterror());
	}

	@Test
	void testAddButtonActionListener_senderror() {
		CalendarView view = new CalendarView();
		view.setInput("12//2022");
		view.getBtn_submit().doClick();
	}
	@Test
	void testAddButtonActionListener_senderror2() {
		CalendarView view = new CalendarView();
		view.setInput("02/30/2022");
		view.getBtn_submit().doClick();
	}
}
