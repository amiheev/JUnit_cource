package test_suite;


import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;


public class SampleTest  extends Rules {

    @Test()
    @Category({PositiveTest.class})
    @UseDataProvider("loadBookNameFromFile")
    public void positiveCase1(String fileName) throws Exception {
        File sourceFile = new File(folderPath, fileName);
        Assert.assertTrue("File — "  + sourceFile.getName() + " is already exist",sourceFile.createNewFile());
    }

    @Test()
    @Category({PositiveTest.class})
    @UseDataProvider("loadBookNameFromFile")
    public void positiveCase2(String fileName) throws Exception {
        File sourceFile = new File(folderPath, fileName);
        Assert.assertTrue("File — "  + sourceFile.getName() + " is already exist",sourceFile.createNewFile());
    }

    @Test()
    @Category({PositiveTest.class})
    @UseDataProvider("loadBookNameFromFile")
    public void positiveCase3(String fileName) throws Exception {
        File sourceFile = new File(folderPath, fileName);
        Assert.assertTrue("File — "  + sourceFile.getName() + " is already exist", sourceFile.createNewFile());
    }

    @Test()
    @Category({NegativeTest.class})
    @UseDataProvider("books")
    public void negativeCase1(String fileName) throws Exception {
        File sourceFile = new File(folderPath, fileName);
        Assert.assertTrue("File — "  + sourceFile.getName() + " is already exist" , sourceFile.createNewFile());
    }

    @Test()
    @Category({NegativeTest.class})
    @UseDataProvider("books")
    public void negativeCase2(String fileName) throws Exception{
        File sourceFile = new File(folderPath, fileName);
        Assert.assertTrue("File — "  + sourceFile.getName() + " is already exist" , sourceFile.createNewFile());
    }
}
