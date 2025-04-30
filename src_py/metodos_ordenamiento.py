class MetodosOrdenamiento:
    def sort_bubble(self, array):
        arreglo = array.copy()
        n = len(arreglo)
        print("Burbuja")

        for i in range(n):
            for j in range(0, n - i - 1):
                if arreglo[j] > arreglo[j + 1]:
                    arreglo[j], arreglo[j + 1] = arreglo[j + 1], arreglo[j]

        return arreglo
    
    def sort_seleccion(self, array):
        arreglo = array.copy()
        n = len(arreglo)
        print("Seleccion")
        for i in range(n):
            iM= i
            for j in range(n+1, n):
                aux= arreglo[iM]
                if arreglo[j] < arreglo[iM]:
                    iM = j
            arreglo[i], arreglo[iM] = arreglo[iM], arreglo[i]

        return arreglo;

    def sort_Inserccion(self, array):
        arreglo = array.copy()
        n = len(arreglo)
        print("Inserccion")

        for i in range(1, n):
            clave = arreglo[i]
            j = i - 1
            while j >= 0 and arreglo[j] > clave:
                arreglo[j + 1] = arreglo[j]
                j -= 1
        arreglo[j + 1] = clave

        return arreglo

    def imprimir(self, mensaje):
        print("Mensaje:", mensaje)

    

