package cstest;
import cstest.MultipleChoice;

public class Test 
{
	public static void main(String args[])
	{
		
		int score = 0;
		int questionNumber = 1;
		
		
		String[] question =
			{
				"Which operator do you use to test if two numbers are not equal to each other?",
				"question 2?",
				"question 3?",
				"question 4?"
			};
		String[][] answers =
			{
				{"==","=","!=","/="},
				{"q2a1","q2a2","q2a3","q2a4"},
				{"q3a1","q3a2","q3a3","q3a4"},
				{"q4a1","q4a2","q4a3","q4a4"}
			};
		
		//question 1
		MultipleChoice Question1 = new MultipleChoice(question[0],questionNumber,answers[0],3);
		
		Question1.askQuestion();
		score = score + Question1.score();
		Question1.printScore(score);
		questionNumber++;
		
		//question 2
		MultipleChoice Question2 = new MultipleChoice(question[1],questionNumber,answers[1],2);
		
		Question2.askQuestion();
		score = score + Question2.score();
		Question2.printScore(score);
		questionNumber++;
		
		//question 3
		MultipleChoice Question3 = new MultipleChoice(question[1],questionNumber,answers[2],3);
		
		Question3.askQuestion();
		score = score + Question3.score();
		Question3.printScore(score);
		questionNumber++;
		
		//question 4
		MultipleChoice Question4 = new MultipleChoice(question[3],questionNumber,answers[3],4);
		
		Question4.askQuestion();
		score = score + Question4.score();
		Question4.printScore(score);
		questionNumber++;
		
		
		System.out.println(score + "/" +  (questionNumber-1));
		
		
	}
}
