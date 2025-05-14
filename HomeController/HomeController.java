package HomeController;

public class HomeController {
    // 1. 이너 인터페이스 Device
    public interface Device {
        void turnOn();
        void turnOff();
    }

    // 2. 인스턴스 멤버 이너 클래스 Light
    public class Light implements Device {
        @Override
        public void turnOn() {
            System.out.println("조명이 켜졌습니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("조명이 꺼졌습니다.");
        }
    }

    // 3. 정적 멤버 이너 클래스 Door
    public static class Door implements Device {
        @Override
        public void turnOn() {
            System.out.println("문이 열렸습니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("문이 닫혔습니다.");
        }
    }

    // 4. 지역 클래스 AirConditioner
    public void controlAllDevices() {
        class AirConditioner implements Device {
            @Override
            public void turnOn() {
                System.out.println("에어컨이 켜졌습니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨이 꺼졌습니다.");
            }
        }

        Device ac = new AirConditioner();
        ac.turnOn();
        ac.turnOff();
    }

    public static void main(String[] args) {
        HomeController controller = new HomeController();

        HomeController.Device light = controller.new Light();
        light.turnOn();
        light.turnOff();

        HomeController.Device door = new Door();
        door.turnOn();
        door.turnOff();

        controller.controlAllDevices();

        // 5. 익명 이너 클래스 사용
        Device tv = new Device() {
            @Override
            public void turnOn() {
                System.out.println("TV가 켜졌습니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV가 꺼졌습니다.");
            }
        };
        tv.turnOn();
        tv.turnOff();
    }
}

