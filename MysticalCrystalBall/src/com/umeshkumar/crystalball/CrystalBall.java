package com.umeshkumar.crystalball;

import java.util.Random;

public class CrystalBall {
	//Member variables (properties about the object)
	public String [] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"All signs say NO",
			"The answer is obviously no",
			"What do you think?",
			"The past is the past",
			"Are you serious?",
			"I believe it is so",
			"What do you think?",
			"Better not to tell you now"
	};
	
	
	//Methods(abilities: things object can do)
	public String getAnAnswer(){
		
		
		String answer = "";
		
		//Randomly select one of the three answers : Yes, No or Maybe
		Random randomGenerator = new Random(); //Construct a new Random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length); 
		
		answer = mAnswers[randomNumber];
		
		return answer; 
	}
}
