package callable.future;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableExample2 {

	public static void main(String[] args) {
ExecutorService executor =Executors.newCachedThreadPool();
Future<?>	maths =executor.submit(new Callable<Mathematics>() {

	@Override
	public Mathematics call() throws Exception {
		Random random =new Random();
		Integer duration =random.nextInt(1000);
		System.out.println("Starting...");
		if(duration>1000){
			throw new IOException("Taking to much time");
			
		}
		Thread.sleep(duration);
		System.out.println("Finished");
		return new Mathematics(10,5);
	}
});
executor.shutdown();


try {
System.out.println(maths.get());
Mathematics m =(Mathematics) maths.get();
m.sum();
	
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ExecutionException e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
	IOException ex =(IOException) e.getCause();
	System.out.println(ex.getMessage());
	
	
}



}
}
