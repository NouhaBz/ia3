/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l.tpia23;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class main2 {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
  
         Random rn = new Random();
         int H=20006;
         
         
        System.out.println("\n\n ......................................WELLCOM TO THE GRID GAME.............................................");
        System.out.println("\n THIE ROBOT  WILL TRY TO FIND THE BEST WAY TO REACH THE GOAL  SO PLEASE :");  
        String cases []={"free <==>" , "blok |||" , "wall |-|","water ~~ ","grass  __","sand  /\\"};
        
        //number row and colomn
        System.out.println("\n ENTER the number of ROWS =>");
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        System.out.println("\n ENTER the number of COLOMNS =>");
         sc = new Scanner(System.in);
        int c= sc.nextInt();
        
        //2d array 
        String grid [][]= new String [l][c];
        String fgrid[][]= new String [l][c];
        
        
        
        
        //the begining 
        int ib= 4;
        int jb= 4;
        //the big
        
        int ibb=ib;
        int jbb=jb;
          // the goal  rn.nextInt(l)   rn.nextInt(c)
        int ig= 0 ;
        int jg= 0;   
        
        //the move 
        int im=ib;
        int jm =jb;
        
        
       //battery 
       System.out.println(" how many u want the bettery :");
       sc = new Scanner(System.in);
       int bettery = sc.nextInt();
      //######################### CREAT THE BOX #########################################//
        
        for(int i =0;i<l;i++){
            for(int j=0;j<c;j++){
                if ((i==ib&&j==jb)){
                   grid[ib][jb]="BEGNING ^_^";
                }else{
                    if(i==ig&&j==jg){
                        grid[ig][jg]="GOALE °o°";  
                    }else{
                    
                  int cs=rn.nextInt(6);
                  grid[i][j]=cases[cs];  
                }
                }
                
            }
        }
        
        
        System.out.println("  THE BETTERY :");
        for(int i =0;i<bettery;i++){
            System.out.print("|");
        }
       
      System.out.println("\n  ..........................THE GRID...................................\n");
        for(int i =0;i<l;i++){
            for(int j =0;j<c;j++){
                System.out.print("    "+grid[i][j]);
                System.out.print("  |");
            }
            System.out.print("\n\n");
        }
        
        
        
        
      
        //################ possibilities#######################################""
                     //#####have 2 demonstrate##############
                     
      while(H!=0){
                     if((ib==0&&(jb==0||jb==(c-1)))||(ib==(l-1)&&(jb==0||jb==(c-1)))){
                         System.out.printf("\n 2 DEMONSTRUCTION");
                         int h1 ,h2;
                         
                          if(ib==0){
                                         if(jb==0){
                                                 //right
                                               h1=(ib-ig)+(jb+1-jg);
                                                  if(h1<0){
                                                      h1=h1*-1;
                                                  }
                                                  if(grid[ib][jb+1].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib][jb+1].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib][jb+1].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                                  
                                                  
                                                 //down
                                                h2=(ib+1-ig)+(jb-jg);
                                                 if(h2<0){
                                                      h2=h2*-1;
                                                  }   
                                                 
                                                 
                                                 
                                                 if(grid[ib+1][jb].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib+1][jb].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib+1][jb].equals(cases[3])){
                                                      h2=h2+3;
                                                  } 
                                                      }
                                                  }
                                                    
                                                    System.out.print("\n"+h1+"h1 "+h2+" h2\n");
                                                 //verf
                                                 if(h1<h2){
                                                     
                                                     if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                         if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                           System.out.println("blocked");
                                                           break;
                                                         }else{
                                                            H=h2;
                                                            grid[ib][jb]="**";
                                                            System.out.println("\n "+grid[ib+1][jb]);
                                                            ib=ib+1;
                                                            jb=jb;
                                                         }
                                                        
                                                     }else{
                                                         H=h1;
                                                         grid[ib][jb]="**";
                                                         System.out.print("\n "+grid[ib][jb+1]);
                                                            ib=ib;
                                                            jb=jb+1;
                                                         
                                                     }
                                                 }else{
                                                     
                                                     if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                         if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                            System.out.println("blocked");
                                                            break;
                                                         }else{
                                                           H=h1;
                                                           System.out.println("\n"+grid[ib][jb+1]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                         }
                                                         
                                                     }else{
                                                         H=h2;
                                                       System.out.print("\n"+grid[ib+1][jb]);
                                                       grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                     }
                                                     
                                                 }
           
       }else{
                                  if(jb==c-1){
                                      System.out.printf("\n 2 DEMONSTRUCTION");
                                          //left
                                               h1=(ib-ig)+(jb-1-jg);
                                                  if(h1<0){
                                                      h1=h1*-1;
                                                  }
                                                  if(grid[ib][jb-1].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib][jb-1].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib][jb-1].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                                  
                                                 //down
                                                h2=(ib+1-ig)+(jb-jg);
                                                 if(h2<0){
                                                      h2=h2*-1;
                                                  }   
                                                 
                                                 if(grid[ib+1][jb].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib+1][jb].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib+1][jb].equals(cases[3])){
                                                      h2=h2+3;
                                                  } 
                                                      }
                                                  }
                                                 
                                                    
                                                    System.out.print("\n"+h1+"h1 "+h2+" h2\n");
                                                 //verf
                                                 if(h1<h2){
                                                     
                                                     if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                         if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                           System.out.println("blocked");
                                                           break;
                                                         }else{
                                                            H=h2;
                                                         System.out.println("\n "+grid[ib+1][jb]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                         }
                                                        
                                                     }else{
                                                         H=h1;
                                                         System.out.print("\n"+grid[ib][jb-1]);
                                                        grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                     }
                                                 }else{
                                                     
                                                     if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                         if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                            System.out.println("blocked");
                                                            break;
                                                         }else{
                                                           H=h1;
                                                          System.out.println("\n"+grid[ib][jb-1]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                         }
                                                         
                                                     }else{
                                                         H=h2;
                                                       System.out.print("\n"+grid[ib+1][jb]);
                                                       grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                     }
                                                     
                                                 }
                
                
                
                
           }
       }
       
       
   }else{
       if(ib==l-1){
            System.out.printf("\n 2 DEMONSTRUCTION");
            if(jb==0){
                
                
                
                                              //right
                                               h1=(ib-ig)+(jb+1-jg);
                                                  if(h1<0){
                                                      h1=h1*-1;
                                                  }
                                                  if(grid[ib][jb+1].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib][jb+1].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib][jb+1].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                                  
                                                  
                                                 //up
                                                h2=(ib-1-ig)+(jb-jg);
                                                 if(h2<0){
                                                      h2=h2*-1;
                                                  }  
                                                 
                                                 if(grid[ib-1][jb].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib-1][jb].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib-1][jb].equals(cases[3])){
                                                      h2=h2+3;
                                                  } 
                                                      }
                                                  }
                                                 
                                                    
                                                    System.out.print("\n"+h1+"h1 "+h2+" h2\n");
                                                 //verf
                                                 if(h1<h2){
                                                     
                                                     if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                         if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                           System.out.println("blocked");
                                                           break;
                                                         }else{
                                                            H=h2;
                                                         System.out.println("\n "+grid[ib+1][jb]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                         }
                                                        
                                                     }else{
                                                         System.out.print(h1+"h1");
                                                     }
                                                 }else{
                                                     
                                                     if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                         if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                            System.out.println("blocked");
                                                            break;
                                                         }else{
                                                           H=h1;
                                                          System.out.println("\n"+grid[ib][jb+1]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                         }
                                                         
                                                     }else{
                                                         H=h2;
                                                       System.out.print("\n"+grid[ib-1][jb]);  
                                                       grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                     }
                                                     
                                                 }
                
                
                
                
                
                
            }else{
                if(jb==c-1){
                    
                    
                    
                    
                    
                    System.out.printf("\n 2 DEMONSTRUCTION");
                                             //left
                                               h1=(ib-ig)+(jb-1-jg);
                                                  if(h1<0){
                                                      h1=h1*-1;
                                                  }
                                                  if(grid[ib][jb-1].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib][jb-1].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib][jb-1].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                                  
                                                  
                                                 //up
                                                h2=(ib-1-ig)+(jb-jg);
                                                 if(h2<0){
                                                      h2=h2*-1;
                                                  }   
                                                 if(grid[ib-1][jb].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib-1][jb].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib-1][jb].equals(cases[3])){
                                                      h2=h2+3;
                                                  } 
                                                      }
                                                  }
                                                 
                                                    
                                                    System.out.print("\n"+h1+"h1 "+h2+" h2\n");
                                                 //verf
                                                 if(h1<h2){
                                                     
                                                     if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                         if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                           System.out.println("blocked");
                                                           break;
                                                         }else{
                                                            H=h2;
                                                         System.out.println("\n "+grid[ib+1][jb]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                         }
                                                        
                                                     }else{
                                                         H=h1;
                                                         System.out.print("\n"+grid[ib][jb-1]);
                                                      grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                     }
                                                     
                                                 }else{
                                                     
                                                     if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                         if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                            System.out.println("blocked");
                                                            break;
                                                         }else{
                                                           H=h1;
                                                          System.out.println("\n"+grid[ib][jb-1]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                         }
                                                         
                                                     }else{
                                                         H=h2;
                                                       System.out.print("\n"+grid[ib-1][jb]);  
                                                     grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                     }
                                                     
                                                 }
                    
       
       
                    
                }
            }
       }
   }
                         
                         
                         
                         
                         
 //###############################                    3 demonstruction               ##########################################################                        
                         
                         
                         
                         
                         
                     }else{
                         if(ib==0||jb==0||ib==(l-1)||jb==(c-1)){
                             System.out.printf("\n 3 DEMONSTRUCTION");
                             int h1,h2,h3;
                             if(ib==0){
                                 
                                 h1=(ib-ig)+(jb-1-jg);
                                 if(h1<0){
                                     h1=h1*-1;
                                 }
                                        if(grid[ib][jb-1].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib][jb-1].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib][jb-1].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 
                                 h2=(ib-ig)+(jb+1-jg);
                                 if(h2<0){
                                     h2=h2*-1;
                                 }
                                 if(grid[ib][jb+1].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib][jb+1].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib][jb+1].equals(cases[3])){
                                                      h2=h2+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 h3=(ib+1-ig)+(jb-jg);
                                  if(h3<0){
                                      h2=h2*-1;
                                  }
                                  if(grid[ib+1][jb].equals(cases[4])){
                                                      h3=h3+1;
                                                  }else{
                                                      if(grid[ib+1][jb].equals(cases[5])){
                                                          h3=h3+2;
                                                      }else{
                                                         if(grid[ib+1][jb].equals(cases[3])){
                                                      h3=h3+3;
                                                  } 
                                                      }
                                                  }
                                  
                                  
                                 if(h1<h2){
                                     if(h1<h3){
  //#######################################  H1   #########################################################
                                         if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                           if(h3<h2){
                                               //h3
                                             if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                      System.out.println(" \n BLOCKED \n");
                                                      break;
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                             }else{
                                                 H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]); 
                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                             } 
                                           }else{
                                               //h2
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                        if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                          System.out.println(" \n BLOCKED \n");
                                                          break;
                                                        }else{
                                                          H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);   
                                                        grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                        }
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]);   
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                           }                                                                                          
                                         }else{
                                             H=h1;
                                            System.out.println("\n"+grid[ib][jb-1]); 
                                            grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                         }                                         
                                     }else{
                                         if(h3<h2){
  //#######################################  h3   #########################################################
                                          if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                      if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                           System.out.println(" \n BLOCKED \n");
                                                           break;
                                                      }else{
                                                       H=h1;
                                                       System.out.println("\n"+grid[ib][jb-1]);     
                                                      grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                      }
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                             }else{
                                                 H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                          }
                                          
                                         }else{
 //#########################################   h2  #######################################################
                                             if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                     if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                           System.out.println(" \n BLOCKED \n");
                                                           break;
                                                      }else{
                                                       H=h1;
                                                       System.out.println("\n"+grid[ib][jb-1]);     
                                                     grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1; 
                                                     }
                                                 }else{
                                                      H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);
                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                 }
                                             }else{
                                                 H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]);
                                                 grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                             }
                                         }
                                     }
                                 }else{
                                     if(h2<h3){
//########################################  h2  #########################################################
                                        if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                            if(h1<h3){
                                                //h1
                                                if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                    if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                      H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                    }
                                                }else{
                                                  H=h1;
                                                 System.out.println("\n"+grid[ib][jb-1]);  
                                                grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                }
                                                
                                            }else{
                                                //h3
                                                if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                    if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        
                                                        break;
                                                    }else{
                                                       H=h1;
                                                 System.out.println("\n"+grid[ib][jb-1]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                    }
                                                }else{
                                                     H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);
                                                  grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                }
                                            }
                                        }else{
                                           H=h2;
                                           System.out.println("\n"+grid[ib][jb+1]);  
                                           grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                        }

                                     }else{
//########################################   h3  ########################################################
                                        if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                            if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                       H=h1;
                                                 System.out.println("\n"+grid[ib][jb-1]);  
                                                grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;    
                                                }
                                                  }else{
                                                H=h2;
                                               System.out.println("\n"+grid[ib][jb+1]);
                                              grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                            }
                                            
                                        }else{
                                             H=h3;
                                             System.out.println("\n"+grid[ib+1][jb]);
                                            grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                        }
                                     }
                                 }
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                             }else{
                                 if(jb==0){
                                     
                                 h1=(ib-1-ig)+(jb-jg);
                                 if(h1<0){
                                     h1=h1*-1;
                                 }
                                 if(grid[ib-1][jb].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib-1][jb].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib-1][jb].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 
                                 h2=(ib-ig)+(jb+1-jg);
                                  if(h2<0){
                                     h2=h2*-1;
                                 }
                                 if(grid[ib][jb+1].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib][jb+1].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib][jb+1].equals(cases[3])){
                                                      h2=h2+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 
                                 h3=(ib+1-ig)+(jb-jg);
                                  if(h3<0){
                                     h3=h3*-1;
                                 }
                                 if(grid[ib+1][jb].equals(cases[4])){
                                                      h3=h3+1;
                                                  }else{
                                                      if(grid[ib+1][jb].equals(cases[5])){
                                                          h3=h3+2;
                                                      }else{
                                                         if(grid[ib+1][jb].equals(cases[3])){
                                                      h3=h3+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 
                                 
                                 if(h1<h2){
                                     if(h1<h3){
  //#######################################  H1   #########################################################
                                         if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                           if(h3<h2){
                                               //h3
                                             if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                      System.out.println(" \n BLOCKED \n");
                                                      break;
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                             }else{
                                                 H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]); 
                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                             } 
                                           }else{
                                               //h2
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                        if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                          System.out.println(" \n BLOCKED \n");
                                                          break;
                                                        }else{
                                                          H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);   
                                                        grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                        }
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]);   
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                           }                                                                                          
                                         }else{
                                             H=h1;
                                            System.out.println("\n"+grid[ib-1][jb]); 
                                           grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                         }                                         
                                     }else{
                                         if(h3<h2){
  //#######################################  h3   #########################################################
                                          if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                      if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                           System.out.println(" \n BLOCKED \n");
                                                           break;
                                                      }else{
                                                       H=h1;
                                                       System.out.println("\n"+grid[ib-1][jb]);     
                                                      grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                      }
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                             }else{
                                                 H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;   
                                          } 
                                         }else{
 //#########################################   h2  #######################################################
                                             if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                     if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                           System.out.println(" \n BLOCKED \n");
                                                           break;
                                                      }else{
                                                       H=h1;
                                                       System.out.println("\n"+grid[ib-1][jb]);     
                                                     grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb; 
                                                     }
                                                 }else{
                                                      H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);
                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                 }
                                             }else{
                                                 H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]);
                                                   grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                             }
                                         }
                                     }
                                 }else{
                                     if(h2<h3){
//########################################  h2  #########################################################
                                        if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                            if(h1<h3){
                                                //h1
                                                if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                    if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                      H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                    }
                                                }else{
                                                  H=h1;
                                                 System.out.println("\n"+grid[ib-1][jb]);  
                                                grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                }
                                                
                                            }else{
                                                //h3
                                                if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                    if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                       H=h1;
                                                 System.out.println("\n"+grid[ib-1][jb]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                    }
                                                }else{
                                                     H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);
                                                grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                }
                                            }
                                        }else{
                                           H=h2;
                                           System.out.println("\n"+grid[ib][jb+1]);  
                                           grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                        }

                                     }else{
//########################################   h3  ########################################################
                                        if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                            if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                       H=h1;
                                                 System.out.println("\n"+grid[ib-1][jb]);  
                                                grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;    
                                                }
                                                  }else{
                                                H=h2;
                                               System.out.println("\n"+grid[ib][jb+1]);
                                            grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                            }
                                            
                                        }else{
                                             H=h3;
                                             System.out.println("\n"+grid[ib+1][jb]);
                                        grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                        }
                                     }
                                 }
                                   
                                 }else{
                                     if(ib==(l-1)){
                                         
                                         
                                 h1=(ib-ig)+(jb-1-jg);
                                  if(h1<0){
                                     h1=h1*-1;
                                 }
                                 if(grid[ib][jb-1].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib][jb-1].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib][jb-1].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 h2=(ib-ig)+(jb+1-jg);
                                  if(h2<0){
                                     h2=h2*-1;
                                 }
                                 if(grid[ib][jb+1].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib][jb+1].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib][jb+1].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 
                                 
                                 h3=(ib-1-ig)+(jb-jg);
                                  if(h3<0){
                                     h3=h3*-1;
                                 }
                                 if(grid[ib-1][jb].equals(cases[4])){
                                                      h3=h3+1;
                                                  }else{
                                                      if(grid[ib-1][jb].equals(cases[5])){
                                                          h3=h3+2;
                                                      }else{
                                                         if(grid[ib-1][jb].equals(cases[3])){
                                                      h3=h3+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 
                                 if(h1<h2){
                                     if(h1<h3){
  //#######################################  H1   #########################################################
                                         if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                           if(h3<h2){
                                               //h3
                                             if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                      System.out.println(" \n BLOCKED \n");
                                                      break;
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                             }else{
                                                 H=h3;
                                                  System.out.println("\n"+grid[ib-1][jb]); 
                                             grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                             } 
                                           }else{
                                               //h2
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                        if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                          System.out.println(" \n BLOCKED \n");
                                                          break;
                                                        }else{
                                                          H=h3;
                                                  System.out.println("\n"+grid[ib-1][jb]);   
                                                        grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                        }
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]);   
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                           }                                                                                          
                                         }else{
                                             H=h1;
                                            System.out.println("\n"+grid[ib][jb-1]); 
                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                         }                                         
                                     }else{
                                         if(h3<h2){
  //#######################################  h3   #########################################################
                                          if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                  if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                      if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                           System.out.println(" \n BLOCKED \n");
                                                           break;
                                                      }else{
                                                       H=h1;
                                                       System.out.println("\n"+grid[ib][jb-1]);     
                                                      grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                      }
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                  }
                                             }else{
                                                 H=h3;
                                                  System.out.println("\n"+grid[ib-1][jb]); 
                                          grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;   
                                          } 
                                         }else{
 //#########################################   h2  #######################################################
                                             if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                 if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                     if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                           System.out.println(" \n BLOCKED \n");
                                                           break;
                                                      }else{
                                                       H=h1;
                                                       System.out.println("\n"+grid[ib][jb-1]);     
                                                     grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1; 
                                                     }
                                                 }else{
                                                      H=h3;
                                                  System.out.println("\n"+grid[ib-1][jb]);
                                                 grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                 }
                                             }else{
                                                 H=h2;
                                                  System.out.println("\n"+grid[ib][jb+1]);
                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                             }
                                         }
                                     }
                                 }else{
                                     if(h2<h3){
//########################################  h2  #########################################################
                                        if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                            if(h1<h3){
                                                //h1
                                                if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                    if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");break;
                                                        
                                                    }else{
                                                      H=h3;
                                                  System.out.println("\n"+grid[ib-1][jb]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                    }
                                                }else{
                                                  H=h1;
                                                 System.out.println("\n"+grid[ib][jb-1]);  
                                                grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                }
                                                
                                            }else{
                                                //h3
                                                if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                    if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                       H=h1;
                                                 System.out.println("\n"+grid[ib][jb-1]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                    }
                                                }else{
                                                     H=h3;
                                                  System.out.println("\n"+grid[ib-1][jb]);
                                                grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                }
                                            }
                                        }else{
                                           H=h2;
                                           System.out.println("\n"+grid[ib][jb+1]);  
                                        grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                        }

                                     }else{
//########################################   h3  ########################################################
                                        if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                            if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                       H=h1;
                                                 System.out.println("\n"+grid[ib][jb-1]);  
                                                grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1; 
                                                }
                                                  }else{
                                                H=h2;
                                               System.out.println("\n"+grid[ib][jb+1]);
                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                            }
                                            
                                        }else{
                                             H=h3;
                                             System.out.println("\n"+grid[ib-1][jb]);
                                        grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                        }
                                     }
                                 }
                                 
                                         
                                     }else{
                                         if(jb==(c-1)){
                                             
                                             
                                 h1=(ib-1-ig)+(jb-jg);
                                  if(h1<0){
                                     h1=h1*-1;
                                 }
                                 if(grid[ib-1][jb].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib-1][jb].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib-1][jb].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 h2=(ib-ig)+(jb-1-jg);
                                  if(h2<0){
                                     h2=h2*-1;
                                 }
                                 if(grid[ib][jb-1].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib][jb-1].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib][jb-1].equals(cases[3])){
                                                      h2=h2+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 h3=(ib+1-ig)+(jb-jg);
                                  if(h3<0){
                                     h3=h3*-1;
                                 }
                                 if(grid[ib+1][jb].equals(cases[4])){
                                                      h3=h3+1;
                                                  }else{
                                                      if(grid[ib+1][jb].equals(cases[5])){
                                                          h3=h3+2;
                                                      }else{
                                                         if(grid[ib+1][jb].equals(cases[3])){
                                                      h3=h3+3;
                                                  } 
                                                      }
                                                  }
                                 
                                 
                                 
                                 
                                 if(h1<h2){
                                     if(h1<h3){
  //#######################################  H1   #########################################################
                                         if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                           if(h3<h2){
                                               //h3
                                             if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                  if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                      System.out.println(" \n BLOCKED \n");
                                                      break;
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb-1]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                  }
                                             }else{
                                                 H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]); 
                                             grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                             } 
                                           }else{
                                               //h2
                                                  if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                        if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                          System.out.println(" \n BLOCKED \n");
                                                          break;
                                                        }else{
                                                          H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);   
                                                        grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                        }
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb-1]);   
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                  }
                                           }                                                                                          
                                         }else{
                                             H=h1;
                                            System.out.println("\n"+grid[ib-1][jb]); 
                                         grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                         }                                         
                                     }else{
                                         if(h3<h2){
  //#######################################  h3   #########################################################
                                          if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                  if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                      if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                           System.out.println(" \n BLOCKED \n");
                                                           break;
                                                      }else{
                                                       H=h1;
                                                       System.out.println("\n"+grid[ib-1][jb]);     
                                                      grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                      }
                                                  }else{
                                                    H=h2;
                                                  System.out.println("\n"+grid[ib][jb-1]); 
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                  }
                                             }else{
                                                 H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]); 
                                          grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;   
                                          } 
                                         }else{
 //#########################################   h2  #######################################################
                                             if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                     if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                           System.out.println(" \n BLOCKED \n");
                                                           break;
                                                      }else{
                                                       H=h1;
                                                       System.out.println("\n"+grid[ib-1][jb]);     
                                                     grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb; 
                                                     }
                                                 }else{
                                                      H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);
                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                 }
                                             }else{
                                                 H=h2;
                                                  System.out.println("\n"+grid[ib][jb-1]);
                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                             }
                                         }
                                     }
                                 }else{
                                     if(h2<h3){
//########################################  h2  #########################################################
                                        if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                            if(h1<h3){
                                                //h1
                                                if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                    if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                      H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                    }
                                                }else{
                                                  H=h1;
                                                 System.out.println("\n"+grid[ib-1][jb]);  
                                                grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                }
                                                
                                            }else{
                                                //h3
                                                if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                    if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                       H=h1;
                                                 System.out.println("\n"+grid[ib-1][jb]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                    }
                                                }else{
                                                     H=h3;
                                                  System.out.println("\n"+grid[ib+1][jb]);
                                                grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                }
                                            }
                                        }else{
                                           H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);  
                                        grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                        }

                                     }else{
//########################################   h3  ########################################################
                                        if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                            if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                        System.out.println(" \n BLOCKED \n");
                                                        break;
                                                    }else{
                                                       H=h1;
                                                 System.out.println("\n"+grid[ib-1][jb]);  
                                                grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;    
                                                }
                                                  }else{
                                                H=h2;
                                               System.out.println("\n"+grid[ib][jb-1]);
                                            grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                            }
                                            
                                        }else{
                                             H=h3;
                                             System.out.println("\n"+grid[ib+1][jb]);
                                        grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                        }
                                     }
                                 }
                                             
                                         }
                                     }
                                 }
                             }
                         }else{
 //########################################       4 demonstruction            ##########################################################                            
                             System.out.printf("\n 4 DEMONSTRUCTION");
                             int h1 ,h2,h3,h4;
                             h1=(ib-1-ig)+(jb-jg);
                             if(h1<0){
                                 h1=h1*-1;
                             }
                                 if(grid[ib-1][jb].equals(cases[4])){
                                                      h1=h1+1;
                                                  }else{
                                                      if(grid[ib-1][jb].equals(cases[5])){
                                                          h1=h1+2;
                                                      }else{
                                                         if(grid[ib-1][jb].equals(cases[3])){
                                                      h1=h1+3;
                                                  } 
                                                      }
                                                  }
                                 
                             h2=(ib-ig)+(jb-1-jg);
                             if(h2<0){
                                 h2=h2*-1;
                             }
                                 if(grid[ib][jb-1].equals(cases[4])){
                                                      h2=h2+1;
                                                  }else{
                                                      if(grid[ib][jb-1].equals(cases[5])){
                                                          h2=h2+2;
                                                      }else{
                                                         if(grid[ib][jb-1].equals(cases[3])){
                                                      h2=h2+3;
                                                  } 
                                                      }
                                                  }
                             
                             
                             h3=(ib-ig)+(jb+1-jg);
                             if(h3<0){
                                 h3=h3*-1;
                             }
                                 if(grid[ib][jb+1].equals(cases[4])){
                                                      h3=h3+1;
                                                  }else{
                                                      if(grid[ib][jb+1].equals(cases[5])){
                                                          h3=h3+2;
                                                      }else{
                                                         if(grid[ib][jb+1].equals(cases[3])){
                                                      h3=h3+3;
                                                  } 
                                                      }
                                                  }
                             
                             
                             h4=(ib+1-ig)+(jb-jg);
                             if(h4<0){
                                 h4=h4*-1;
                             }
                                 if(grid[ib+1][jb].equals(cases[4])){
                                                    h4=h4+1;
                                                  }else{
                                                      if(grid[ib+1][jb].equals(cases[5])){
                                                          h4=h4+2;
                                                      }else{
                                                         if(grid[ib+1][jb].equals(cases[3])){
                                                      h4=h4+3;
                                                  } 
                                                      }
                                                  }
                             
                             
                             
                             if(h1<h2){
                                 if(h1<h3){
                                     if(h1<h4){
                                         //h1
                                         if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                             if(h3<h4){
                                                 if(h3<h2){
                                                     //h3
                                                     if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                          if(h4<h2){
                                                           //h4
                                                           if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                               if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                                 System.out.println("\n  BLOCKES  \n "); 
                                                                 break;
                                                               }else{
                                                                  H=h2;
                                                              System.out.println("\n"+grid[ib][jb-1]); 
                                                               grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                               }
                                                           }else{
                                                               H=h4;
                                                              System.out.println("\n"+grid[ib+1][jb]);
                                                           grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                           }   
                                                           
                                                          }else{
                                                              //h2
                                                               if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                     System.out.println("\n  BLOCKES  \n ");
                                                                     break;
                                                                 }else{
                                                                  H=h4;
                                                                 System.out.println("\n"+grid[ib+1][jb]);   
                                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                                 }  
                                                               }else{
                                                                  H=h2;
                                                              System.out.println("\n"+grid[ib][jb-1]);  
                                                               grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                               }
                                                          }
                                                      }else{
                                                         H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]); 
                                                     grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1; 
                                                     }
                                                     
                                                 }else{
                                                     //h2
                                                     if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                         if(h3<h4){
                                                             //h3
                                                             if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                     System.out.println("\n  BLOCKES  \n ");
                                                                     break;
                                                                      
                                                                 }else{
                                                                  H=h4;
                                                                 System.out.println("\n"+grid[ib+1][jb]);   
                                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                                 }  
                                                             }else{
                                                                H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);  
                                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                             }
                                                         }else{
                                                             //h4
                                                             if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                 if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                    System.out.println("\n  BLOCKES  \n "); 
                                                                    break;
                                                                 }else{
                                                                    H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]); 
                                                                 grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                                 }
                                                             }else{
                                                                 H=h4;
                                                                 System.out.println("\n"+grid[ib+1][jb]);
                                                             grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                             }
                                                         }
                                                         
                                                     }else{
                                                      H=h2;
                                                              System.out.println("\n"+grid[ib][jb-1]);   
                                                     grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                     }
                                                     
                                                 }
                                             }else{
                                                 if(h4<h2){
                                                     //h4
                                                     if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                         if(h3<h2){
                                                             //h3
                                                             if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                              if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                                 System.out.println("\n  BLOCKES  \n ");  
                                                                 break;
                                                              }else{
                                                                   H=h2;
                                                              System.out.println("\n"+grid[ib][jb-1]);
                                                              grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                              }   
                                                             }else{
                                                                H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]); 
                                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                             }
                                                         }else{
                                                             //h2
                                                           if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                                 if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                     System.out.println("\n  BLOCKES  \n ");
                                                                     break;
                                                                 }else{
                                                                    H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]); 
                                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                                 }
                                                           }else{
                                                           H=h2;
                                                              System.out.println("\n"+grid[ib][jb-1]);    
                                                           grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                           }  
                                                         }
                                                     }else{
                                                         H=h4;
                                                     System.out.println("\n"+grid[ib+1][jb]);
                                                     grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                     }
                                                 }else{
                                                     //h2
                                                      if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                         if(h3<h4){
                                                            if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                     System.out.println("\n  BLOCKES  \n ");
                                                                     break;
                                                                 }else{
                                                                   H=h4;
                                                     System.out.println("\n"+grid[ib+1][jb]);  
                                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                                 }
                                                            }else{
                                                                H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);  
                                                            grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                            } 
                                                         }else{
                                                            if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                               if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                    System.out.println("\n  BLOCKES  \n ");
                                                                    break;
                                                               }else{
                                                                    H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);  
                                                            grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                               } 
                                                            }else{
                                                                H=h4;
                                                     System.out.println("\n"+grid[ib+1][jb]);
                                                            grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                            } 
                                                         }
                                                          
                                                      }else{
                                                      H=h2;
                                               System.out.println("\n"+grid[ib][jb-1]);      
                                                      grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                      }
                                                 }
                                                 
                                             }
                                         }else{
                                             H=h1;
                                               System.out.println("\n"+grid[ib-1][jb]);
                                         grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                         }
                                         
                                         
                                         
                                     }else{
                                         //h4
                                         if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                             if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                 if(h2<h3){
                                                     if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                         if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                     System.out.println("\n  BLOCKES  \n ");
                                                                     break;
                                                                 }else{
                                                                    H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]); 
                                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;        
                                                         }
                                                     }else{
                                                         H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);
                                                     grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                     }
                                                 }else{
                                                    if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                        if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                             System.out.println("\n  BLOCKES  \n ");
                                                             break;
                                                        }else{
                                                        H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);    
                                                        grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                        }
                                                        
                                                    }else{
                                                        H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);  
                                                    grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                    } 
                                                 }
                                                 
                                             }else{
                                            H=h1;
                                               System.out.println("\n"+grid[ib-1][jb]);     
                                             grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                             }
                                             
                                         }else{
                                              H=h4;
                                      System.out.println("\n"+grid[ib+1][jb]);
                                         grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                         }
                                         
                                     }
                                     
                                 }else{
                                     if(h3<h4){
                                         //h3
                                         if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                             if(h1<h4){
                                                 //h1
                                                 if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                     if(h4<h2){
                                                         if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                             if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                             System.out.println("\n  BLOCKES  \n ");
                                                             break;
                                                        }else{
                                                        H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);    
                                                        grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                             }
                                                         }else{
                                                           H=h4;
                                      System.out.println("\n"+grid[ib+1][jb]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                         }
                                                     }else{
                                                         if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                              if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                   System.out.println("\n  BLOCKES  \n ");
                                                                   break;
                                                              }else{
                                                  H=h4;
                                      System.out.println("\n"+grid[ib+1][jb]);                
                                                              grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                              }
                                                         }else{
                                                          H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);    
                                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                         }
                                                     }
                                                 }else{
                                                 H=h1;
                                               System.out.println("\n"+grid[ib-1][jb]);    
                                                 grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                 }
                                                 
                                             }else{
                                                 //h4
                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                      if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                          if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                             System.out.println("\n  BLOCKES  \n ");
                                                             break;
                                                        }else{
                                                        H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);    
                                                        grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                          }
                                                      }else{
                                                          H=h1;
                                               System.out.println("\n"+grid[ib-1][jb]); 
                                                      grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                      }
                                                 }else{
                                                     H=h4;
                                      System.out.println("\n"+grid[ib+1][jb]); 
                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                 }
                                                 
                                             }
                                         }else{
                                           H=h3;
                               System.out.println("\n"+grid[ib][jb+1]);    
                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                         }
                                     }else{
                                         //h4
                                         if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                             if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                          if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                             System.out.println("\n  BLOCKES  \n ");
                                                             break;
                                                        }else{
                                                        H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);    
                                               grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                          }
                                                      }else{
                                                          H=h1;
                                               System.out.println("\n"+grid[ib-1][jb]); 
                                                grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;      
                                                } 
                                             }else{
                                            H=h3;
                               System.out.println("\n"+grid[ib][jb+1]);      
                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                             }
                                         }else{
                                            H=h4;
                                      System.out.println("\n"+grid[ib+1][jb]);   
                                         grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                         }
                                     }
                                 }
                             }else{
                                 if(h2<h3){
                                     if(h2<h4){
                                         //h2
                                         if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                             
                                             if(h3<h4){
                                                 if(h3<h1){
                                                     if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                         if(h1<h4){
                                                               if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                   if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                   }else{
                                                                        H=h4;
                                                             System.out.println("\n"+grid[ib+1][jb]);
                                                                   grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                                   }
                                                               }else{
                                                                   H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);
                                                               grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                               }
                                                         }else{
                                                             if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                  if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                  }else{
                                                                    H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);  
                                                                  grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                                  }
                                                             }else{
                                                          H=h4;
                                                             System.out.println("\n"+grid[ib+1][jb]);        
                                                             grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                             }
                                                             
                                                         }
                                                     }else{
                                                     H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);    
                                                     grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                     }
                                                 }else{
                                                     if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                         if(h3<h4){
                                                              if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                     if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                  }else{
                                                                    H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);  
                                                                  grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                                     }
                                                                 }else{
                                                                      H=h4;
                                                             System.out.println("\n"+grid[ib+1][jb]);
                                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                                 } 
                                                              }else{
                                                                  H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);
                                                              grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                              }
                                                             
                                                         }else{
                                                             if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                                 if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                    if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                  }else{
                                                                    H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);  
                                                              grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                                    } 
                                                                 }else{
                                                                     H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);
                                                                 grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                                 }
                                                             }else{
                                                                H=h4;
                                                             System.out.println("\n"+grid[ib+1][jb]);  
                                                             grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                             }
                                                             
                                                         }
                                                     }else{
                                                       H=h1;
                                           System.out.println("\n"+grid[ib-1][jb]);  
                                                     grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                     }
                                                 }
                                             }else{
                                                  if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                     if(h3<h1){
                                                         if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                           if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                  }else{
                                                                    H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);  
                                                           grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;       
                                                           }   
                                                         }else{
                                                           H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                         }
                                                     }else{
                                                         if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                             if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                  System.out.println("\n  BLOCKES  \n ");
                                                                  break;
                                                             }else{
                                                              H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);   
                                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                             }
                                                         }else{
                                                              H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);
                                                         grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;
                                                         }
                                                     }
                                                  }else{
                                                      H=h4;
                                                    System.out.println("\n"+grid[ib+1][jb]);
                                                  grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                  }
                                             }
                                             
                                         }else{
                                         H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);
                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1; 
                                         }
                                         
                                     }else{
                                       //  h4
                                       if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                            if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                if(h1<h3){
                                                   if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                             if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                                  System.out.println("\n  BLOCKES  \n ");
                                                                  break;
                                                             }else{
                                                              H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);   
                                                             grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                                             }
                                                         }else{
                                                              H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);
                                                   grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;      
                                                   } 
                                                }else{
                                                    
                                                     if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                           if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                  }else{
                                                                    H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);  
                                                           grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;       
                                                           }   
                                                         }else{
                                                           H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);  
                                                     grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;    
                                                     }
                                                    
                                                }
                                            }else{
                                               H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]); 
                                            grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                            }
                                           
                                       }else{
                                           H=h4;
                                    System.out.println("\n"+grid[ib+1][jb]);
                                       grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                       }
                                       
                                     }
                                 }else{
                                     if(h3<h4){
                                         //h3
                                         if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                             if(h2<h4){
                                                  if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                       if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                            if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                  }else{
                                                                    H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);  
                                                            grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;      
                                                            }   
                                                       }else{
                                                           H=h4;
                                    System.out.println("\n"+grid[ib+1][jb]);
                                                       grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                       }
                                                  }else{
                                                 H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);     
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                  }
                                                 
                                             }else{
                                                 if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                                     if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                         if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                  }else{
                                                                    H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;         
                                                         }   
                                                     }else{
                                                         H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);
                                                     grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;
                                                     }
                                                 }else{
                                                      H=h4;
                                    System.out.println("\n"+grid[ib+1][jb]);
                                                 grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                                 }
                                             }
                                         }else{
                                               H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);
                                         grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                         }
                                     }else{
                                         //h4
                                         if(grid[ib+1][jb].equals(cases[2])||grid[ib+1][jb].equals(cases[1])||grid[ib+1][jb].equals("**")){
                                              if(grid[ib][jb+1].equals(cases[2])||grid[ib][jb+1].equals(cases[1])||grid[ib][jb+1].equals("**")){
                                                  if(grid[ib][jb-1].equals(cases[2])||grid[ib][jb-1].equals(cases[1])||grid[ib][jb-1].equals("**")){
                                                         if(grid[ib-1][jb].equals(cases[2])||grid[ib-1][jb].equals(cases[1])||grid[ib-1][jb].equals("**")){
                                                                       System.out.println("\n  BLOCKES  \n ");
                                                                       break;
                                                                  }else{
                                                                    H=h1;
                                                          System.out.println("\n"+grid[ib-1][jb]);  
                                                         grid[ib][jb]="**";
                                                            ib=ib-1;
                                                            jb=jb;         
                                                         }   
                                                     }else{
                                                         H=h2;
                                           System.out.println("\n"+grid[ib][jb-1]);
                                                  grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb-1;   
                                                  }
                                              }else{
                                                  H=h3;
                                               System.out.println("\n"+grid[ib][jb+1]);
                                              grid[ib][jb]="**";
                                                            ib=ib;
                                                            jb=jb+1;
                                              }
                                         }else{
                                            H=h4;
                                    System.out.println("\n"+grid[ib+1][jb]);  
                                         grid[ib][jb]="**";
                                                            ib=ib+1;
                                                            jb=jb;
                                         }
                                         
                                     }
                                 }
                             }
                             
                             
                             
                             
                             
                         }
                         
                     }
        System.out.println("\n"+H);
        grid[ib][jb]="   ^_^    ";
        System.out.println(ib+"  "+jb);
                
         System.out.println("\n  ..........................THE GRID...................................\n");
        for(int i =0;i<l;i++){
            for(int j =0;j<c;j++){
                System.out.print("    "+grid[i][j]);
                System.out.print("  |");
            }
            System.out.print("\n\n\n");
        }
      }
    }
    
}

        
        
        
    