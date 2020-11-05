
public class ThreadTwiceExample implements Runnable {
   public void run(){  
	Thread t = Thread.currentThread();
        System.out.println(java+" is executing.");
		    
   }  
   public static void main(String args[]){  
	Thread th1 = new Thread();
	th1.start();  
	th1.start();  
   } 
}
