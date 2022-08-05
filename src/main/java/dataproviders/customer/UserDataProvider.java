package dataproviders.customer;

import org.testng.annotations.DataProvider;

public class UserDataProvider {

    @DataProvider(name = "userData")
    public Object[][] userData() {
        return new Object[][]{
                {"name1", "job1"},
                {"name2", "job2"},
        };
    }

    @DataProvider(name = "userData1")
    public Object[][] userData1() {
        return new Object[][]{
                {"name1", "job1"},
                {"name2", "job2"},
        };
    }
    @DataProvider(name = "userData2")
    public Object[][] userData2() {
        return new Object[][]{
                {"name1", "job1"},
                {"name2", "job2"},
        };
    }
}
