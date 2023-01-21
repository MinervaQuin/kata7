# kata7

Este programa se encarga de filtrar por distancia o por día de la semana, y delimita la cantidad de resultados expuestos según el parámetro bin.
Por ejemplo, la búsqueda: 
  http://localhost/histogram/duration/2475/45
  Donde filtramos por la distancia del vuelo, devuelve lo siguiente:
  ![image](https://user-images.githubusercontent.com/100958927/213878442-098c5a63-7a52-4ede-9bbc-52c21761bd6d.png)

Y la búsqueda:
  http://localhost/histogram/duration/monday/45
  Donde filtramos por día de la semana devuelve:
  ![image](https://user-images.githubusercontent.com/100958927/213878480-aed3e02c-fcfb-4c7f-bca2-1918a25ccf8a.png)
  
En cualquiera de los dos casos, se muestra el parámetro que queremos acceder (duración, distancia, arrivalTime...), el filtro que le hemos aplicado 
(por distancia o por día de la semana) y el bin.
