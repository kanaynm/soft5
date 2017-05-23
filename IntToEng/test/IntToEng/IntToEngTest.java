package IntToEng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	
	public void translateEngで0の答えはzero() {
		String expected = "zero";
		String actual=IntToEng.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで1の答えはone() {
		String expected = " one";
		String actual=IntToEng.translateEng(1);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで10の答えはten() {
		String expected = "ten";
		String actual=IntToEng.translateEng(10);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで11の答えはeleven() {
		String expected = "eleven";
		String actual=IntToEng.translateEng(11);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで20の答えはtwenty() {
		String expected = "twenty ";
		String actual=IntToEng.translateEng(20);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで21の答えはtwentyone() {
		String expected = "twenty one";
		String actual=IntToEng.translateEng(21);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで100の答えはonehundred() {
		String expected = "one hundred  ";
		String actual=IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで101の答えはonehundredone() {
		String expected = "one hundred  one";
		String actual=IntToEng.translateEng(101);
		assertThat(actual,is(expected));
	}

	@Test
	public void translateEngで1234の答えはonethousandtwohundredthirtyfour() {
		String expected = " one thousand two hundred thirty four";
		String actual=IntToEng.translateEng(1234);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEngで51234の答えはfiftyonethousandtwohundredthirtyfour() {
		String expected = "fifty one thousand two hundred thirty four";
		String actual=IntToEng.translateEng(51234);
		assertThat(actual,is(expected));
	}

	@Test
	public void translateEngで651234の答えはsixhundredfiftyonethousandtwohundredthirtyfour() {
		String expected = "six hundred fifty one thousand two hundred thirty four";
		String actual=IntToEng.translateEng(651234);
		assertThat(actual,is(expected));
	}

	@Test
	public void translateEngで999999の答えはninehundredninetyninethousandninehundredninetynine() {
		String expected = "nine hundred ninety nine thousand nine hundred ninety nine";
		String actual=IntToEng.translateEng(999999);
		assertThat(actual,is(expected));
	}
	@Test
	public void sanketaで1の答えはone() {
		int[]a={0,0,1};
		String expected = " one";
		String actual=IntToEng.sanketa(a);
		assertThat(actual,is(expected));
	}
	@Test
	public void sanketaで10の答えはten() {
		int[]a={0,1,0};
		String expected = "ten";
		String actual=IntToEng.sanketa(a);
		assertThat(actual,is(expected));
	}
	@Test
	public void sanketaで11の答えはeleven() {
		int[]a={0,1,1};
		String expected = "eleven";
		String actual=IntToEng.sanketa(a);
		assertThat(actual,is(expected));
	}
	@Test
	public void sanketaで100の答えはonehundred() {
		int[]a={1,0,0};
		String expected = "one hundred  ";
		String actual=IntToEng.sanketa(a);
		assertThat(actual,is(expected));
	}@Test

	public void sanketaで101の答えはonehundredone() {
		int[]a={1,0,1};
		String expected = "one hundred  one";
		String actual=IntToEng.sanketa(a);
		assertThat(actual,is(expected));
	}
	@Test

	public void judge1で1の答えはone() {
		String expected = "one";
		String actual=IntToEng.judge1(1);
		assertThat(actual,is(expected));
	}

	@Test

	public void judge1で0の答えは() {
		String expected = "";
		String actual=IntToEng.judge1(0);
		assertThat(actual,is(expected));
	}

	@Test

	public void judge10で1の答えはone() {
		String expected = " one";
		String actual=IntToEng.judge10(0,1);
		assertThat(actual,is(expected));
	}@Test

	public void judge10で10の答えはten() {
		String expected = "ten";
		String actual=IntToEng.judge10(1,0);
		assertThat(actual,is(expected));

	}@Test

	public void judge10で11の答えはeleven() {
		String expected = "eleven";
		String actual=IntToEng.judge10(1,1);
		assertThat(actual,is(expected));
	}

	@Test

	public void judge10で20の答えはtwenty() {
		String expected = "twenty ";
		String actual=IntToEng.judge10(2,0);
		assertThat(actual,is(expected));
	}	

	@Test

	public void judgeteenで0の答えはten() {
		String expected = "ten";
		String actual=IntToEng.judgeteen(0);
		assertThat(actual,is(expected));
	}	

	@Test

	public void judgeteenで1の答えはeleven() {
		String expected = "eleven";
		String actual=IntToEng.judgeteen(1);
		assertThat(actual,is(expected));
	}	
	@Test

	public void ketasuuで1の答えは1() {
		int[]a={0,0,0,0,0,1};
		int expected = 1;
		int actual=IntToEng.ketasuu(a);
		assertThat(actual,is(expected));
	}	

	@Test

	public void ketasuuで10の答えは2() {
		int[]a={0,0,0,0,1,0};
		int expected = 2;
		int actual=IntToEng.ketasuu(a);
		assertThat(actual,is(expected));
	}	
	@Test

	public void ketasuuで100の答えは3() {
		int[]a={0,0,0,1,0,0};
		int expected = 3;
		int actual=IntToEng.ketasuu(a);
		assertThat(actual,is(expected));
	}
	@Test

	public void ketasuuで1000の答えは4() {
		int[]a={0,0,1,0,0,0};
		int expected = 4;
		int actual=IntToEng.ketasuu(a);
		assertThat(actual,is(expected));
	}
	@Test

	public void ketasuuで10000の答えは5() {
		int[]a={0,1,0,0,0,0};
		int expected = 5;
		int actual=IntToEng.ketasuu(a);
		assertThat(actual,is(expected));
	}
	@Test

	public void ketasuuで100000の答えは6() {
		int[]a={1,0,0,0,0,0};
		int expected = 6;
		int actual=IntToEng.ketasuu(a);
		assertThat(actual,is(expected));
	}
}