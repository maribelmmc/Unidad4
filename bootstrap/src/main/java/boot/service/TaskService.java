package boot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.*;
import boot.dao.TaskRepository;
import boot.model.Task;
import javax.transaction.*;


@Service @Transactional
public class TaskService {
	public static Object findall;
	private final TaskRepository taskRespository;

	public TaskService(TaskRepository taskRespository) {
		super();
		this.taskRespository = taskRespository;
	}
	
	
	public List<Task> findAll(){
		List<Task> tasks=new ArrayList<Task>();
		for(Task task : taskRespository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	public void save(Task task){
		taskRespository.save(task);
	}
	public void delete(int id){
		taskRespository.delete(id);
	}
	public Task findOne(int id){
		
		return taskRespository.findOne(id);
	}

}
