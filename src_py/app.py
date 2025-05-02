import metodos_ordenamiento as mO
import beach_marking as bm

if __name__ == "__main__":
    print("Funciona")

    bench = bm.Benchmarking()
    metodosO = mO.MetodosOrdenamiento()

    tamanios = [5000, 10000, 15000]

    dicc = {
        "burbuja": metodosO.sort_bubble,
        "seleccion": metodosO.sort_selection,
        "insercion": metodosO.sort_insertion,
        "shell": metodosO.sort_shell
    }

    resultados = []

    for tam in tamanios:
        arreglo_base = bench.build_arreglo(tam)
        for nombre, metodo in dicc.items():
            tiempo_resultado = bench.medir_tiempo(metodo, arreglo_base)
            tupla_resultado = (tam, nombre, tiempo_resultado)
            resultados.append(tupla_resultado)

    for tam, nombre, tiempo in resultados:
        print(f"Tamaño: {tam}, Metodos : {nombre}, Tiempo: {tiempo:.6f} segundos")



