package TestException;

class MyError extends Exception {
    public MyError(String msg) {
        super(msg);
    }
}

class MyRuntimeError extends RuntimeException {
    public MyRuntimeError(String msg) {
        super(msg);
    }
}

public class TestException {

    public static void doTryCatch() {
        try {
            throw new MyError("직접 처리한 일반 예외!");
        } catch (MyError e) {
            System.out.println("방법 1 - try-catch로 처리 완료: " + e.getMessage());
        }

        try {
            throw new MyRuntimeError("직접 처리한 실행 예외!");
        } catch (MyRuntimeError e) {
            System.out.println("방법 1 - try-catch로 실행 예외 처리 완료: " + e.getMessage());
        }
    }

    public static void doThrows() throws MyError {
        throw new MyError("전가된 일반 예외!");
    }

    public static void main(String[] args) {
        doTryCatch();

        try {
            doThrows();
        } catch (MyError e) {
            System.out.println("방법 2 - throws로 처리 완료: " + e.getMessage());
        }

        try {
            throw new MyRuntimeError("전가된 실행 예외!");
        } catch (MyRuntimeError e) {
            System.out.println("방법 2 - 실행 예외 전가 후 처리 완료: " + e.getMessage());
        }
    }
}

