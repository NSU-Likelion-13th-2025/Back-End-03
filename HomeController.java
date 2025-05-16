package homeWork;

public class HomeController {
    interface Device{
        void turnOn();
        void turnOff();
    }

    class Light implements Device{
        public void turnOn(){
            System.out.println("조명이 켜졌습니다.");
        }
        public void turnOff(){
            System.out.println("조명이 꺼졌습니다.");
        }
    }

    static class Door implements Device{
        public void turnOn() {
            System.out.println("문이 열렸습니다.");
        }
        public void turnOff(){
            System.out.println("문이 닫혔씁니다.");
        }
    }

    public void control(){
        class AirConditioner implements Device{
            @Override
            public void turnOn() {
                System.out.println("에어컨이 켜졌습니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨이 꺼졌습니다.");
            }
        }
        AirConditioner aircon = new AirConditioner();
        aircon.turnOn();
        aircon.turnOff();

        Device tv = new Device() {
            @Override
            public void turnOn() {
                System.out.println("TV가 켜졌습니다");
            }
            public void turnOff() {
                System.out.println("TV가 꺼졌습니다");
            }
        };
        tv.turnOn();
        tv.turnOff();
    }

    public static void main(String[] args) {
        HomeController controller = new HomeController();

        HomeController.Light light = controller.new Light();
        light.turnOn();
        light.turnOff();

        Door door = new Door();
        door.turnOn();
        door.turnOff();

        controller.control();
    }
}
