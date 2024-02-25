
public class  CarClient {

  public static void main(String[] args){
    CarServiceInject carServiceInject = new HyundauiCarServiceInjectImpl();
    CarSaleConsumer carSaleConsumer = carServiceInject.getCarService();
    carSaleConsumer.saleCar("현대", "그랜저");
  }
}

class  CarApplication implements CarSaleConsumer {
  private CarService carService  ;
  public CarApplication(CarService carService) {
    this.carService = carService;
  }
  @Override
  public void saleCar(String manufacturer, String carType) {
    carService.sale(manufacturer, carType);
  }
}

interface CarSaleConsumer {
  void saleCar(String manufacturer, String carType);
}
interface CarServiceInject {
  CarSaleConsumer getCarService();
}
class HyundauiCarServiceInjectImpl implements CarServiceInject {
  @Override
  public CarSaleConsumer getCarService() {
    return new CarApplication( new HyundauiCarServiceImpl() );
  }
}



interface CarService {
  void sale(String manufacturer, String carType) ;
}
class HyundauiCarServiceImpl implements CarService {
  @Override
  public void sale(String manufacturer, String carType) {
    System.out.println("제조사 : "  +manufacturer + " 차종 : " + carType + " 판매힙니다.");
  }
}
