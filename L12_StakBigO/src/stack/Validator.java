package stack;

public class Validator {
    public Validator(){

    }

    public boolean validataBrackets(String expression){
        int count = 0;

        char parentesStart = '(';
        char parentesSlut = ')';
        char curlybracetsStart = '{';
        char curlybracetsSlut = '}';
        char kantStart = '[';
        char kantSlut = ']';

        int parentesCount = 0;
        int curlyCount = 0;
        int kantCount = 0;


        boolean fundetParentes = false;
        boolean fundetCurly = false;
        boolean fundetKant = false;
        boolean gyldig = false;

        while(expression.length()>count){

            //Parentes
            if(expression.charAt(count)==parentesStart){
                fundetParentes = true;
                gyldig = false;
                parentesCount++;
            } else if(expression.charAt(count)==parentesSlut){
                if(fundetParentes && parentesCount==1){
                    gyldig = true;
                    fundetParentes = false;
                }else if(fundetParentes && parentesCount>1){
                    parentesCount--;
                }else{
                    gyldig = false;
                }

                //Curly
            }else if(expression.charAt(count)==curlybracetsStart){
                fundetCurly = true;
                gyldig = false;
                curlyCount++;
            } else if(expression.charAt(count)==curlybracetsSlut){
                if(fundetCurly && curlyCount==1){
                    gyldig = true;
                    fundetCurly = false;
                }else if(fundetCurly && curlyCount>1){
                    curlyCount--;
                }else{
                    gyldig = false;
                }

                //Kantet
            }else if(expression.charAt(count)==kantStart){
                fundetKant = true;
                gyldig = false;
                kantCount++;
            } else if(expression.charAt(count)==kantSlut){
                if(fundetKant&& kantCount==1){
                    gyldig = true;
                    fundetKant = false;
                }else if(fundetKant && kantCount>1){
                    kantCount--;
                }else{
                    gyldig = false;
                }
            }
            count++;
        }

        return gyldig;
    }
}
