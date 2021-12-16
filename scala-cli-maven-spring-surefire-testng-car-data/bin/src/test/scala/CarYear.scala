import io.cucumber.java.en.Then;
import org.testng.Assert;

import example.model.Car;
import example.service._

class CarYear {
  @Then("Car year should be 0")
  def checkYear(): Unit = {
    val service = new CarServiceImpl();
    val car = service.createCar();
     Assert.assertEquals(car.year, 0);
  }
}
