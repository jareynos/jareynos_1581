public class VectorUtil
{
	public static double dotProduct(double[] vector1, double[] vector2)
	{
		double sum = 0;
		for(int i=0; i<vector1.length; i++)
		{
			sum += vector1[i] * vector2[i];
		}
		return sum;
	}
}

//vector1: 1 2 3
//vector2: 4 5 6

//i=0: sum=0+(1*4)=4
//i=1: sum=4+(2*5)=14
//i=2: sum=14+(3*6)=32

//return 32