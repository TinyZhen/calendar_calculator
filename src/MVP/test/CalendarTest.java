package MVP.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import MVP.main.Calendar;

class CalendarTest {


	@Test
	void testShopdaycalculator_afterthanksgiving() {
		Calendar calendar = new Calendar();
		calendar.setdate("12/19/2022");
		calendar.shopdaycalculator();
		assertEquals(calendar.getshopdate(),5);
	}

	@Test
	void testShopdaycalculator_beforethanksgiving() {
		Calendar calendar = new Calendar();
		calendar.setdate("11/19/2022");
		calendar.shopdaycalculator();
		assertEquals(calendar.getshopdate(),29);
	}
	
	@Test
	void testShopdaycalculator_leapyear() {
		Calendar calendar = new Calendar();
		calendar.setdate("02/29/2000");
		calendar.shopdaycalculator();
		assertEquals(calendar.getshopdate(),256);
	}
	
	@Test
	void testFindzodiac_Capricorn() {
		Calendar calendar = new Calendar();
		calendar.setdate("01/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Capricorn");
	}
	@Test
	void testFindzodiac_Capricorn2() {
		Calendar calendar = new Calendar();
		calendar.setdate("12/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Capricorn");
	}
	@Test
	void testFindzodiac_Aquarius2() {
		Calendar calendar = new Calendar();
		calendar.setdate("01/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Aquarius");
	}
	
	@Test
	void testFindzodiac_Aquarius() {
		Calendar calendar = new Calendar();
		calendar.setdate("02/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Aquarius");
	}
	
	@Test
	void testFindzodiac_Pisces() {
		Calendar calendar = new Calendar();
		calendar.setdate("03/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Pisces");
	}
	
	@Test
	void testFindzodiac_Pisces2() {
		Calendar calendar = new Calendar();
		calendar.setdate("02/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Pisces");
	}
	
	@Test
	void testFindzodiac_Aries() {
		Calendar calendar = new Calendar();
		calendar.setdate("04/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Aries");
	}
	
	@Test
	void testFindzodiac_Aries2() {
		Calendar calendar = new Calendar();
		calendar.setdate("03/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Aries");
	}

	@Test
	void testFindzodiac_Taurus() {
		Calendar calendar = new Calendar();
		calendar.setdate("05/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Taurus");
	}
	
	@Test
	void testFindzodiac_Taurus2() {
		Calendar calendar = new Calendar();
		calendar.setdate("04/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Taurus");
	}
	
	@Test
	void testFindzodiac_Gemini() {
		Calendar calendar = new Calendar();
		calendar.setdate("06/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Gemini");
	}
	
	@Test
	void testFindzodiac_Gemini2() {
		Calendar calendar = new Calendar();
		calendar.setdate("05/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Gemini");
	}
	
	@Test
	void testFindzodiac_Cancer() {
		Calendar calendar = new Calendar();
		calendar.setdate("07/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Cancer");
	}
	
	@Test
	void testFindzodiac_Cancer2() {
		Calendar calendar = new Calendar();
		calendar.setdate("06/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Cancer");
	}
	
	@Test
	void testFindzodiac_Leo() {
		Calendar calendar = new Calendar();
		calendar.setdate("08/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Leo");
	}
	@Test
	void testFindzodiac_Leo2() {
		Calendar calendar = new Calendar();
		calendar.setdate("07/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Leo");
	}
	@Test
	void testFindzodiac_Virgo() {
		Calendar calendar = new Calendar();
		calendar.setdate("09/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Virgo");
	}
	@Test
	void testFindzodiac_Virgo2() {
		Calendar calendar = new Calendar();
		calendar.setdate("08/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Virgo");
	}
	@Test
	void testFindzodiac_libra() {
		Calendar calendar = new Calendar();
		calendar.setdate("10/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Libra");
	}
	@Test
	void testFindzodiac_libra2() {
		Calendar calendar = new Calendar();
		calendar.setdate("09/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Libra");
	}
	@Test
	void testFindzodiac_Scorpio() {
		Calendar calendar = new Calendar();
		calendar.setdate("11/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Scorpio");
	}
	@Test
	void testFindzodiac_Scorpio2() {
		Calendar calendar = new Calendar();
		calendar.setdate("10/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Scorpio");
	}
	@Test
	void testFindzodiac_Sagittarius() {
		Calendar calendar = new Calendar();
		calendar.setdate("12/01/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Sagittarius");
	}
	@Test
	void testFindzodiac_Sagittarius2() {
		Calendar calendar = new Calendar();
		calendar.setdate("11/23/2022");
		calendar.findzodiac();
		assertEquals(calendar.getzodiac(),"Sagittarius");
	}
	@Test
	void testGetnextdate() {
		Calendar calendar = new Calendar();
		calendar.setdate("12/01/2022");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date =LocalDate.parse("12/02/2022",formatter);
		assertEquals(calendar.getnextdate(),""+date);
	}

	@Test
	void testGetprevdate() {
		Calendar calendar = new Calendar();
		calendar.setdate("12/02/2022");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date =LocalDate.parse("12/01/2022",formatter);
		assertEquals(calendar.getprevdate(),""+date);
	}

	@Test
	void testGetweek() {
		Calendar calendar = new Calendar();
		calendar.setdate("12/02/2022");
		assertEquals(calendar.getweek(),""+DayOfWeek.FRIDAY);
	}

	@Test
	void testSetdate() {
		Calendar calendar = new Calendar();
		calendar.setdate("12/02/2022");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date =LocalDate.parse("12/02/2022",formatter);
		assertEquals(calendar.getdate(),date);
	}

}
