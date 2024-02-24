"""
                                                    Documentación Interna

    Nombre del Programa: ComplementoC2.py

    Fin En Mente: Que permita el ingreso de números binarios de 8 bits, y devuelva como resultado la representación de ese número en complemento a dos. 

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
        Label(text="Bienvenido a Convertir binarios a su complemento a 2. 😎🏆").place(x=10,y=10)
        Label(text="Por favor querido usuario, ingrese un número binario de 8 bits (8 digitos) 🐱").place(x=10,y=30)
        self.entrada_numero = Entry(width=10)
        self.entrada_numero.place(x=20,y=60)

        Button(text="Generar Número",command=self.Convertir).place(x=100,y=60)

        self.showresult = Text(height=15, width=55)
        self.showresult.place(x=30,y=150)

        ###################################################################################################


    ################################# Inicio De Convertir Binario a C2 ###############################################

    def Convertir(self):
        try:

            self.numero = self.entrada_numero.get()
            tamanio = len(self.numero)

            if(tamanio == 8):
                self.vector = [0] * tamanio

                
                for i in range(len(self.numero)):
                    self.vector[i] = int(self.numero[i])


                

                #COMPLEMENTO A 1. C1.
                for i in range(tamanio):
                    if(self.vector[i] == 0):
                        self.vector[i] = 1
                    else:
                        self.vector[i] = 0

                ################################
                
                #COMPLEMENTO A 2. C2
                self.vector[-1] += 1 
                a = -1
                for i in range(tamanio):
                    if(self.vector[a] == 2):
                        self.vector[a] = 0
                        self.vector[a-1] += 1
                    
                    a -= 1
                ############################  

                self.showresult.delete("1.0",END)
                self.showresult.insert(1.0, str(self.vector))

            else:
                messagebox.showerror("Error", "Número Invalido. Debe ingresar un número de 8 bits querido usuario :(")

        except:
            messagebox.showerror("Error", "Número Invalido. Debe ingresar un número de 8 bits querido usuario :(")

        

##############################################################################################################


app().mainloop()