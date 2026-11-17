![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Formativa 2 (Semana 4) – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Enzo Caramori Salazar
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Virtual - Sede Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la **Actividad Formativa de la Semana 4 (Experiencia 2: Manejando colecciones y estructuras reutilizables)** de la asignatura *Desarrollo Orientado a Objetos I*[span_2](start_span)[span_2](end_span)[span_3](start_span)[span_3](end_span). Se trata de un sistema orientado a objetos desarrollado en Java para la agencia **Llanquihue Tour**, cuyo objetivo es leer registros de tours desde un archivo de texto plano (`.txt`), instanciar objetos de dominio en una colección dinámica (`ArrayList`) y aplicar recorridos y filtros por categoría para mostrar catálogos personalizados por consola[span_4](start_span)[span_4](end_span).

El proyecto aplica separación de responsabilidades en paquetes (`model`, `data`, `ui` y `resources`), encapsulamiento estricto, lectura de archivos con `BufferedReader`, separación de cadenas mediante `.split(";")` y manejo controlado de excepciones (`IOException` y `NumberFormatException`)[span_5](start_span)[span_5](end_span).

---

### 🧱 Estructura general del proyecto
```text
📁 src/
├── data/
│   └── GestorDatos.java  # Lectura del archivo .txt, parseo de datos y carga en ArrayList
├── model/
│   └── Tour.java         # Entidad de dominio encapsulada (nombre, tipo y precio)
├── resources/
│   └── tours.txt         # Fuente de datos con registros separados por punto y coma (;)
└── ui/
    └── Main.java         # Clase principal con el método main (recorrido, filtrado y despliegue)

```

---

### ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub abriendo tu terminal y ejecutando:
   git clone https://github.com/Enzocs23-ai/LlanquihueTourApp.git

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que el SDK del proyecto esté configurado con Java 17 o superior y que la ruta src/resources/tours.txt coincida con la variable rutaArchivo en Main.java.

4. Localiza el archivo Main.java dentro del paquete ui y ejecútalo.

5. Revisa la salida generada por consola con el listado completo de tours y el catálogo filtrado por categoría (Gastronómico).

---

**Repositorio GitHub:** https://github.com/Enzocs23-ai/LlanquihueTourApp.git  
**Fecha de entrega:** [16/11/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Actividad Formativa Semana 4