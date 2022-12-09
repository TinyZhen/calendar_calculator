package MVP.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MVP.main.Calendar;
import MVP.main.CalendarPresenter;
import MVP.main.CalendarView;
import MVP.main.IModel;
import MVP.main.IView;

class CalendarPresenterTest {

	@Test
	void testCalendalePresenter() {
		new CalendarPresenter(new Calendar(),new CalendarView());
	}
	
	@Test
	void testCalendalePresenter_newaction() {
		Calendar calendar = new Calendar();
		CalendarView view = new CalendarView();
		CalendarPresenter presenter = new CalendarPresenter(calendar,view);
		view.setInput("01/01/2022");
		view.getBtn_submit().doClick();	
	}
	
	@Test
	void testCalendalePresenter_validinput() {
		Calendar calendar = new Calendar();
		CalendarView view = new CalendarView();
		CalendarPresenter presenter = new CalendarPresenter(calendar,view);
		view.setInput("1/1/2022");
		view.getBtn_submit().doClick();
		assertTrue(view.geterror());
	}
	
	@Test
	void testCalendalePresenter_validinput2() {
		Calendar calendar = new Calendar();
		CalendarView view = new CalendarView();
		CalendarPresenter presenter = new CalendarPresenter(calendar,view);
		view.setInput("/1/2022");
		view.getBtn_submit().doClick();
		assertTrue(view.geterror());
	}
	@Test
	void testCalendalePresenter_leapyear1() {
		Calendar calendar = new Calendar();
		CalendarView view = new CalendarView();
		CalendarPresenter presenter = new CalendarPresenter(calendar,view);
		view.setInput("02/30/2022");
		view.getBtn_submit().doClick();	
		assertTrue(view.geterror());
	}
	@Test
	void testCalendalePresenter_leapyear2() {
		Calendar calendar = new Calendar();
		CalendarView view = new CalendarView();
		CalendarPresenter presenter = new CalendarPresenter(calendar,view);
		view.setInput("02/29/2000");
		view.getBtn_submit().doClick();	
		assertFalse(view.geterror());
	}
	@Test
	void testCalendalePresenter_leapyear3() {
		Calendar calendar = new Calendar();
		CalendarView view = new CalendarView();
		CalendarPresenter presenter = new CalendarPresenter(calendar,view);
		view.setInput("02/29/1900");
		view.getBtn_submit().doClick();	
		assertTrue(view.geterror());
	}
	@Test
	void testCalendalePresenter_leapyear4() {
		Calendar calendar = new Calendar();
		CalendarView view = new CalendarView();
		CalendarPresenter presenter = new CalendarPresenter(calendar,view);
		view.setInput("02/29/2020");
		view.getBtn_submit().doClick();	
		assertFalse(view.geterror());
	}
	
}
