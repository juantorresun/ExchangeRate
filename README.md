# 💱 Conversor de Moneda en Java

Proyecto de consola en **Java** que permite convertir valores entre distintas monedas utilizando una **API externa de tasas de cambio en tiempo real**.

El programa muestra un menú interactivo, solicita un monto al usuario y realiza la conversión según la opción seleccionada.

---

## 📌 Funcionalidades

* Conversión entre las siguientes monedas:

  * USD ↔ ARS (Dólar ↔ Peso argentino)
  * USD ↔ BRL (Dólar ↔ Real brasileño)
  * USD ↔ COP (Dólar ↔ Peso colombiano)
* Obtención de tasas de cambio actualizadas desde la API **ExchangeRate-API**
* Validación de opciones del menú
* Validación de montos (no permite valores negativos)
* Menú en bucle hasta que el usuario decide salir

---

## 🛠️ Tecnologías usadas

* **Java 17+** (compatible con versiones anteriores desde Java 11)
* **Gson** (para parsear JSON)
* **ExchangeRate-API**
* Aplicación de consola

---

## 📂 Estructura del proyecto

```
📁 src
 ├── Main.java        # Clase principal con el menú y la interacción
 └── Exchange.java    # Lógica de obtención de tasas y conversión
```

---

## ▶️ Cómo ejecutar el proyecto

1. Clona o descarga el repositorio
2. Asegúrate de tener Java instalado:

```bash
java -version
```

3. Agrega la librería **Gson** al proyecto
4. Compila y ejecuta:

```bash
javac Main.java Exchange.java
java Main
```

---

## 🧪 Ejemplo de uso

```
Sea bienvenido/a al Conversor de Moneda
1) Dólar → Peso argentino
2) Peso argentino → Dólar
3) Dólar → Real brasileño
4) Real brasileño → Dólar
5) Dólar → Peso colombiano
6) Peso colombiano → Dólar
7) Salir

Seleccione una opción: 5
Introduzca el valor a cambiar: 10
Resultado: 39784.50
```

---

## ⚠️ Consideraciones

* El proyecto requiere conexión a Internet
* Se utiliza una **API Key** personal (reemplázala por la tuya)
* Si la API falla, el programa muestra un mensaje de error

---

## 🚀 Posibles mejoras futuras

* Uso de `enum` para las monedas
* Cacheo de tasas de cambio para evitar múltiples llamadas a la API
* Manejo de entradas inválidas (letras en lugar de números)
* Interfaz gráfica (JavaFX o Swing)
* Historial de conversiones

---

## 👨‍💻 Autor

Proyecto desarrollado como ejercicio práctico de Java, consumo de APIs REST y buenas prácticas de programación.

---

¡Gracias por usar el Conversor de Moneda! 💸
