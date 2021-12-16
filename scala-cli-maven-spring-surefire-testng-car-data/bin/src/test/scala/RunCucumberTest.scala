import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

class RunCucumberTest extends AbstractTestNGCucumberTests {

  @DataProvider(parallel = true)
  override def scenarios(): Any = super.scenarios();
}
