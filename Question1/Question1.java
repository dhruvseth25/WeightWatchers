import java.io.File;
import java.util.*; 


class Question1 {
	
	//Dictonary for the data
	public HashMap<String,String> dict = new HashMap<String,String>();    
	
	public static void main(String[] args){
		Question1 q1 = new Question1();
		String path = args[0];
		boolean fileExists = q1.doesFileExists(path);
		
		
		if(fileExists){
			System.out.println("\n\n----------------File exists: Loading data----------------");
			//load data
			q1.load_data(path);
			//display data
			q1.disp_data();
		}
		else{
			System.out.println("\n\n----------------File not found----------------");
		}
	}
	
	public boolean doesFileExists(String path){
		File f = new File(path);		
		return(f.exists() && f.isFile());	
	}
	
	public void load_data(String path){
		try{
			File f = new File(path);				
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String [] data_list = line.split(" – ");
				String keyWord = data_list[0];
				String valueMeaning = data_list[1];
				dict.put(keyWord, valueMeaning);
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
	
	public void disp_data(){		
		System.out.println("\n----------------Displaying data----------------\n\n");
		for(Map.Entry m:dict.entrySet()){  
			System.out.println(m.getKey().toString().trim());
			String [] values = m.getValue().toString().split(",");
			for(int i=0;i<values.length;i++){
				System.out.println(values[i].trim());
			}
			System.out.println("\n");
		}  
	}

}