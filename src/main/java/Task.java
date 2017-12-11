import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Task{

	private String mDescription;
	private boolean mCompleted;
	private int mId;
	private LocalDateTime mCreatedAt;
	private static List<Task> instances = new ArrayList<Task>();


	public Task(String description){
		mDescription=description;
		mCompleted=false;
		mCreatedAt=LocalDateTime.now();
		instances.add(this);
		mId=instances.size();
	}
	public String getDescription(){
		return mDescription;
	}
	public boolean isCompleted(){
		return mCompleted;
	}
	public LocalDateTime getCreatedAt(){
		return mCreatedAt;
	}
	public static List<Task> all(){
		return instances;
	}
	public static void clear(){
		instances.clear();
	}
	public int getId(){
		return mId;
	}
	public static Task find(int id){
		return instances.get(id - 1);
	}
}