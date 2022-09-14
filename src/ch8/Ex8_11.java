package ch8;

public class Ex8_11 {
    public static void main(String[] args) {
        try {
            startInstall();
        } catch (SpaceException e) {
            throw new RuntimeException(e);
        } catch (MemoryException memoryException) {

        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }

    static boolean enoughSpace() {
        // 설치하는데 필요한 저장공간이 있는지 확인한다
        return false;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인한다
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}