public class eleven {
    public static void main(String[] args) {
        double time = 365*24*60*60;
		int born =(int)(time/7);
		int death =(int)(time/13);
		int immigration =(int) (time/45);
		double year1 = 312032486 + born - death + immigration;
		double year2 = year1 + born - death + immigration;
		double year3 = year2 + born - death + immigration;
		double year4 = year3 + born - death + immigration;
		double year5 = year4 + born - death + immigration;
		System.out.println("The number of people after five years:"+ year1);
		System.out.println("The number of people after five years:"+ year2);
		System.out.println("The number of people after five years:"+ year3);
		System.out.println("The number of people after five years:"+ year4);
		System.out.println("The number of people after five years:"+ year5);
	}
}
