package MVP.main;


public class MVPmain {
	public static void main(String[] args) {
		IModel model = new Calendar();
		CalendarView view = new CalendarView();
		CalendarPresenter presenter =new CalendarPresenter(model,view);
	}
}
