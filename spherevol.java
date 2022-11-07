double sphRad;
double sphVol;
System.out.println("Enter the radius of the sphere:");
sphRad = keyboard.nextDouble();
sphVol = ( 4.0 / 3.0 ) * Math.PI * Math.pow( sphRad, 3 );
//math.pi introduces pi to the equaton//
//math.pow() is a function in java that calculates the power of a number//
System.out.println("");
System.out.println("The volume is: " + sphVol);
