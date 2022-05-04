//The annotation is used to indicate that the class is a web request handler

@Controller
@RequestMapping("cars")

public class CarsController{
    @RequestMapping(value ="/{name}", method = RequestMethod.GET)
    public Employee getCarsByName()
    {
        Return carsTemplate;
    }
}