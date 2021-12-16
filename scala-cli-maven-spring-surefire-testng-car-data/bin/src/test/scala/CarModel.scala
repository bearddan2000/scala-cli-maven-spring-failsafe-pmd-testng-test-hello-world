import io.cucumber.java.en.Then;

import org.testng.Assert;

import example.model.Car;
import example.service._

class class CarModel {
  @Then("Car model should be test")
  def checkModel(): Unit = {
    val service = new CarServiceImpl();
    val car = service.createCar();
     Assert.assertEquals(car.model, "test");
  }
}
