import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

import example.model.Car
import example.service._

class class CarPrice {

  @When("^Car created$")
  def createCar(): Car = {
     val service = new CarServiceImpl();
     return service.createCar();
  }

  @Then("^Car price should be 0$")
  def checkPrice(): Unit = {
    val car = createCar()
     Assert.assertEquals(car.price, 0);
  }
}
