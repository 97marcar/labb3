
import java.util.*;


public class FIFO implements Queue {
	private List<Object> queue = new ArrayList<Object>();
	private int maxsize = 0;
	
	public void add(Object item){
		queue.add(item);
		if (queue.size() > maxsize){
			maxsize = queue.size();
		}
	}
	
	public void removeFirst(){
		if(!isEmpty()){
			queue = queue.subList(1, queue.size());
		}else{
			throw new NoSuchElementException();
		}
		
	}
	
	public int size(){
		return(queue.size());
	}
	
	public int maxSize(){
		return(maxsize);
	}
	
	public boolean isEmpty(){
		if(queue.size() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public Object first(){
		if(queue.size() == 0){
			throw new NoSuchElementException();
		}
		return(this.queue.get(0));
	}
	
	public boolean equals(Object f){
		
		//Checks if the f is of type FIFO
		//if not it throws an error.
		if (f.getClass() == this.getClass()){
			FIFO f2 = ((FIFO) f);
			
			//Makes sure the size of both objects
			// are the same.
			if(this.size() == f2.size()){
				
				//loops though both objects lists.
				for(int i = 0; i < this.size(); i++){
					Object objThis = this.queue.get(i);
					Object objF = f2.getQ().get(i);
					
					if(objThis == null || objF == null){
						if(objThis == null && objF == null){
							continue;
						}else{
							return false;
						}
					}else if(objThis.getClass() == objF.getClass()){
						continue;
					}else{
						return false;
					}
				}
			}else{
				return false;
			}
			return true;
				
		}else{
			throw new ClassCastException();
		}
		
		
		
	}
	
	public List<Object> getQ(){
		return(this.queue);
	}
	
	public String toString(){
		String s = "Queue: ";
		for(int elem = 0; elem < queue.size(); elem++){
			s = s+"(" + String.valueOf(queue.get(elem)) + ") ";
		}
		return(s);
	}
	
	
	

	
	
	
	public static void main(String[] args) {
		
	}

}
