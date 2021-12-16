import io.cucumber.java.en.Then;

import org.testng.Assert;

import example.model.Car;
import example.service._

class CarMake {
  @Then("Car make should be test")
  def checkMake(): Unit  = {
    val service = new CarServiceImpl();
    val car = service.createCar();
    Assert.assertEquals(car.make, "test");
  }
}
