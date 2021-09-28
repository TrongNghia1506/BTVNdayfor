package service.com;
import communityuni.com.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import WorkerService.com.WorkerServiceInterface;

public class WorkerService implements WorkerServiceInterface{

	@Override
	public List<Worker> insert(Scanner scanner) {
		List<Worker> workers = new ArrayList<Worker>();
		System.out.println("Nhap vao so luong cong nhan: ");
		int total = scanner.nextInt();
		scanner.nextLine();
		
		for(int index = 0; index < total; index++) {
			Worker worker = new Worker();
			worker.input(scanner, index);
			scanner.nextLine();
			workers.add(worker);
		}
		return workers;
	}

	@Override
	public void show(List<Worker> workers) {
		int index = 0;
		for(Worker worker : workers) {
			worker.output(index);
			index++;
		}
	}
	
	 
		 
	 

}
