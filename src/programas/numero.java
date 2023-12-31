/**
 * Autor: Hector Jesus Manrique Manzanarez
 * Fecha de Creacion: 20/Feb/2010
 * Este codigo es de uso libre siempre y cuando se respeten los derechos de
 * autor y se coloque esta etiqueta haciendo referencia al mismo
 * manrique.org.mx
 */
package programas;


public class numero {


    public static String nletra(int numero)
    {
        String cadena= new String();
        // Aqui identifico si lleva millones
        if ((numero/1000000)>0)
        {
            if ((numero/1000000)==1)
            {
                cadena = " Un Millon "+nletra(numero%1000000);
            }
            else
            {
                 cadena= nletra(numero/1000000)+" Millones "+ nletra(numero%1000000);
            }
        }
        else
        {
        // Aqui identifico si lleva Miles
                if ((numero/1000)>0)
                {
                    
                    if ((numero/1000)==1)
                    {
                        cadena = " Mil "+nletra(numero%1000);
                    }
                    else
                    {
                         cadena= nletra(numero/1000)+" Mil "+ nletra(numero%1000);
                    }
                }
                else
                {
                // Aqui identifico si lleva cientos
                    if ((numero/100)>0)
                    {
                        if ((numero/100)==1 )
                        {
                            if ((numero%100)==0)
                            {
                                cadena=" Cien ";
                            }
                            else
                            {
                                cadena=" Ciento " + nletra(numero%100);
                            }
                        }
                        else
                        {
                            if ((numero/100)==5 )
                            {
                                    cadena=" Quinientos " + nletra(numero%100);
                            }
                            else
                            {
                                if ((numero/100)==9 )
                                {
                                        cadena=" Novecientos " + nletra(numero%100);
                                }
                                else
                                {
                                        cadena= nletra(numero/100)+"cientos"+nletra(numero%100);
                                }
                            }
                        }
                    }
                    // Aqui se identifican las Decenas
                    else
                    {
                        if ( (numero/10)>0)
                        {
                            switch(numero/10)
                                {
                                    case 1:
                                            switch(numero%10)
                                            {
                                                case 0:  cadena=" Diez "; break;
                                                case 1:  cadena=" Once "; break;
                                                case 2:  cadena=" Doce "; break;
                                                case 3:  cadena=" Trece "; break;
                                                case 4:  cadena=" Catorce "; break;
                                                case 5:  cadena=" Quince "; break;
                                                default:
                                                    cadena= " Diez y " + nletra(numero%10);break;
                                            }
                                            break;
                                    case 2:
                                            switch(numero%10)
                                            {
                                                case 0: cadena=" Veinte "; break;
                                                default:
                                                    cadena= " Veinti" + nletra(numero%10);break;
                                            }
                                            break;
                                    case 3:
                                            switch(numero%10)
                                            {
                                                case 0: cadena=" Treinta "; break;
                                                default:
                                                    cadena= " Treinta y " + nletra(numero%10);break;
                                            } break;
                                    case 4:
                                            switch(numero%10)
                                            {
                                                case 0: cadena=" Cuarenta "; break;
                                                default:
                                                    cadena= " Cuarenta y " + nletra(numero%10);break;
                                            }
                                            break;
                                    case 5:
                                            switch(numero%10)
                                            {
                                                case 0: cadena=" Cincuenta "; break;
                                                default:
                                                    cadena= " Cincuenta y " + nletra(numero%10);break;
                                            }
                                            break;
                                    case 6:
                                            switch(numero%10)
                                            {
                                                case 0: cadena=" Sesenta "; break;
                                                default:
                                                    cadena= " Sesenta y " + nletra(numero%10);break;
                                            }
                                            break;
                                    case 7:
                                            switch(numero%10)
                                            {
                                                case 0: cadena=" Setenta "; break;
                                                default:
                                                    cadena= " Setenta y " + nletra(numero%10);break;
                                            }
                                            break;
                                    case 8:
                                            switch(numero%10)
                                            {
                                                case 0: cadena=" Ochenta "; break;
                                                default:
                                                    cadena= " Ochenta y " + nletra(numero%10);break;
                                            }
                                            break;
                                    case 9:
                                            switch(numero%10)
                                            {
                                                case 0: cadena=" Noventa "; break;
                                                default:
                                                    cadena= " Noventa y " + nletra(numero%10);break;
                                            }
                                            break;
                                }
                        }
                        else
                        {
                               switch (numero)
                               {
                                   case 1: cadena= "Uno";break;
                                   case 2: cadena= "Dos";break;
                                   case 3: cadena= "Tres";break;
                                   case 4: cadena= "Cuatro";break;
                                   case 5: cadena= "Cinco";break;
                                   case 6: cadena= "Seis";break;
                                   case 7: cadena= "Siete";break;
                                   case 8: cadena= "Ocho";break;
                                   case 9: cadena= "Nueve";break;
                               }
                        }

                    }
                }

        }
        return cadena;
    
}
}
