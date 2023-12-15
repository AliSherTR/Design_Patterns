package interpreterdesignpattern.tutorialPoint;

/**
 *
 * @author fa20-bse-078
 */
public class InterpreterDesignPattern {

   //Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }

   //Rule: Julie is a married women
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
   public static Expression getSonExpression() {
      Expression Stuart = new TerminalExpression("Robert");
      Expression Robert = new TerminalExpression("John");
      return new OrExpression(Stuart, Robert);	
   }

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
      Expression isSon = getSonExpression();

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("Stuart is son of Robert? " + isSon.interpret("Son"));
   }
    
}
