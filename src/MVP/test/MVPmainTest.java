package MVP.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MVP.main.Calendar;
import MVP.main.CalendarPresenter;
import MVP.main.CalendarView;
import MVP.main.IModel;
import MVP.main.MVPmain;

class MVPmainTest {

	@Test
	void testMain() {
		MVPmain main = new MVPmain();
		main.main(null);
	}

}
