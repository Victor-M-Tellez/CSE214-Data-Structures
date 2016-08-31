package cse214hw1;
import java.util.Scanner;
/**
* The <code>SongRecord</code> class creates SongRecord Objects.
* These SongRecord objects contain the information of one song.
* Information includes Title,Artist name, Minutes length,Seconds length.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class SongRecord {
	Scanner in = new Scanner(System.in);
	//DATA****************************************
	private String title;
	private String artist;
	private int min;
	private int sec;
	
	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It asks the user to input the information to fill out
	    * the information for the particular song object.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the SongRecord Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new SongRecord object with its very own referrence
	    *
	    **/
	public SongRecord(){
		
		System.out.printf("Enter the song title: ");
		setTitle(in.nextLine());
		System.out.printf("Enter the song artist: ");
		setArtist(in.nextLine());
		
		//setTitle( System.console().readLine("Enter the title: "));
		//setArtist(System.console().readLine("Enter the artist: "));
		System.out.printf("Enter the song length (minutes): ");
		setMin(in.nextInt());
		System.out.printf("Enter the song length (seconds): ");
		setSec(in.nextInt());
	}
	/**
	    * This is a constructor that takes all data parameters.
	    * It gets all the parametters passed to it the title and 
	    * artist (both strings) as well as two member variables 
	    * for the song's length in minutes and seconds (both ints)
	    *
	    * @param String title, String artist, int minutes, int seconds
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the SongRecord Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new SongRecord object with its very own referrence
	    *
	    **/
	public SongRecord(String title, String artist, int min, int sec) {
        this.title = title;
        this.artist = artist;
        this.min = min;
        this.sec = sec;
	}
	
	//GETTERS************************************
	/**
	    * Gets the value at variable title
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type SongRecord 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private title variable
	    *    and returns whatever String value is being held
	    *    by the title variable
	    *
	    * @returns String title
	    * 
	    **/
	public  String getTitle(){
		return title;
	}
	/**
	    * Gets the value at variable artist
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type SongRecord 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private artist variable
	    *    and returns whatever String value is being held
	    *    by the artist variable
	    *
	    * @returns String artist
	    * 
	    **/
	public  String getArtist(){
		return artist;
	}
	/**
	    * Gets the value at variable sec
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type SongRecord 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private sec variable
	    *    and returns whatever String value is being held
	    *    by the sec variable
	    *
	    * @returns Int sec
	    * 
	    **/
	public  int getSec(){
		return sec;
	}
	/**
	    * Gets the value at variable min
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type SongRecord 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private min variable
	    *    and returns whatever String value is being held
	    *    by the min variable
	    *
	    * @returns int min
	    * 
	    **/
	public  int getMin(){
		return min;
	}
	
	//SETTERS************************************
	/**
	    * Allows the user to access the private data field
	    * of title, and gives them access to changing the value.
	    *
	    * @param String title 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable title for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setTitle(String title){
		this.title=title;
	}
	/**
	    * Allows the user to access the private data field
	    * of artist, and gives them access to changing the value.
	    *
	    * @param String artist 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable artist for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setArtist(String artist){
		this.artist=artist;
	}
	/**
	    * Allows the user to access the private data field
	    * of min, and gives them access to changing the value.
	    *
	    * @param int min 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function
	    *    and int must be greater than or equal to 0.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable min for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>min</code> is less than zero
	    * 
	    **/
	public void setMin(int min){
		if(min>=0){
			this.min=min;
		}else{
			throw new IllegalArgumentException("UNREAL NUMBER OF MINUTES");
		}
	}
	/**
	    * Allows the user to access the private data field
	    * of sec, and gives them access to changing the value.
	    *
	    * @param int sec 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function,
	    *    and int must be less than 60 and greater than or equal to 0.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable sec for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>sec</code> is less than zero or greater than 60.
	    * 
	    **/
	public void setSec(int sec){
		if(sec<60){
			this.sec=sec;
		}else{
			throw new IllegalArgumentException("UNREAL NUMBER OF SECONDS");
			}
	}
	
	//OVERRIDE************************************
	/**
	    * Overrides the toString from the Object Class
	    * creates a custom String that is later used in Playlist Class
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> SongRecord Object
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns custom made string 
	    *
	    * @returns Returns custom made string 
	    * 
	    **/
	@Override
	public String toString(){
		return this.title+"\t\t"+this.artist+"\t\t"+this.min+":"+this.sec+"\n";
	}
	/**
	    * Overrides the equals method from the Object class.
	    * this compares two SongRecord object by checking that
	    * the values of the parameters are the same not if
	    * they have the same reference.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> SongRecord Object
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns boolean true if the SongRecord objects are the same.
	    *
	    * @returns Returns boolean true if the SongRecord objects are the same. 
	    * 
	    **/
	@Override
	public boolean equals(Object obj){
		if (obj instanceof SongRecord){
			String a = this.getArtist();
			String b = ((SongRecord) obj).getArtist();
			String c = this.getTitle();
			String d = ((SongRecord) obj).getTitle();
			int e = this.getMin();
			int f = ((SongRecord) obj).getMin();
			int g= this.getSec();
			int h= ((SongRecord)obj).getSec();
			return a.equals(b)&& c.equals(d) && e==f&&g==h;
		}
		else 
			return false;
	}
	/**
	    * Overrides the clone method of the Object class.
	    *
	    * @param None
	    *    
	    *  
	    * <dt>Preconditions:
	    *    <dd> must have a SongRecord object you want to clone
	    *
	    * <dt>Postconditions:
	    *    <dd> returns a identical copy of the SongRecord Object,
	    *    however they have different references
	    *
	    * @returns SongRecord object 
	    * 
	    **/
	@Override
	public Object clone() {
        SongRecord cloned;
        cloned = new SongRecord (getTitle(), getArtist(), getMin(), getSec());
        return cloned;
    }
	//OTHER************************************
	/**
	    * Compares the current value for in the artist variable
	    * to a user inputed variable name artist.
	    *
	    * @param String artist
	    *  
	    * <dt>Preconditions:
	    *    <dd> user must input String value
	    *
	    * <dt>Postconditions:
	    *    <dd> Compares the two strings and gives a true value
	    *    if the strings are the same.
	    *
	    * @returns boolean
	    *
	    **/
	public boolean artistCompare(String artist){
		if(this.getArtist().equals(artist)){
			return true;
		}
		return false;
	}
	/**
	    * Returns a string type in a special format that is later used 
	    * in the PlaylistOperations Class
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> SongRecord object 
	    *
	    * <dt>Postconditions:
	    *    <dd>returns String in a custom format
	    *
	    * @returns returns String
	    **/
	public String printSingle(){
		return(this.title+" By "+this.artist+"\n");
	}
	
	public static void main(String[] args){
		SongRecord a =new SongRecord("victor", "tellez", 1, 2);
		SongRecord b =new SongRecord("wrong", "tellez", 1, 2);
		SongRecord c =new SongRecord("victor", "wrong", 1, 2);
		SongRecord d =new SongRecord("victor", "tellez", 11, 2);
		SongRecord e =new SongRecord("victor", "tellez", 1, 22);
		SongRecord f =new SongRecord("victor", "tellez", 1, 2);
		System.out.println("does a=b(all same except title): "+a.equals(b));
		System.out.println("does a=c(all same except artist): "+a.equals(c));
		System.out.println("does a=d(all same except minutes): "+a.equals(d));
		System.out.println("does a=e(all same except seconds): "+a.equals(e));
		System.out.println("does a=f(all same): "+a.equals(f));
		
		
	}
	
	

}