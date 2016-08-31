package cse214hw1;
import java.util.Scanner;
/**
* The <code>PlaylistOperations</code> class is the user interface that allows
* for the user to input data and control the Playlist objects
*     
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class PlaylistOperations {
	
	static Scanner in = new Scanner(System.in);
	
	  /**
	    * Inserts a new HeapItem into the heap.
	    *
	    * @param String[] args 
	    *  
	    * <dt>Preconditions:
	    *    <dd> None
	    *
	    * <dt>Postconditions:
	    *    <dd>Displays a menu for the user to interact with
	    *    the classes SongRecord, Playlist, and FullPlayListExceptions.
	    *    User can add songs to a playList array, remove them, print all songs,
	    *    get songs by particualr artist, get a song at a particular position,
	    *    get the number of songs in the playList and quit the application
	    *
	    * @returns void
	    * 
	    **/
	public static void main (String[] args)  {
		System.out.print("A) Add Song\n"//
				+"B) Print Songs by Artist \n"
				+"G) Get Song \n"//
				+"R) Remove Song\n"
				+"P) Print All Songs \n"//
				+"S) Size\n"//
				+"Q) Quit\n");
		Playlist x=new Playlist();
		int exit=0;
		int position=1;
		String artist=null;
		
		while(exit==0){
			System.out.printf("\nSelect a menu option: ");
			String menu = in.next();
			switch(menu){
				case "a" :
				case "A" :
					try{
						SongRecord  a=new SongRecord();
						
						System.out.printf("Enter the position: ");
						position= in.nextInt();
						x.addSong(a, position);
						System.out.printf("Song Added: "+ a.printSingle());
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break; 
				case "p" :
				case "P" :
					x.printAllSongs();
					break; 
				case "s" :
				case "S" :
					System.out.printf("There are %d song(s) in the current playlist.\n",x.size());
					break; 
				case "r" :
				case "R" :
					System.out.printf("Enter the position: ");
					position= in.nextInt();
					try{
					x.removeSong(position);
					System.out.printf("Song Removed at position %d\n",position);
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break; 
				case "b" :	
				case "B" :
					try{
						System.out.println("Enter the artist: ");
						artist = in.next();
						artist +=in.nextLine();
						System.out.println("artist entered is:"+artist);
						Playlist y=new Playlist();
						y=Playlist.getSongsByArtist(x, artist);
						y.printAllSongs();
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break; 
				case "g" :
				case "G" :
					System.out.printf("Enter the position: ");
					position= in.nextInt();
					String E,b,c,d;
					E="Song";
					b="Title";
					c="Artist";
					d="Length";
					System.out.printf("%s\t%s\t\t%s\t\t%s\n",E,b,c,d);
					System.out.println("-----------------------------------------------");
					try{
						System.out.printf("%d\t"+x.getSong(position).toString(), position);
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break; 
				case "q" :
				case "Q" :
					exit++;
					System.out.printf("APPLICATION ENDED");
					break;
				default : 
					System.out.printf("You chose an INVALID option try again\n");
				}
		}
	}

}