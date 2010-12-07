/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author movs_666 karys
 */
public class AFD_Calendario extends AFD {

   
   
   public static  TOKEN validafecha(String fecha){
           TOKEN t= TOKEN.FECHAINVALIDA;
            int dia=0;
            int mes=0;
            int año=0;
         int c=0;
            for (StringTokenizer stringTokenizer = new StringTokenizer(fecha,"//"); stringTokenizer.hasMoreTokens();) {
                String token = stringTokenizer.nextToken();
                if (c==0){
                    try{
                    dia=Integer.parseInt(token);
                    }catch(NumberFormatException e){
                        t = TOKEN.ERROR;
                    }
                 }else if(c==1){
                    try{
                     mes=Integer.parseInt(token);
                    }catch(NumberFormatException e){
                        t = TOKEN.ERROR;
                    }
                 }else if (c==2){
                    try{
                    año=  Integer.parseInt(token);
                    }catch(NumberFormatException e){
                        t = TOKEN.ERROR;
                    }
                 }
                
                c++;
            }
            boolean añop= validadia(año,mes,dia);
            if (validadia(año,mes,dia)==true){
                    t=TOKEN.FECHAVALIDA;
                   // System.out.println("AÑO VAlIDO"+" dia:  "+dia+" mes :  "+mes+" año:  "+año);
            } else{
                    t = TOKEN.ERROR;
                    //System.out.println("AÑO nooo VAÑIDO"+"  dia:  "+dia+" mes :"+mes+" año:"+año);
            }
        return t;
      }
      public static boolean validaaño(int año){
            boolean a=false;
                if(año%4==0){
                        a=true;
                }
                if(año%400==0){
                        a=true;
                }
            return a;
        }
        public static boolean validames31(int mes){
            boolean m=false;
                switch (mes){
                    case 1: m=true;break;//NERO";break;
                    case 3: m=true;break;//"MARZO";break;
                    case 5: m=true;break;//"MAYO";break;
                    case 7: m=true;break;//"JULIO";break;
                    case 8: m=true;break;//"AGOSTO";break;
                    case 10: m=true;break;//"OCTUBRE";break;
                    case 12: m=true;break;//"DICIEMBRE";break;
                    default:
                            m=false;
                }
            return m;
        }
        public static boolean validames30(int mes){
            boolean m=false;
                switch (mes){
                    case 4: m=true;break;//"ABRIL";break;
                    case 6: m=true;break;//"JUNIO";break;
                    case 9: m=true;break;//"SEPTIEMBRE";break;
                    case 11: m=true;break;//"NOVIEMBRE";break;
                    default:
                            m=false;
                }
            return m;
        }
        public static boolean validadia(int año,int mes,int dia){
            boolean añov=false;
                    if (dia<32){
                        if ((mes==2)&&(dia==29)){
                              if(validaaño(año)==true){
                                añov=true;
                              }else{
                                añov=false;
                              }
                        }else if (mes==2){
                            if(dia<29)
                                añov=true;
                            else
                                añov=false;
                        }else if(dia==31){
                            if(validames31(mes)==true){
                                añov=true;
                            }else{
                                añov=false;
                            }
                       }else if (validames30(mes)==true){
                            añov=true;
                       }else if (validames31(mes)==true){
                            añov=true;
                       }

                   }else{
                           añov=false;
                   }
       return añov;

    }
}
