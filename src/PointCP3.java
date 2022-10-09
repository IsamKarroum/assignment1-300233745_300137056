
public class PointCP3 extends PointCP5 {
	private char typeCoord;
	private double xOrRho;
	private double yOrTheta;

	public PointCP3(char type, double xOrRho, double yOrTheta){
	    if(type != 'C')
	      throw new IllegalArgumentException();
	    this.xOrRho = xOrRho;
	    this.yOrTheta = yOrTheta;
	    typeCoord = type;
	  }
	public double getX(){
	      return xOrRho;
	  }
	  public double getY(){
	      return yOrTheta;
	  }
	  public double getRho(){
	      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
	  }
	  public double getTheta(){
	      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
	  }
	  public double getDistance3(PointCP3 pointB){
	    double deltaX = getX() - pointB.getX();
	    double deltaY = getY() - pointB.getY();
	    
	    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	  }
	  public PointCP rotatePoint(double rotation){
	    double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	        
	    return new PointCP('C',(Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	  }
	  public String toString()
	  {
	    return "Stored as " + (typeCoord == 'C' 
	       ? "Cartesian  (" + getX() + "," + getY() + ")"
	       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
	  }

}
