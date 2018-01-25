#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int readtoarray(char *teams);
int randnum(int length, int m);
int teamcheck(int t1, int t2, char *teams);
int pairoff(int length, char *teams, int*tlf);
void writeout(char *teams, int *pairings, int amnt);

void main(){
  int amnt = 0, x;
  char teams[500];

  printf("\nPairing teams..\n");
  printf("This may take a few seconds, please wait...\n");

  amnt = readtoarray(teams);

  if(amnt % 2 != 0){
    printf("There must be an even number of teams to be paired...\n");
    printf("Please modify Provisions.txt accordingly.\n");
  }else{ 

  int pairlist[amnt+1];
  pairoff(amnt,teams,pairlist);
 
  writeout(teams,pairlist,amnt); 
  printf("Done! Results in Results.txt\n\n");
  }

}//end main

//Read teams from file to array.
int readtoarray(char *teams){
  FILE *fp;
  int count = 0, ain = 0, amnt = 0, x;
  char name[3]; 

  //Open input file and assign to array
  fp = fopen("Provisions.txt","r");
  
  if (fp == NULL) {
    printf("File read error\nProgram needs a Provisions.txt for input\n");
    exit(0);
  }
      
  count = fscanf(fp, "%s", name);
  
  while (count > 0){
    for(x = 0; x < 3; x++){
      teams[ain + x] = name[x];
    }
    count = fscanf(fp, "%s", name);
    ain += 3;
    amnt++;
  }
  fclose(fp);

  return amnt;
}

//random number generator
int randnum(int length,  int m){
  int n;
    srand(time(NULL) * (m+1) );
    n = rand() % length;
  return n;
}


//check if team match is valid
int teamcheck(int t1, int t2, char *teams){
  FILE *fr;
  char temp1[100], temp2[100], team1[3],team2[3];
  int x,c=0, c1=0, c2=0, result = 0;
 
  for(x=0;x<3;x++){
    team1[x]=teams[(t1*3)+x];
    team2[x]=teams[(t2*3)+x];
    if (team1[x] == team2[x]){c++;}
  }

  fr = fopen("Provisions.txt","r");

  if( fr == NULL){
    printf("Unable to read file...\n");
    exit(0);
  }

  while(fgets(temp1,100,fr) != NULL){
  c1++;
    if((strstr(temp1,team2))!=NULL){
      break;
    }
  }
  fclose(fr);

  fr = fopen("Provisions.txt","r");

  while(fgets(temp2,100,fr) != NULL){
  c2++; 
    if((strstr(temp2,team2))!=NULL){
      break;
    }
  }
  fclose(fr);

  if(c1 == 1 && c2 ==1){
   result = 1;
  }else if(c == 3){
   result = 1;
  }

  return result;
c1=0;
c2=0;
c=0;
}

//pair teams using array
int pairoff(int length, char *teams, int*tlf){
  int tl1[length+1], tl2[length+1], li=length, j=1, z=0, x,y,r1,r2;

  for(x=0;x<li;x++){
    tl1[x]=x;
    tl2[x]=0;
    tlf[x]=0;
  }

  while(li>2){
    r1=randnum(li,li);
    r2=randnum(li,((li+2)*5));
    y=0;
    if(teamcheck(tl1[r1],tl1[r2],teams)==0){
      tlf[z]=tl1[r1]; tlf[z+1]=tl1[r2];
      li -= 2;z += 2;
      tl1[r1]=-1;tl1[r2]=-1;
      for(x=0;x<length;x++){
        if(tl1[x]!=-1){
          tl2[y] = tl1[x];
          y++;
        }
       }
      for(x=0;x<li;x++){
        tl1[x]=tl2[x];
      }
    }//END IF
  }//END WHILE

  if(teamcheck(tl1[0],tl2[1],teams)==0){
    tlf[length-1]=tl1[0];tlf[length-2]=tl1[1];
  }else{
    tlf[length-1]=tlf[1];
    tlf[1]=tl1[0];
    tlf[length-2]=tl1[1];
  }
}

//write results to Results.txt
void writeout(char *teams, int *pairings,int amnt){
  FILE *fw;
  int x,y,j;
  char name1[5],name2[5]; 

  fw = fopen("Results.txt","w+");

  for(x=0;x<amnt;x++){
    if(x%2==0){
      for(y=0;y<3;y++){
     name1[y] = teams[(pairings[x] * 3) +y];
      }
    fprintf(fw,"%s vs. ",name1);
    }else{
      for(y=0;y<3;y++){
     name2[y] = teams[(pairings[x] * 3) +y];
      }
    fprintf(fw,"%s\n",name2);
    }
  //printf("\n");
  }

  fclose(fw);

}

