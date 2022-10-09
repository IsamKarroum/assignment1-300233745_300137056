
public class PointCP2 extends PointCP5 {
	private double xOrRho;

	private double yOrTheta;
	
	private char typeCoord;

	public PointCP2(char type,double xOrRho, double yOrTheta){
		if(type != 'P')
		      throw new IllegalArgumentException();
	    this.xOrRho = xOrRho;
	    this.yOrTheta = yOrTheta;
	    typeCoord = type;
	  }
	public double getX(){ 
	      return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
	  }
	  public double getY(){
	      return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
	  }
	  public double getRho(){
	      return xOrRho;
	  }
	  public double getTheta(){
	      return yOrTheta;
	  }
	  public double getDistance(PointCP2 pointB){
	    double deltaX = getX() - pointB.getX();
	    double deltaY = getY() - pointB.getY();
	    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	  }
	  public PointCP2 rotatePoint(double rotation){
	    double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	    return new PointCP2('C',(Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	  }
	  public String toString()
	  {
		  return "Stored as " + (typeCoord == 'C' 
			       ? "Cartesian  (" + getX() + "," + getY() + ")"
			       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
	       
	  }
}


