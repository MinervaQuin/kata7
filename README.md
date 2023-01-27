# KATA 7


Este programa se encarga de filtrar por distancia o por día de la semana, y delimita la cantidad de resultados expuestos según el parámetro bin.
Por ejemplo, la búsqueda: 
  http://localhost/histogram/duration/2475/45
  Donde filtramos por la distancia del vuelo, devuelve lo siguiente:
  ![image](https://user-images.githubusercontent.com/100958927/213878683-09bf82e2-3bd6-4e58-aa4e-921dd396f21b.png)

Y la búsqueda:
  http://localhost/histogram/duration/monday/45
  Donde filtramos por día de la semana devuelve:
  ![image](https://user-images.githubusercontent.com/100958927/213878690-4a6f1045-6947-4362-b8e2-38f971de5755.png)
  
En cualquiera de los dos casos, se muestra el parámetro que queremos acceder (duración, distancia, arrivalTime...), el filtro que le hemos aplicado 
(por distancia o por día de la semana) y el bin.

Nota: Para que el programa funcione hay que copiar la base de datos flights a la carpeta fuente del proyecto, ya que al ser el tamaño superior a la cota que permite github no se ha podido subir al repositorio, y sin ella el resultado que sale es el siguiente
![image](https://user-images.githubusercontent.com/100958927/215073871-d564f33f-d357-4830-b669-a75603077733.png)
