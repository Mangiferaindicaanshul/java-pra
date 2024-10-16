package demo.abc;

public class stat {
      String plotno;
      String area;
      String dist;
      String pinCode;
      public stat(String plotno, String area, String dist, String pincode) {
    	  this.plotno = plotno;
    	  this.area = area;
    	  this.dist = dist;
    	  this.pinCode = pincode;
      }
      public void printDetails() {
    	  System.out.println(plotno);
    	  System.out.println(area);
    	  System.out.println(dist);
    	  System.out.println(pinCode);
      }
}






