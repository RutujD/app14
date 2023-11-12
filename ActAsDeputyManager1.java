package app14.com.test;

public class ActAsDeputyManager1 {
	public static void main(String[] args) {
        Management deputyManager = new Management() {
            @Override
            public void manage() {
                System.out.println("係長代理です。");
            }
        };

        deputyManager.manage();
    }
}
