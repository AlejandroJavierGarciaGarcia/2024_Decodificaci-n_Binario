"""
                                                    Documentación Interna

    Nombre del Programa: Binarios.py

    Fin En Mente: Que permita el ingreso de números enteros, y devuelva como resultado números binarios de 8 bits. 

    Programador: Fabián Morales| 23267
                 Olivier Viau  | 23544
              Alejandro García | 23267
                

    Lenguaje: Python 3.7

    Recursos: Ninguno

    Historia de Modificaciones:
       [000]  23/02/2024   Programa Nuevo y Fin de Codificación




"""
from tkinter import *
from random import randint
from tkinter import messagebox

class app(Tk):
    def __init__(self):
        Tk.__init__(self)

        ################################# Mostrar Interfaz ###############################################
        self.geometry("800x800")
        Label(text="Bienvenido a Convertir números decimales enteros a binarios de 8 bits. 😍").place(x=10,y=10)
        Label(text="Por favor querido usuario, ingrese un número decimal entero entre 0 y 255. 🐱‍👤").place(x=10,y=30)
        self.entrada_numero = Entry(width=10)
        self.entrada_numero.place(x=20,y=60)

        Button(text="Generar Número",command=self.Convertir).place(x=100,y=60)

        self.showresult = Text(height=15, width=55)
        self.showresult.place(x=30,y=150)

        ###################################################################################################


################################# Inicio De Convertir Decimal a Binario ###############################################

    def Convertir(self):
        try:

    
            self.numero = int(self.entrada_numero.get())

            #Validando que el número se encuentre entre un número válido para una salida de 8 bits.
            if((self.numero > 0) and (self.numero <= 255)):
                binario = ""

                #Realizar la división mientras el número sea diferente a 0.
                while(self.numero > 0):
                    resto = self.numero%2

                    #Si la división no tiene resto, concatena 0 a la cadena. De lo contrario concatena 1.
                    if(resto == 0):
                        binario = "0" + binario
                    else:
                        binario = "1" + binario

                    self.numero = self.numero//2


                self.showresult.delete("1.0",END)
                self.showresult.insert(1.0, "El Número binario es: " + str(binario))

            #Válidando si el número es 0. En tal caso muestra inmediatamente 0.
            elif(self.numero == 0):
                self.showresult.delete("1.0",END)
                self.showresult.insert(1.0, "El Número binario es: 0")

            else:
                messagebox.showerror("Error", "Número Invalido. Debe ingresar un número de 0 a 255 querido usuario :()")
        except:
            messagebox.showerror("Error", "Número Invalido. Debe ingresar un número de 0 a 255 querido usuario :()")
        
            
################################# Final De Convertir Decimal a Binario ###############################################


app().mainloop()