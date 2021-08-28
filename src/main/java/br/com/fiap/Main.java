package br.com.fiap;

import br.com.fiap.model.Exercise;
import br.com.fiap.model.User;

public class Main {

  public static void main(String[] args) {

    User user = new User();
    user.setUserID(123);
    user.setName("Marco");
    user.setEmail("rootslowed@gmail.com");
    user.setPassword("vclmma152");

    Exercise exercise = new Exercise();
    exercise.setExerciseID(123);
    exercise.setName("flexão de joelhos");
    exercise.setRepetitions((short) 12);
    exercise.setSeries((short) 3);
    exercise.setCalories(20.00F);
    exercise.setDescription("Exercício que usa a gravidade para te lascar");

    System.out.println(user.toString());
    System.out.println(exercise.toString());

  }

}
