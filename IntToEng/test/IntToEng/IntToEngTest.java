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

}
