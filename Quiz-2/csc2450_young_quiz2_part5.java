//0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0
//>> Nathan Young
//>> CSC2450 | Quiz 2, Part 5.
//0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0
package csc2450_young_quiz2_part_5;

import java.util.Scanner;

public class csc2450_young_quiz2_part5 {
	public static void main( String[] args ) {		
		try( final Scanner stdin = new Scanner( System.in ) ) {
			while( true ) {
				csc2450_young_quiz2_part5.alert( "Area computer: type [r]ectangle, [s]quare, [c]ircle, or [q]uit\n" );
				csc2450_young_quiz2_part5.alert( "------------------------------------------------------------------\n\n" );
				csc2450_young_quiz2_part5.print_cmd( 1 );
				final String uio = stdin.next();
				
				// Determine input.
				switch( uio ) {
					case "r": {
						csc2450_young_quiz2_part5.alert( "\n Rectangle selected\n" );
						csc2450_young_quiz2_part5.alert("\tEnter width (floating allowed) \n");
						csc2450_young_quiz2_part5.print_cmd( 2 );
						final float width = stdin.nextFloat();
						
						csc2450_young_quiz2_part5.alert("\tEnter height (floating allowed) \n");
						csc2450_young_quiz2_part5.print_cmd( 2 );
						final float height = stdin.nextFloat();
						
						csc2450_young_quiz2_part5.alert( String.format( "\t\t\tResult: %f units.%n",
								csc2450_young_quiz2_part5.compute_area_rectangle( width, height ) ) );
						
						break;
					}
					
					case "s": {					
						csc2450_young_quiz2_part5.alert( "\n Square selected\n" );
						csc2450_young_quiz2_part5.alert( "\tEnter side length (floating allowed) \n" );
						csc2450_young_quiz2_part5.print_cmd(2);
						final float side_length = stdin.nextFloat();
						
						
						csc2450_young_quiz2_part5.alert( String.format( "\t\t\tResult: %f units.%n",
								csc2450_young_quiz2_part5.compute_area_square( side_length ) ) );
						
						break;
					}
					
					case "c": {
						csc2450_young_quiz2_part5.alert( "\n Cricle selected\n" );
						csc2450_young_quiz2_part5.alert( "\tEnter radius (floating allowed) \n" );
						csc2450_young_quiz2_part5.print_cmd(2);
						final float radius = stdin.nextFloat();
						
						csc2450_young_quiz2_part5.alert( String.format( "\t\t\tResult: %f units. %n",
								csc2450_young_quiz2_part5.compute_area_circle( radius ) ) );
						
						break;
					}
					
					case "q": {
						csc2450_young_quiz2_part5.alert( "\n\n\t\tShutting down..." );
						
						try {
							Thread.sleep( 3000 );
							System.exit( 0 );
						} catch( Exception except ) {
							except.printStackTrace();
						} finally {
							stdin.close();
						}
							
						break;
					}
					
					default: {
						csc2450_young_quiz2_part5.alert( "\t Not a valid option... shutting down." );
						System.exit( -1 );
					}
					
				}
				
				csc2450_young_quiz2_part5.alert( "------------------------------------------------------------------\n\n\n" );
			}
		}
	}
	
	private static double compute_area_circle( final float radius ) {
		return Math.sqrt( (double)radius ) * Math.PI;
	}
	
	private static double compute_area_square( final float side_width ) {		
		return side_width * side_width;
	}
	
	private static double compute_area_rectangle( final float width, final float height ) {
		return width * height;
	}
	
	private static void alert( final String msg ) {
		System.out.print( msg );
	}
	
	private static void print_cmd( int tabs ) {
		String buf = "";
		for( int i = 0;  i != tabs; i++ ) {
			buf += "\t";
		}
		
		buf += "input\\> ";
		
		csc2450_young_quiz2_part5.alert( buf );
	}
}
