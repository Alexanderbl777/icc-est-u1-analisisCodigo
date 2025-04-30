import metodos_ordenamiento as mO
import random
import time

class Benchmarking:

    def __init__(self):
        print("Benchmarking instanciado")
        self.mO = mO.MetodosOrdenamiento()
        arreglo = self.build_arreglo(50000)
        
        tarea_milli = lambda: self.mO.sort_bubble(arreglo.copy())
        tarea_nano = lambda: self.mO.sort_bubble(arreglo.copy())

        tiempo_ns = self.contar_con_current_nano(tarea_nano)
        tiempo_s = self.contar_con_current_seconds(tarea_milli)

        print(f"Tiempo en nanosegundos: {tiempo_ns}")
        print(f"Tiempo en segundos: {tiempo_s}")

        burbuja = lambda: self.mO.sort_bubble(arreglo.copy())
        seleccion = lambda: self.mO.sort_seleccion(arreglo.copy())
        inserccion= lambda: self.mO.sort_Inserccion(arreglo.copy())
        print("-------------------------------------")
        tiempoB = self.contar_con_current_seconds(burbuja)
        tiempoS = self.contar_con_current_seconds(seleccion)
        tiempoI = self.contar_con_current_seconds(inserccion)
        print(f"Tiempo de burbuja mejorado: {tiempoB}")
        print(f"Tiempo de seleccion: {tiempoS}")
        print(f"Tiempo de insercccion: {tiempoI}")

    def build_arreglo(self, tamanio):
        return [random.randint(0, 100000) for _ in range(tamanio)]

    def contar_con_current_nano(self, tarea):
        inicio = time.time_ns()
        tarea()
        fin = time.time_ns()
        return fin - inicio

    def contar_con_current_seconds(self, tarea):
        inicio = time.time()
        tarea()
        fin = time.time()
        return fin - inicio
