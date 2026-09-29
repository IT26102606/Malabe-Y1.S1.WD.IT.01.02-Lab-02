public class IT26102606Lab2Q1{
	public static void main (String[] args){

	int perimeter = 100;// Given perimeter of the fence
	double length;
	double width;
	
	//width the lenght ratio:3/4= 0.75
	double width_ratio = 0.75;
	
	//calculate the lenght and width
	
	//using the formula : permiter = 2*(lenght + width )
	//subatitute width = width ratio * lenght
	//100 = 2 *(lenght + (width_ratio * lenght))
	//100 = 2 * lenght * (1 * width_ratio)
	//lenght = 100 / 2 * (1 + width_ratio)
	
	length = perimeter / (2 * (1 +  width_ratio));
	width= width_ratio*length;
	
System.out.println("width of the fence is : " + width);
System.out.println("lenght of the fence is :"+ length);

	}	
}

