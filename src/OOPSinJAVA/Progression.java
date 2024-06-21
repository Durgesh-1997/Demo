package OOPSinJAVA;

//1  Generates a simple progression. By default: 0, 1, 2, ...
public class Progression {
         // instance variable
        protected long current;
//        /∗∗ Constructs a progression starting at zero. ∗/
            public Progression( ) { this(0); }

//         Constructs a progression with given start value.
            public Progression(long start) { current = start; }

//         /∗∗ Returns the next value of the progression. ∗/
            public long nextValue( ) {
         long answer = current;
         advance( ); // this protected call is responsible for advancing the current value
         return answer;
        }

//         /∗∗ Advances the current value to the next value of the progression. ∗/
             protected void advance( ) {
        current++;
         }

//         /∗∗ Prints the next n values of the progression, separated by spaces. ∗/
             public void printProgression(int n) {
         System.out.print(nextValue( )); // print first value without leading space
         for (int j=1; j < n; j++)
             System.out.print(" " + nextValue( )); // print leading space before others
        System.out.println( ); // end the line
         }
 }

 class ArithmeticProgression extends Progression {

         protected long increment;

//         /∗∗ Constructs progression 0, 1, 2, ... ∗/
             public ArithmeticProgression( ) { this(1, 0); } // start at 0 with increment of 1

//         /∗∗ Constructs progression 0, stepsize, 2∗stepsize, ... ∗/
             public ArithmeticProgression(long stepsize) { this(stepsize, 0); } // start at 0

//         /∗∗ Constructs arithmetic progression with arbitrary start and increment. ∗/
             public ArithmeticProgression(long stepsize, long start) {
         super(start);
         increment = stepsize;
         }

//         /∗∗ Adds the arithmetic increment to the current value. ∗/
             protected void advance( ) {
         current += increment;
         }
 }

 class GeometricProgression extends Progression {

         protected long base;

//         /∗∗ Constructs progression 1, 2, 4, 8, 16, ... ∗/
             public GeometricProgression( ) { this(2, 1); } // start at 1 with base of 2

//         /∗∗ Constructs progression 1, b, bˆ2, bˆ3, bˆ4, ... for base b. ∗/
             public GeometricProgression(long b) { this(b, 1); } // start at 1

//        /∗∗ Constructs geometric progression with arbitrary base and start. ∗/
             public GeometricProgression(long b, long start) {
             super(start);
              base = b;
             }

//         /∗∗ Multiplies the current value by the geometric base. ∗/
             protected void advance( ) {
              current *= base;
              }
         }


 class FibonacciProgression extends Progression {

         protected long prev;

//         /∗∗ Constructs traditional Fibonacci, starting 0, 1, 1, 2, 3, ... ∗/
             public FibonacciProgression( ) { this(0, 1); }

//         /∗∗ Constructs generalized Fibonacci, with give first and second values. ∗/
              public FibonacciProgression(long first, long second) {
         super(first);
         prev = second - first; // fictitious value preceding the first
         }

//         /∗∗ Replaces (prev,current) with (current, current+prev). ∗/
             protected void advance( ) {
         long temp = prev;
         prev = current;
         current += temp;
         }
 }
///∗∗ Test program for the progression hierarchy. ∗/
          class TestProgression {
public static void main(String[ ] args) {
         Progression prog;
        // test ArithmeticProgression
         System.out.print("Arithmetic progression with default increment: ");
         prog = new ArithmeticProgression( );
         prog.printProgression(10);
         System.out.print("Arithmetic progression with increment 5: ");
         prog = new ArithmeticProgression(5);
         prog.printProgression(10);
         System.out.print("Arithmetic progression with start 2: ");
         prog = new ArithmeticProgression(5, 2);
         prog.printProgression(10);
         // test GeometricProgression
         System.out.print("Geometric progression with default base: ");
         prog = new GeometricProgression( );
         prog.printProgression(10);
         System.out.print("Geometric progression with base 3: ");
         prog = new GeometricProgression(3);
         prog.printProgression(10);
         // test FibonacciProgression
         System.out.print("Fibonacci progression with default start values: ");
         prog = new FibonacciProgression( );
         prog.printProgression(10);
         System.out.print("Fibonacci progression with start values 4 and 6: ");
         prog = new FibonacciProgression(4, 6);
         prog.printProgression(8);
         }
 }