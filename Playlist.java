package cse214hw1;
/**
* The <code>Playlist</code> class implements a array of <code>SongRecord</code>
* objects. It has data types max which is the max number of songs allowed on the playlist-1
* this is because the songs begin being assigned at position 1 instead of position 0 in 
* the object array. The songNum variable keeps track of how many songs are in the playlist.
* SongRecord[] playList is the array used to store the SongRecord objects.
*
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class Playlist{
	
	//DATA****************************************
	private final int max= 51;
	private int songNum=0;
	private SongRecord[] playList;
	
	//CONSTRUCTOR*******************************
	/**
	    * The default constructor that takes no parameters.
	    * It creates a new Playlist object with its own 
	    * object array. However it doesnt fill out the array.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Playlist Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Playlist object with its very own referrence
	    *
	    **/
	public Playlist(){	
	//dataType[] arrayRefVar = new dataType[arraySize];
	playList= new SongRecord[max];
	}

	//GETTER************************************
	/**
	    * Gets the value at variable songNum, this is the number
	    * of songs in the playlist
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Playlist 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private songNum variable
	    *    and returns whatever int value is being held
	    *    by the songNum variable
	    *
	    * @returns int songNum
	    * 
	    **/
	public int size(){
		return this.songNum;
	}
	/**
	    * Gets the object at the specific position in 
	    * the array that is defined by the user.
	    *
	    * @param int position, which indicates the song number that the user wants
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Playlist and
	    *    the position must be of type int, greater than 0 less than 51 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the SongRecord object
	    *    that is stored at the particular position in
	    *    the playList array
	    *
	    * @returns SongRecord object
	    * 
	    * Indicates that <code>position</code> is less than zero or greater than 50
	    * or greater than the number of songs+1.
	    * 
	    **/
	public SongRecord getSong(int position){
		if(position<=(this.size()) && position>0){
			return this.playList[position];
		}else{
			throw new IllegalArgumentException("POSITION NOT IN RANGE");
		}
	}
	
	//SETTER************************************
	/**
	    * Allows the user to access the private data field
	    * of songNum, and gives them access to changing the value.
	    *
	    * @param int num 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable songNum for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setNum(int num){
		this.songNum= num;
	}
	/**
	    * Allows the user to add a new SongRecord object the 
	    * current playList array at whatever position the user wants.
	    *
	    * @param SongRecord song,int position  
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function,
	    *    that is greater than 0 and less than 51. The object
	    *    that is passed must be of type SongRecord.
	    *
	    * <dt>Postconditions:
	    *    <dd>Adds a new SongRecord object at the desired position
	    *    in the playList array.Also increments the songNum variable
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>position</code> is less than zero or greater than 50
	    * or greater than the number of songs+1.
	    * @exception FullPlaylistException
	    * Indicates that <code>songNum</code> greater than or equal to 50
	    * So the playList is full.
	    * 
	    **/
	public void addSong(SongRecord song,int position)throws FullPlaylistException{
		if(this.size()<max){	
			if(position<=(this.size()+1) &&position>0 && position<max){	
				if(position>songNum){
					playList[position]= song;	//create a new song record object
				}else{
					for(int a=songNum+1;a>position;a--){
						playList[a]=playList[a-1];
					}
					playList[position]= song;
				}
				songNum++;
			}else{
				throw new IllegalArgumentException("POSITION NOT IN RANGE");
			}
		}else{
			throw new FullPlaylistException("PLAYLIST IS FULL!!!!");
		}
	} 
	/**
	    * Allows the user to remove an existing SongRecord object from the 
	    * current playList array at whatever position the user wants.
	    *
	    * @param int position  
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function,
	    *    that is greater than 0 and less than 51 or songNum.
	    *
	    * <dt>Postconditions:
	    *    <dd>Removes a SongRecord object from the desired position
	    *    in the playList array.Also decrements the songNum variable
	    *
	    * @returns void
	    * 
	    * Indicates that <code>position</code> is less than zero
	    * or greater than the number of songs available.
	    * 
	    **/
	public void removeSong(int position){
		if(position<=this.size()&&position>0){
			if(position==songNum){
				playList[position]=null;
			}else{
				for(int a= position;a<songNum;a++){
					playList[a]=playList[a+1];
				}	
				playList[songNum]=null;
			}
			songNum--;
		}else{
			throw new IllegalArgumentException("POSITION IS NOT IN RANGE");
		}
	}
	
	//OVERRIDE**********************************
	/**
	    * Overrides the equals method from the Object class.
	    * this compares two Playlist objects by checking that
	    * the values of the parameters are the same not if
	    * they have the same reference.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Playlist Object
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns boolean true if the Playlist objects are the same.
	    *
	    * @returns Returns boolean true if the Playlist objects are the same. 
	    * 
	    **/
	@Override
	public boolean equals(Object obj){
		if(this.size()==((Playlist) obj).size()){
			int table=0;
			for(int a=songNum;a>0;a--){
				SongRecord x= (SongRecord)this.getSong(a);
				SongRecord y= (SongRecord)((Playlist) obj).getSong(a);
				if(x.equals(y)){
					table++;
				}
			}
			return table==songNum;	
		}else 
			return false;
	}
	/**
	    * Overrides the toString from the Object Class
	    * creates a custom String that has all the SongRecord
	    * objects stored in the playlist formatted into a neat table
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Playlist Object
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns custom made string 
	    *
	    * @returns Returns custom made string 
	    * 
	    **/
	@Override
	public String toString(){
		String x="";
		for (int a=1;a<=this.size();a++){
			x+= a+"\t"+this.getSong(a).toString()+"";
		}
		return x;
	}
	/**
	    * Overrides the clone method of the Object class.
	    *
	    * @param None
	    *  
	    * <dt>Preconditions:
	    *    <dd> must have a Playlist object you want to clone
	    *
	    * <dt>Postconditions:
	    *    <dd> returns a identical copy of the Playlist Object,
	    *    however they have different references
	    *
	    * @returns Playlist object 
	    * 
	    **/
	@Override
	public Object clone() {
		Playlist cloned = new Playlist();
		for (int i = 1; i <= size(); i++) {
			cloned.playList[i] = (SongRecord) playList[i].clone();
		}
	    cloned.setNum(size());
	    return cloned;
	}
	
	//OTHER*************************************
	/**
	    * Returns a new Playlist object that has an array
	    * filled with the SongRecords of a user specified 
	    * artist
	    *
	    * @param Playlist originalList, String artist
	    *    
	    *  
	    * <dt>Preconditions:
	    *    <dd> originalList must be type Playlist, 
	    *    artist must be type String
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns a new Playlist object that has an array
	    * filled with the SongRecords of a user specified 
	    * artist
	    *
	    * @returns Playlist object
	    * 
	    **/
	public static Playlist getSongsByArtist(Playlist originalList, String artist){
		Playlist newartist = (Playlist) originalList.clone();
		for(int a=originalList.size();a>0;a--){
			SongRecord x=newartist.getSong(a);
			if( !x.artistCompare(artist)){
				newartist.removeSong(a);
			}
		}
		return newartist;
	}	
	/**
	    * Prints all the information of every SongObeject
	    * that is being stored in the playList array for the 
	    * specific Playlist object.
	    *
	    * @param None
	    *    
	    *  
	    * <dt>Preconditions:
	    *    <dd> Must be Playlist object
	    *
	    * <dt>Postconditions:
	    *    <dd>prints a chart of all the information of the 
	    *    SongRecords that are being stored in the specific 
	    *    Playlist array.
	    *
	    * @returns void
	    *
	    **/
	public void printAllSongs(){
		String a,b,c,d;
		a="Song";
		b="Title";
		c="Artist";
		d="Length";
		System.out.printf("%s\t%-29s%-29s%s\n",a,b,c,d);
		System.out.println("----------------------------------------------------------------------------------");
		for(int x=1;x<=songNum;x++){
			System.out.printf("%d\t%-29s%-29s%d:%02d\n", x, this.getSong(x).getTitle(),
					this.getSong(x).getArtist(),this.getSong(x).getMin(),this.getSong(x).getSec());
			//System.out.printf("%d\t"+this.getSong(x).toString(), x);
		}
		
	}

}