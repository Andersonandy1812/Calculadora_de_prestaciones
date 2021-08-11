/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprestaciones;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;

/**
 *
 * @author Anderson
 */
public class CalculadoraPrestaciones {
   // GUIPrestaciones variable = new GUIPrestaciones();
    /**
     * @param args the command line arguments
     */
//    public static int calculoDeDias(int dias){
//        int dia = 0;
//        int mes = 0;
//        int año = 0;
//        int conteoMes = 0;
//        int conteoAño = 0;
////        GUIPrestaciones GUI = new GUIPrestaciones();
////    SimpleDateFormat formatoHora = new SimpleDateFormat("dd-mm-yyyy");
////      for(int i = 1; i<=dias;i++){
////          conteoMes++;
////          if(conteoMes==31)
////          {
////              conteoMes = 0;
////              mes++;
////          }
////          else if(mes == 12){
////          
////          }
////      }
//          
//          
//    
//    return mes;
//    }
    public int calculoAllMes(int mes){
        //int dias=0;
        int Cmes31=0;
//        int Cmes30=0;
        double conteoMes=0;
//        int conteoMes2= 0;
//          for(int i = 0; i<=mes;i++){
//          conteoMes++; 
//          
//          if(conteoMes==31)
//          {
//              conteoMes = 0;
//              Cmes31++;
//          }
//          
//          }
//          for(int i = 0; i<=mes;i++){
//          conteoMes++; 
//          
//          if(conteoMes==30)
//          {
//              conteoMes = 0;
//              Cmes30++;
//          }
//          
//          }
//          conteoMes = (Cmes31*0.50)+(Cmes30*0.50);
                conteoMes = mes/30.416;
     return (int) conteoMes;
    }
    public int calculoMes(int mes){
    double ConteoMes=0;
    //int mesF = 0;
    
    
         if(mes >11){
            for(int i = 1;i<=mes;i++){
            ConteoMes++;
                if(ConteoMes == 12){
                    ConteoMes = 0;
                }
            }
        }
         if(mes != 12 && mes < 13){
            ConteoMes = mes;
         }
                return (int) ConteoMes;
    }
    public int calculoAño(int mes){
        //nt mes=0;
        int CAño=0;
        int conteoAño=0;
          for(int i = 0; i<=mes;i++){

          if(conteoAño == 12){
          CAño++;
          conteoAño=0;
          }
        conteoAño++;
          
      }
    return CAño;
    }
    public double pPreaviso(int año, int mes,double preaviso){
        if(año>1){
            preaviso = preaviso*28;
        }
        else if(año<1){
            if(mes >=3&&mes <=5){
               preaviso = preaviso*7; 
            }
            else if(mes >=6&&mes <=11){
               preaviso = preaviso*14; 
            }
        }
        return preaviso;
    }
    public int cesantia(int año, int mes, double salarioDiario){
        int diasCesantia;
        if(año>=1&&año<5){
          //  año = año*23;
        año = año*21;
        }
        else if(año>5){
        //    año = año*24;
        año = año*23;
        }
        if(mes>=3&&mes<6){
        mes = 6;
        }
        else if(mes>6){
        mes = 13;
        }
        diasCesantia = mes+año;
        double allDiasCesantia = diasCesantia;
        allDiasCesantia = allDiasCesantia*salarioDiario;
        
        return (int) allDiasCesantia;
    }
    public double SalarioDiario(double salario){
        salario = salario /23.83;
        return salario;
    }
    public double salarioVacaciones(int año, int mes,double salarioDiario){
        double vacaciones = 0;
  if(año<1){
    if(mes == 5){
        vacaciones = salarioDiario * 6;
    }
    else if(mes == 6){
        vacaciones = salarioDiario * 7;
    }
    else if(mes == 7){
        vacaciones = salarioDiario * 8;
    }
    else if(mes == 8){
        vacaciones = salarioDiario * 9;
    }
    else if(mes == 9){
        vacaciones = salarioDiario * 10;
    }
    else if(mes == 10){
        vacaciones = salarioDiario * 11;
    }
    else if(mes == 11){
        vacaciones = salarioDiario * 12;
    }
  }
  else if(año>=1&&año<5){
      vacaciones = salarioDiario *14;
  }
  else if(año>=5){
      vacaciones = salarioDiario *14;
  }
    return vacaciones;
    }
    
    public int regalia(int mesTrabajado, double salario){
    double regalia = 0;
    regalia = salario * mesTrabajado;
    regalia = regalia / 12;
    return(int) regalia;
    }
    
}
