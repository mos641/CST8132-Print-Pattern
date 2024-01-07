	// Name: 		Mostapha A
	// Class: 		CST8132
	// Assessment:	Lab 1

	import java.util.Scanner;

	public class Numbers {
		//declaring arrays
		private int [] numbers;
		private int [] [] squares;
		
		//default constructor
		Numbers(){
		}
		
		//constructor for creating one dimensional array names numbers with provided size
		Numbers(int size) {
			numbers = new int[size];
		}
		
		//constructor for creating two dimensional array named squares with provided sizes
		Numbers(int row, int col) {
			squares = new int[row][col];
		}
		
		//method to generate numbers for numbers array
		public void generateNumbers() {
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = i;
			}
		}
		
		//method to print numbers array
		public void printNumbers () {
			for(int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i]+ " ");
			}
		}
		
		//method for printing the squares array
		public void printIndices() {
			//loop for rows
			for(int i=0; i<squares.length; i++) {
				//loop for columns
				for(int j=0; j<squares[i].length; j++) {
					//printing the original loop control variable comma the second loop control variable
					System.out.print(i+ "," +j+ "    ");
				}
				//printing new line for next row
				System.out.println();
			}
		}
		
		//method for generating and storing numbers in the squares array
		public void generateSquares() {
			//loop for rows
				for(int i=0; i<squares.length - 1; i++) {
					//loop for columns
					for(int j=0; j<=i; j++) {
						//assigning squares
						squares[i][j] = (((i+1) * 10)+j) * (((i+1) * 10)+j);
					}
				}		
		}
		
		//method for printing elements of squares in a pattern
		public void printSquares() {
				//loop for rows
				for(int i=0; i<squares.length; i++) {
					//loop for columns
					for(int j=0; j<squares[i].length; j++) {
						//if statement to print only if it does not equal 0
						if(squares[i][j] != 0) {
						System.out.printf("%6d", squares[i][j]);
						}else {
							//do nothing
						}
					}
					//printing new line for next row
					System.out.println();
				}	
		}
		
		//method for printing stars in a pattern
		public void printPattern() {
			//scanner for height
			Scanner input = new Scanner(System.in);
			//variable for height
			int height = 0;
			
			//while loop to validate input
			do {
				//ask for height
				System.out.print("Enter height (-1 to quit): ");
				
				//checking if its an integer
				if (input.hasNextInt()) {
					//store height
					height = input.nextInt();
					
					// if input is -1 do nothing, will exit loop
					if (height== -1) {
						//do nothing
					}
					//if its odd number and greater than or equal to 5
					else if (height % 2 == 1 && height >= 5){
						//print pattern
						//outer loop for first half of pattern, increasing spaces in middle of stars
						for(int a=1; a < height; a = a + 2) {
							//inner loops for columns
							for(int b=1; b<=a; b++) {
								//printing stars
								System.out.printf("%1s", "*");
							}
							for(int c=1; c<=(height - a)*2; c++) {
								//printing spaces
								System.out.printf("%1s", " ");
								}
							for(int d=1; d<=a; d++) {
								//printing stars
								System.out.printf("%1s", "*");
								}
							//print new line
							System.out.println();
						}
						//outer loop for second half of pattern, decreasing spaces between stars
						for(int a=height; a > 0; a = a - 2) {
							//inner loops for columns
							for(int b=1; b<=a; b++) {
								//printing stars
								System.out.printf("%1s", "*");
							}
							for(int c=1; c<=(height - a)*2; c++) {
								//printing spaces
								System.out.printf("%1s", " ");
								}
							for(int d=1; d<=a; d++) {
								//printing stars
								System.out.printf("%1s", "*");
								}
							//print new line
							System.out.println();
						}
					}
					//if its an integer but not odd or greater than 4
					else {
						//print error message and consume line
						System.out.println("Invalid entry... Must be an odd integer 5 or greater. Please try again. \n");
						input.nextLine();
					}
				}
				//if it is not an integer
				else {
					//printing error message and consume line
					System.out.println("Invalid entry... Must be an odd integer 5 or greater. Please try again. \n");
					input.nextLine();
				}
				
				//loops until user inputs -1
			} while (height != -1);
			
			//after exiting loop goodbye message
			System.out.println("Goodbye... Have a nice day");
			
			//close scanner
			input.close();
		}
		
	}