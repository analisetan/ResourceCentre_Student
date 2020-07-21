import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		// Item list is not null, so that can add a new item
				assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
						
				//Given an empty list, after adding 1 item, the size of the list is 1
				ResourceCentre.addChromebook(chromebookList, cc1);		
				assertEquals("Test if that Chromebook arraylist size is 2?", 2, chromebookList.size());
						
				//The item just added is as same as the first item of the list
				assertSame("Test that Chromebook is added same as 2nd item of the list?", cc2, chromebookList.get(0));
						
				//Add another item. test The size of the list is 2?
				ResourceCentre.addChromebook(chromebookList, cc3);
				assertEquals("Test that Camcorder arraylist size is 3?", 3, chromebookList.size());
			}
		return output;
	}
}


