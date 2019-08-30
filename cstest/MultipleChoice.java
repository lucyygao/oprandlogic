package cstest;

import java.util.Scanner;

public class MultipleChoice 
{

	String answers[];
	String answer2;
	String answer3;
	String answer4;
	String question;
	int questionNumber;
	int correctAnswer;
	int userAnswer;
	int score;
	Scanner getAnswer = new Scanner(System.in);
	
	
	MultipleChoice(String q, int qn, String[] a, int ca)		//create questions with "question", questionNumber, 4 answers, and correct answer (1-4)
	{
		question = q;
		questionNumber = qn;
		answers = a;
		correctAnswer = ca;
	}

	void askQuestion() 
	{
		System.out.println("Question " + questionNumber + ": " + question);
		System.out.println("1. "+ answers[0]);
		System.out.println("2. "+ answers[1]);
		System.out.println("3. "+ answers[2]);
		System.out.println("4. "+ answers[3]);
		
		int i = 0;
	    while (userAnswer < 1 || userAnswer > 4) 									//checks if userAnswer is between 1-4
	    {
			if (i > 0) {															//if i>0 so Invalid answer isn't printed the first time around.
			    System.out.println("Invalid answer! Answer number 1-4: ");
			}
		    if (getAnswer.hasNextInt()) {											//checks if answer is integer, if so assigns it to userAnswer
		    	userAnswer = getAnswer.nextInt();
		    } else {
		    	getAnswer.next();													//dumps scanner answer to fit new answer
		    	userAnswer = 0;
		    }
		    i++;
		}
		if (userAnswer == correctAnswer){											//checks if answer is correct, gives point if it is
			score++;
		}
	}
	

	void printScore(int s)
	{
		score = s;
		System.out.println("Your score: "+score);
	}
	
	int score() {
		return score;
	}
}
