import org.testng.annotations.Test;

import ebay.Home;
import ebay.Results;

public class Ebay_testing
{
	@Test
    public void smokeTest() {
    	Home h = new Home();
    	h.setUp();
    	h.openUrl();
    	h.search();
    	h.validateTitle();
    	
    	Results r = new Results();
    	r.getTotalResults();
    	r.getProductList();
    }
}
