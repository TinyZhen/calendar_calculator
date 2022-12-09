package MVP.main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalAdjusters.lastInMonth;

public class Calendar implements IModel {
	private LocalDate date;
	private int numShopday;
	private String sign;

	public Calendar() {
		date = null;
		numShopday = 0;
	}

	public String getcurdate() {
		return "" + date;
	}

	@Override
	public void shopdaycalculator() {
		int year;
		long days, weeks;
		numShopday = 0;
		year = date.getYear();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate endDate = LocalDate.parse("12/25/" + year, formatter);
		LocalDate Eve = LocalDate.parse("12/24/" + year, formatter);
		LocalDate thanksgiving = LocalDate.of(year, 11, 1).with(lastInMonth(DayOfWeek.THURSDAY));
		days = ChronoUnit.DAYS.between(date, endDate);
		weeks = ChronoUnit.WEEKS.between(date, endDate);
		if (!Eve.equals(DayOfWeek.SUNDAY))
			numShopday -= 1;
		numShopday += days;
		if (date.compareTo(thanksgiving) < 0)
			numShopday -= 1;
		if(days>7)
			numShopday -=weeks;
	}

	@Override
	public int getshopdate() {
		return numShopday;
	}

	@Override
	public void findzodiac() {
		switch (date.getMonthValue()) {
		case 1:
			if (date.getDayOfMonth() < 20)
				sign = "Capricorn";
			else
				sign = "Aquarius";
			break;
		case 2:
			if (date.getDayOfMonth() < 20)
				sign = "Aquarius";
			else
				sign = "Pisces";
			break;
		case 3:
			if (date.getDayOfMonth() < 21)
				sign = "Pisces";
			else
				sign = "Aries";
			break;
		case 4:
			if (date.getDayOfMonth() < 20)
				sign = "Aries";
			else
				sign = "Taurus";
			break;
		case 5:
			if (date.getDayOfMonth() < 21)
				sign = "Taurus";
			else
				sign = "Gemini";
			break;
		case 6:
			if (date.getDayOfMonth() < 21)
				sign = "Gemini";
			else
				sign = "Cancer";
			break;
		case 7:
			if (date.getDayOfMonth() < 23)
				sign = "Cancer";
			else
				sign = "Leo";
			break;
		case 8:
			if (date.getDayOfMonth() < 23)
				sign = "Leo";
			else
				sign = "Virgo";
			break;
		case 9:
			if (date.getDayOfMonth() < 23)
				sign = "Virgo";
			else
				sign = "Libra";
			break;
		case 10:
			if (date.getDayOfMonth() < 23)
				sign = "Libra";
			else
				sign = "Scorpio";
			break;
		case 11:
			if (date.getDayOfMonth() < 22)
				sign = "Scorpio";
			else
				sign = "Sagittarius";
			break;
		case 12:

			if (date.getDayOfMonth() < 22)
				sign = "Sagittarius";
			else
				sign = "Capricorn";
			break;
		}

	}

	@Override
	public String getzodiac() {
		return sign;
	}

	@Override
	public String getnextdate() throws NullPointerException {
		return "" + date.plusDays(1);
	}

	@Override
	public String getprevdate() throws NullPointerException {
		return "" + date.minusDays(1);
	}

	@Override
	public String getweek() throws NullPointerException {
		return "" + date.getDayOfWeek();
	}

	@Override
	public LocalDate getdate() {
		return date;
	}

	@Override
	public void setdate(String string) throws DateTimeParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		date = LocalDate.parse(string, formatter);
	}

}
