package test_suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        SampleTest.class
})
@RunWith(Categories.class)
@Categories.IncludeCategory({MyCategories.PositiveTest.class , MyCategories.NegativeTest.class})
public class MySuite {

}
