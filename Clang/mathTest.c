#include <stdio.h>

int x = -1;

int getNextQuestion(){
  x++;
  return x;
}

void presentAddition(int op1, int op2){
  printf("What is %d plus %d ?\n> ",op1, op2);
}

void presentMinus(int op1, int op2){
  printf("What is %d minus %d ?\n> ",op1, op2);
}

void presentProduct(int op1, int op2){
  printf("What is %d times %d ?\n> ",op1, op2);
}

void presentDivision(int op1, int op2){
  printf("What is %d divided by %d ?\n> ",op1, op2);
}

void presentQuestion(int opr, int op1, int op2, int qn){
  printf("\n Question %d: ",qn);
  switch(opr){
  case '+': presentAddition(op1,op2);break;
  case '-': presentMinus(op1,op2);break;
  case '*': presentProduct(op1,op2);break;
  case '/':presentDivision(op1,op2);break;
  }
}

int checkTheResponse(int correctAns, int studentResp){
  if (studentResp == correctAns){
    return 1;
  }else{
    return 0;
  }
}

int getResponse(){
  int response;
  scanf("%d",&response);
  return response;
}

void storeResponse(int quesNum, int resp, int *Responses){
  Responses[quesNum] = resp;  
}

void printReport( int *input, int *Response){
  int i, resp, ans, num, ques, cor, index = 0;

  printf("\n----------------\nAnswers:\n----------------\n");

  for (i = 0; i < 20; i++){
    index = i * 4;
    resp = Response[i];
    ans = input[index + 3];
    cor = checkTheResponse(ans, resp);
    presentQuestion(input[index],input[index+1],input[index+2], i + 1);
    printf("Your answer %d ", resp);
    if (cor == 1){
      printf("is correct!\n");
    }else{
      printf("is incorrect. Correct Answer: %d\n",ans);
    }
    
  }
}
 
void main(){

  int i, questionNum, response, index; 
  int Responses [20];
  int input [80] = {
  '+', 8, 1 , 9 , '-', 8, 1 , 7 , '*', 8, 1 , 8 , '/', 8, 1 , 8 , '+', 2, 1 , 3 , 
  '+', 5, 2 , 7 , '*', 3, 1 , 3 , '-', 2, 1 , 1 , '*', 5, 1 , 5 , '*', 4, 2 , 8 , 
  '+', 4, 3 , 7 , '-', 7, 3 , 4 , '/', 4, 2 , 2 , '*', 2, 4 , 8 , '*', 2, 3 , 6 ,
  '-', 9, 2 , 7 , '+', 1, 8 , 9 , '*', 2, 1 , 2 , '/', 6, 3 , 2 , '+', 1, 1 , 2 };

  printf("\nWelcome to the Standardized Test.\n");

  for (i = 0; i < 20; i++){
    questionNum = getNextQuestion();
    index = questionNum * 4;
    presentQuestion(input[index],input[index+1],input[index+2],questionNum + 1);  
    response = getResponse();
    storeResponse(questionNum, response, Responses);
  }
  
  printReport(input,Responses);
  printf("\n");
}
