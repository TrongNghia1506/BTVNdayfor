package Main.com;

import java.util.List;
import java.util.Scanner;

import WorkerService.com.WorkerServiceInterface;
import communityuni.com.Worker;
import service.com.WorkerService;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WorkerServiceInterface workerservice = new WorkerService();
		System.out.println("Worker Manager");
		List<Worker> workers = workerservice.insert(scanner);
		workerservice.show(workers);
		
	}

}
